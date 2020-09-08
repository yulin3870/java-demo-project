package day05;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * 聊天室服务端程序
 *
 * @author j36
 */
public class TabServer {
    /**
     * 服务端Socket
     */
    private ServerSocket server;
    /**
     * 服务器响应的配置文件
     */
    private TabConfig config;
    /**
     * Vector<E>端输出流的集合
     */
    private Vector<PrintWriter> allOut;

    /**
     * 消息队列
     * 作用：当每一个线程收到一个客户端发送过来的信息时
     * 我们将信息放在队列
     * 转发消息的线程h会从队列中顺序的额取出消息，做转发
     * 使用双缓冲队列
     * 在同步的基础上，可以同时允许两个线程做存取操作
     * 即：
     * 一个线程存元素时，允许另一个线程同时取元素
     * 提高了同步是的存取效率
     */
    private BlockingDeque<String> messageQueue;

    /**
     * 线程池
     */
    private ExecutorService threadPool;


    /**
     * 服务端构造方法
     * 用于初始化服务端必要的内容
     */
    public TabServer() {
        try {
            // 初始化线程池
            threadPool = Executors.newCachedThreadPool();
            // 初始化消息队列
            messageQueue = new LinkedBlockingDeque<String>();
            //初始化集合
            allOut = new Vector<PrintWriter>();

            // 读取配置文件
            config = new TabConfig("server_config.properties");
            // 用配置文件中配置的端口号创建ServerSocket
            server = new ServerSocket(config.getIntValue("port"));
        } catch (Exception e) {
            System.out.println("服务端启动失败");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TabServer server = new TabServer();
        server.start();
    }

    /**
     * 向共享集合中添加一个客户端的输出流
     */
    public synchronized void addOut(PrintWriter out) {
        allOut.add(out);
    }

    /**
     * 将给定的消息发送给所有客户端
     *
     * @param message
     */
    public synchronized void sendMessageToAllClient(String message) {
        /**
         *	在迭代集合元素时，不能对集合元素进行增删操作
         *	Vector虽然是同步的，但仅仅是对于元素增删操作
         *	可以做到同步，遍历元素使用的迭代器依然不允许
         *	在迭代过程中增删元素：
         *	所以迭代元素的操作要与增删元素的操作互斥！
         */
        for (PrintWriter writer : allOut) {
            // 注意，要使用println方法
            writer.println(message);
        }
    }

    /**
     * 将给定的输出流从集合中删除
     * 当客户端与服务器断开后，该集合中就不需要保存该客户端的输出流了
     *
     * @param out
     */
    public synchronized void removeOut(PrintWriter out) {
        allOut.remove(out);
    }

    /**
     * 启动服务器，开始接收客户端请求
     *
     * @param args
     */
    public void start() {
        try {
            /**
             * 	启动转发线程
             */
            SendMessageToAllClientHandler sendMsgHandler =
                    new SendMessageToAllClientHandler();
            Thread sendThread = new Thread(sendMsgHandler);

            /**
             * 	后台线程，当服务器停止接受客户端连接，
             * 	以及现有客户端全部断开后，转发线程就可以结束了
             */
            sendThread.setDaemon(true);
            sendThread.start();

            while (true) {
                /**
                 * 	监听端口，等待客户端连接
                 */
                Socket socket = server.accept();

                /**
                 * 	启动一个线程，用于处理该客户端的交互
                 */
                GetClientInfoHandler handler = new GetClientInfoHandler(socket);
                threadPool.execute(handler);
                //			Thread t =new Thread() ;
                //			t.start() ;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 用于处理与客户端交互的线程体
     *
     * @param args
     */
    private class GetClientInfoHandler implements Runnable {
        // 当前线程用于交互的客户端Socket
        private Socket client;

        /**
         * 构造方法，用于创建线程时将需要交互的客户端Socket传入
         */
        public GetClientInfoHandler(Socket client) {
            this.client = client;
        }

        public void run() {
            //  对于该客户端的输出流
            PrintWriter out = null;
            try {
                /**
                 *	输出一下当前客户端的IP
                 *	InrtAddress 描述的是互联网的协议中的IP
                 */
                InetAddress address = client.getInetAddress();
                System.out.println("客户端IP:" + address.getAddress());
                System.out.println("主机名：" + address.getHostAddress());

                /**
                 *	在该线程启动后，先将该客户端的输出流放入共享集合
                 */
                out = new PrintWriter(client.getOutputStream(), true);
                addOut(out);
                System.out.println("当前在线人数：" + allOut.size());

                /**
                 * 	并发运行
                 * 	循环读取客户端发送过来的信息
                 */

                InputStream in = client.getInputStream();

                /**
                 * 	将输入流包装为缓冲字符输入流
                 */
                InputStreamReader reader
                        = new InputStreamReader(in);
                BufferedReader br
                        = new BufferedReader(reader);
                String str = null;

                while (true) {
                    // 读取客户端发送过来的一行字符串
                    str = br.readLine();
                    if (str == null) {
                        throw new RuntimeException("用户数据异常");
                    }
                    //		 /**
                    //		  * 	读取到一句话后，应该转发给所有客户端
                    //		  */
                    //		 sendMessageToAllClient(str) ;

                    /**
                     *	当度曲 到一个信息后，我们将客户端发来的这个
                     *	信息放入消息队列，等待转发
                     */
                    messageQueue.offer(str);

                }
            } catch (Exception e) {
                System.out.println("客户端连接异常");
                e.printStackTrace();
            } finally {
                try {
                    /**
                     * 关闭连接前，现将该输出流从共享集合中删除
                     */
                    removeOut(out);
                    System.out.println(
                            client.getInetAddress().getHostAddress()
                                    + "离线了");
                    System.out.println("当前在线人数：" + allOut.size());
                    /**
                     * 	当交互结束，无论是否正常结束，我们都应当将连接关闭
                     * 	关闭Socket也意味着输入和输出流同时关闭
                     */
                    client.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 循环从消息队列中获取消息，并转发给所有客户端
     *
     * @author j36
     */
    private class SendMessageToAllClientHandler implements Runnable {

        public void run() {
            String str = null;
            while (true) {
                /**
                 * 	取出消息队列的对首信息
                 */
                str = messageQueue.poll();
                if (str != null) {
                    /**
                     * 	将消息转发给所有客户端
                     */
                    sendMessageToAllClient(str);
                } else {
                    /**
                     *  若队列空了，就休息一会，减少不必要的性能开销
                     */
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }

}

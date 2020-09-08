package day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

/**
 * 服务器端应用程序
 *
 * @author j36
 */
public class ActServer {
    /**
     * 创建一个集合，用于保存所有客户端的输出流
     * 这样就可以通过遍历该集合拿到所有用户的输出流，做到转发操作
     */
    Vector<PrintWriter> allOut = new Vector<PrintWriter>();
    private ServerSocket server;

    public ActServer() {
        try {
            server = new ServerSocket(8088);
        } catch (Exception e) {
            System.out.println("服务器启动失败！");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        //	实例化服务器端实例
        ActServer server = new ActServer();
        server.start();

        /**
         *  1   初始化ServerSocket
         * 	   初始化的时候要指定服务端口号
         */
        //	server.server = new ServerSocket(8088) ;

        /**
         *  2	 监听8088端口，等待客户端的链接
         *  		返回刚刚链接的客户端Socket
         */
        //	System.out.println("服务器启动了，等待客户端连接.......") ;
        //	Socket socket =  server.server.accept() ;
        //	System.out.println("一个客户端连接了") ;

        /**
         * 	通过客户端的Socket获取一个输入流，用于读取客户端
         * 	发送过来的信息
         */
        //	InputStream in = socket.getInputStream() ;

        /**
         * 	将字节输出流转换为缓冲字符输入流，用于一次读取
         * 	一行数据，这里要注意！这边读取一行字符是根据回行
         * 	判断的，所以客户端发送是要带有回行！
         */
        //	InputStreamReader reader = new InputStreamReader(in) ;
        //	BufferedReader br = new BufferedReader(reader) ;

        /**
         * 	读取客户端发送过来的一行字符串
         */
        //	String info = br.readLine() ;
        //	System.out.println("客户端说：" +info) ;


    }

    /**
     * 将一个客户端的输出流存入共享集合
     */
    public void addOut(PrintWriter writer) {
        allOut.add(writer);
    }

    /**
     * 将给定的信息发送给所有的客户端
     *
     * @param message
     */
    public void sendMessageToAllClient(String message) {
        /**
         * 	遍历每个客户端的输出流，将给定的信息发送给每一个用户
         */
        for (PrintWriter writer : allOut) {
            writer.println(message);
        }
    }

    /**
     * 开始处理与客户端的通信
     *
     * @throws Exception
     */
    public void start() {
        try {
            /**
             *  2	 监听8088端口，等待客户端的链接
             *  		返回刚刚链接的客户端Socket
             */
            System.out.println("服务器启动了，等待客户端连接.......");

            while (true) {
                Socket socket = server.accept();
                System.out.println("一个客户端连接了");
                /**
                 * 	当一个客户端连接后，将该客户端Socket交给线程
                 * 	让线程去循环读取客户端发送的信息
                 */
                GetClientInfoHandler handler = new GetClientInfoHandler(socket);
                Thread t = new Thread(handler);
                t.start();
            }

            /**
             * 	通过客户端的Socket获取一个输入流，用于读取客户端
             * 	发送过来的信息
             */
            //	InputStream in = socket.getInputStream() ;

            /**
             * 	将字节输出流转换为缓冲字符输入流，用于一次读取
             * 	一行数据，这里要注意！这边读取一行字符是根据回行
             * 	判断的，所以客户端发送是要带有回行！
             */
            //	InputStreamReader reader = new InputStreamReader(in) ;
            //	BufferedReader br = new BufferedReader(reader) ;

            /**
             * 	读取客户端发送过来的一行字符串
             */
		/*
			while(true){
				String info = br.readLine() ;
				System.out.println("客户端说：" +info) ;
			}
		*/
            /**
             * 	服务器创建一个输出流，用于给这个客户端发送信息
             */
		/*
			OutputStream out = socket.getOutputStream() ;
			PrintWriter pw = new PrintWriter(out,true) ;
			pw.println("你好阿！客户端") ;
		*/

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 服务端的内部类
     * 用于获取一个客户端发送的信息
     * 每一个线程负责一个客户端交流
     *
     * @author j36
     */
    private class GetClientInfoHandler implements Runnable {
        /**
         * 当前线程要接收的客户端的Socket
         */
        private Socket client;

        /**
         * 将指定的客户端Socket传入
         */
        public GetClientInfoHandler(Socket client) {
            this.client = client;
        }

        public void run() {
            /**
             * 	在线程中，我们通过客户端的Socket获取输入流
             * 	循环读取该客户端发送过来的信息
             */
            try {
                /**
                 * 	将该客户端的输出流存入共享数组
                 */
                PrintWriter writer =
                        new PrintWriter(client.getOutputStream(), true);
                addOut(writer);


                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(
                                client.getInputStream()
                        )
                );
                String str = null;
                while (true) {
                    str = reader.readLine();
                    //			System.out.println("客户端说："+str) ;
                    sendMessageToAllClient(str);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

    }

}

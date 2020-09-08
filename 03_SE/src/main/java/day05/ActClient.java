package day05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author j36
 */
public class ActClient {
    private Socket socket;

    public ActClient() {
        try {
            /**
             * 	实例化Socket,尝试连接指定的服务器端
             */
            socket = new Socket("localhost", 8088);// localhost
        } catch (Exception e) {
            System.out.println("链接异常！");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        ActClient client = new ActClient();
        client.start();


        /**
         * 	实例化Socket,尝试连接指定的服务器端
         */
        //client.socket = new Socket("localhost",8088) ;

        //OutputStream out = client.socket.getOutputStream() ;

        /**
         * 	将输出流转换为PrintWriter,可以方便的发送字符串
         */
        //PrintWriter pw = new PrintWriter(out,true) ;

        /**
         * 	向服务器发送信息
         */
        //pw.println("服务器！") ;// (带换行）

    }

    /**
     * 该方法用于与服务器端进行通信
     */
    public void start() {
        try {
            /**
             * 	启动线程，接收服务器发送过来的信息
             */
            GetServerInfoHandler handler =
                    new GetServerInfoHandler(socket);

            Thread t = new Thread(handler);
            t.start();

            /**
             *  通过Socket创建输出流，用于向服务器发送信息
             */
            OutputStream out = socket.getOutputStream();

            /**
             * 	将输出流转换为PrintWriter,可以方便的发送字符串
             */
            PrintWriter pw = new PrintWriter(out, true);


            /**
             *		将键盘的输入流变成缓冲字符输入流，用于读取用户输入的内容
             */
            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader SysInReader = new BufferedReader(reader);

            String str = null;
            while (true) {
                // 获取键盘输入的一行字符串
                str = SysInReader.readLine();
                /**
                 * 	向服务器发送信息
                 */
                pw.println(str);// (带换行）
            }


            /**
             * 	通过Socket获取输入流，用于读取服务器端发送的信息
             */
			/*
			InputStream in = socket.getInputStream() ;
			InputStreamReader reader = new InputStreamReader(in) ;
			BufferedReader br = new BufferedReader(reader) ;
			String info = br.readLine() ;
			System.out.println("服务器说："+info) ;
			*/


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 客户端创建的线程，用于接收服务器发送过来的信息并输出到控制台
     *
     * @author j36
     */
    public class GetServerInfoHandler implements Runnable {
        private Socket socket;

        public GetServerInfoHandler(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try {
                /**
                 * 	客户端这边通过输入流，循环读取服务器发送过来的信息
                 */
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(
                                socket.getInputStream()
                        )
                );

                String str = null;
                while (true) {
                    // 读取服务器发送过来的一条信息
                    str = reader.readLine();
                    // 输出到控制台
                    System.out.println(str);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
package day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


/**
 * 聊天室客户端程序
 *
 * @author j36
 */
public class TabClient {
    /**
     * 用于连接服务器的socket
     */
    private Socket socket;

    public TabClient() {
        try {
            /**
             * 	读取客户端配置文件
             */
            TabConfig config = new TabConfig("Client_config.properties");

            /**
             * 	创建Socket连接服务器端
             */
            socket = new Socket(
                    config.getStringValue("ip")
                    ,
                    config.getIntValue("port")
            );
            System.out.println("服务器连接成功");
        } catch (Exception e) {
            System.out.println("服务器连接失败");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TabClient client = new TabClient();
        client.start();
    }

    /**
     * 客户端开始工作
     * 其中主要的工作有两个
     * 1：启动一个线程，用于循环读取服务器发送过来的信息
     * 2：循环读取键盘输入的字符串，并发送给服务器
     */
    public void start() {
        try {
            // 1
            GetServerInfoHandler handler = new GetServerInfoHandler();
            Thread t = new Thread(handler);
            t.start();

            // 2
            Scanner scanner = new Scanner(System.in);
            /**
             * 	将对应的服务器的输出流包装为PrintWriter
             */
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            String str = null;
            while (true) {
                str = scanner.nextLine();
                out.println(str);
            }

        } catch (Exception e) {
            System.out.println("服务器连接异常");
        } finally {
            /**
             * 	若与服务器发生连接异常，应当关闭socket
             */
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 该线程用于循环读取服务器发送过来的信息并输出到控制台
     *
     * @author j36
     */

    public class GetServerInfoHandler implements Runnable {

        public void run() {
            try {
                /**
                 *
                 */
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(
                                socket.getInputStream())
                );
                String str = null;
                while (true) {
                    str = reader.readLine();
                    System.out.println(str);
                }
            } catch (Exception e) {
                System.out.println("与服务器连接异常");
                e.printStackTrace();
            }
        }
    }


}

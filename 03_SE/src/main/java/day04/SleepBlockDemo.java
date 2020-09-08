package day04;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 睡眠阻塞
 *
 * @author j36
 */
public class SleepBlockDemo {
    public static void main(String[] args) {
        /**
         * 	电子表
         * 	输出时间格式  12：23：30
         */
        Date now = null;
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        while (true) {
            now = new Date();
            System.out.println(format.format(now));
            /**
             * 	每隔一秒钟循环一次
             */
            try {
                /**
                 * 	问题1：捕获异常是为了什么
                 * 				  原因：通知当前线程正在被中断
                 *
                 * 		2：sleep是让当前线程进入阻塞，那被阻塞的是哪个线程
                 * 					当我们的程序运行时，操作系统会启动一个进程
                 * 					来运行我们的JVM，而JVM启动起来后会创建一个线程来运行当前类的main方法，
                 * 					从而执行我们的程序，这里sleep阻塞的就是这个线程
                 *
                 * 			3：循环是一秒中执行一次么？
                 * 					不是的，只能说明阻塞了1秒，阻塞结束后，当前线程会回到runnable状态，
                 * 					等待再次分配之间片段从而运行，而这段时间就是误差
                 *
                 *
                 */
                Thread.sleep(1000);
                /**
                 * 	获取当前运行的main方法的线程
                 */
                Thread current = Thread.currentThread();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}

package day04;

/**
 * wait() notify() 方法
 *
 * @author j36
 */
public class WaitAndNotifyDemo {
    // 图片是否下载完毕
    public static boolean finish = false;

    public static void main(String[] args) {
        /**
         * 	两个线程并发运行
         * 	一个线程用于下载图片
         * 	另一个用于显示图片
         * 	这里就出现一个问题，显示图片的线程应当等待下载图片的
         * 	线程将图片下载后再进行显示
         */
        // 下载图片的线程
        final Thread downLoadThread = new Thread(new Runnable() {
            public void run() {
                System.out.println("开始下载图片......");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("图片下载完毕!");
                finish = true;
                /**
                 * 	通知当前对象上等待的线程回到runnable状态
                 * 	这里的this就是downLoadThread
                 * 	而下面的displayThread就是在当前对象上等待的
                 * 	所以调用this.notify()方法会将displaythread
                 * 	解除等待阻塞，使其可以继续运行
                 */
                synchronized (this) {
                    this.notify();
                }
            }
        });

        // 显示图片的线程
        Thread displayThread = new Thread(new Runnable() {
            public void run() {
                System.out.println("等待下载图片的线程通知我显示.....");
                try {
                    /**
                     * 	当显示线程通过调用一个对象的wait()方法后，
                     * 	那么这个线程就在当前线程上等待，进入了等待阻塞
                     *
                     * 	wait blick 等待阻塞与睡眠阻塞 sleep block 的
                     * 	区别在于：
                     * 	sleep() 阻塞会在指定时间消耗完毕后自动回到runnable状态
                     * 	wait() 阻塞则不会自动回到runnable，直到调用了这个对象的notify()方法，
                     * 			当前线程才会回到runnable 状态
                     */
                    synchronized (downLoadThread) {
                        /**
                         * 	当前线程在哪个对象上进行等待，就需要获得那个对象的锁
                         */
                        downLoadThread.wait();
                    }
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                if (!finish) {
                    throw new RuntimeException("图片没有下载完毕，无法显示！");
                }
                System.out.println("开始显示图片");
            }
        });

        downLoadThread.start();
        displayThread.start();


    }
}

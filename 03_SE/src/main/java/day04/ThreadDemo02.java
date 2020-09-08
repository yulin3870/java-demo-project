package day04;

/**
 * 多线程
 *
 * @author j36
 */
public class ThreadDemo02 {
    public static void main(String[] args) {
        Thread p1 = new Person1();
        Thread p2 = new Person2();
        /**
         * 	要注意：
         * 	启动线程不能去调用run方法，而是要调用start()方法。
         * 	否则两个线程不是并发运行的了
         * 	run方法是顺序运行，执行完一步才运行下一步，所以不是并发运行
         */
        p1.start();//
        p2.start();


    }
}

/**
 * 第一个线程
 */
class Person1 extends Thread {
    /**
     * 重写run方法，在其中定义要并发运行的任务代码
     */
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("你是谁阿？" + i + "次");
        }
    }
}

class Person2 extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("我是打酱油的" + i + "次");
        }
    }
}

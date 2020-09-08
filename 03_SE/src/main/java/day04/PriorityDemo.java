package day04;

/**
 * 线程的优先级
 *
 * @author j36
 */
public class PriorityDemo {
    public static void main(String[] args) {
        Thread max = new Thread(new Runnable() {
            public void run() {
                System.out.println("max");
            }
        });

        Thread norm = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("norm");
                }
            }
        });

        Thread min = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("min");
                }
            }
        });

        /**
         * 	设置优先级
         */
        min.setPriority(Thread.MIN_PRIORITY);// 1
        norm.setPriority(Thread.NORM_PRIORITY);// 5
        max.setPriority(Thread.MAX_PRIORITY);// 10

        min.start();
        norm.start();
        max.start();

    }
}

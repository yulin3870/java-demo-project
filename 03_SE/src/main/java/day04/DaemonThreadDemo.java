package day04;

/**
 * 后台线程与前台线程
 *
 * @author j36
 */
public class DaemonThreadDemo {
    public static void main(String[] args) {

        Thread rose = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("rose:let me go!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                System.out.println(" rose:AAAAAAAAaaaaaaaa......");
                System.out.println("噗通！");
            }
        });

        Thread jack = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    System.out.println("jeck:you jump! i jump!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        });

        rose.start();

        /**
         * 	设置后台线程的方法要在该方法线程启动之前调用
         */
        jack.setDaemon(true);

        jack.start();

        System.out.println("main方法执行完了");

    }
}

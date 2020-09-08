package day04;

/**
 * 方法互斥
 *
 * @author j36
 */
public class SyncMethodDemo {
    public static void main(String[] args) {
        final Bank bank = new Bank();

        // 第一个线程
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                bank.getMoney(1000);
            }
        });
        // 第二个线程
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                bank.addMoney(2000);
            }
        });

        t1.start();
        t2.start();

    }
}

/**
 * 定义两个方法，两个方法是互斥的
 */
class Bank {
    int money = 100000;

    // 	取钱
    public synchronized void getMoney(int money) {
        System.out.println("准备取钱......");
        try {
            this.money = this.money - money;
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("取钱成功");
    }

    // 存钱
    public synchronized void addMoney(int money) {
        System.out.println("准备存钱.....");
        this.money = this.money - money;
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("存钱成功");
    }
}
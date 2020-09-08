package day02;

/**
 * 私有方法不能被继承，不能被重写
 * <p>
 * <p>
 * 被继承的方法才能被重写
 */
public class Demo13 {
    public static void main(String[] args) {
        Super1 s = new Sub1();
        s.test();
    }
}

class Super1 {
    public void test() {
        this.t();
        this.g();
    }

    public void t() {
        System.out.println("Super.t()");
    }

    private void g() {
        System.out.println("Super.g()");
    }
}

class Sub1 extends Super1 {
    public void t() {
        System.out.println("Sub.t()");
    }

    public void g() {
        System.out.println("Sub.g()");
    }

}

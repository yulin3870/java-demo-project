package day02;

/**
 * 继承时候，对象的创建过程
 */
public class Demo05 {
    public static void main(String[] args) {
        Coo c = new Coo();
        System.out.println(c.a + " , " + c.b + " , " + c.c);
    }
}

class Aoo {
    int a = 5;

    public Aoo() {
        //属性初始化
        System.out.println(a);
        a = 9;
        System.out.println(a);
    }
}

class Boo extends Aoo {
    int b = 6;

    public Boo() {
        super();// 属性初始化
        System.out.println(a + " , " + b);
        a = 7;
        b = 1;
        System.out.println(a + " , " + b);
    }
}

class Coo extends Boo {
    int c = 8;

    public Coo() {
        super();// 属性初始化
        System.out.println(a + " , " + b + " , " + c);
        a = 3;
        b = 4;
        c = 5;
        System.out.println(a + " , " + b + " , " + c);
    }
}
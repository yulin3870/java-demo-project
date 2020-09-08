package day02;

import day02.sub.Koo;

public class Demo12 {
    public static void main(String[] args) {
        Foo foo = new Foo();
        System.out.println(foo.a);
        System.out.println(foo.b);
        System.out.println(foo.c);
        //System.out.println(foo.d);//编译错误, d不可见!
        System.out.println(foo.getD());//属性访问方法

        Koo k = new Koo();
        System.out.println(k.a);
        //System.out.println(k.b);//编译错误,  不可见!
        //System.out.println(k.c);//编译错误,  不可见!
        //System.out.println(k.d);//编译错误,  不可见!
    }
}

class Goo extends day02.sub.Koo {
    public void test() {
        System.out.println(super.a);
        System.out.println(super.b);//子类中可以访问
        //System.out.println(super.c);//编译错误,  不可见!
        //System.out.println(super.d);//编译错误,  不可见!
    }
}

class Foo {
    public int a = 1;
    protected int b = 2;
    int c = 3;//默认访问修饰
    private int d = 4;

    public int getD() {
        return d;
    }
}




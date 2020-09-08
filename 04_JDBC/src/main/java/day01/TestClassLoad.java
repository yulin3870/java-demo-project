package day01;

public class TestClassLoad {
    public static void main(String[] args) throws Exception {
        // 把Foo类装载到内存中(方法区) [会执行静态块]
        // 创建一个对象(堆)
        // Foo foo = new Foo();

        // 把Foo类装载到内存中(方法区) [会执行静态块]
        Class.forName("day01.Foo");
    }
}

class Foo {
    static {
        System.out.println("Load...");
    }

    Foo() {
        System.out.println("Foo()...");
    }
}


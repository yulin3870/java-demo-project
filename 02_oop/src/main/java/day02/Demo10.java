package day02;

public class Demo10 {
    public static void main(String[] args) {
        Tal a = new Tal(); // Animal 对象
        Tal b = new Dog(); // Dog 对象

        a.move();// 执行 Animal 类的方法
        b.move();//执行 Dog 类的方法
        // b.bark(); //编译错误，因为b的引用类型Tal没有bark方法
    }
}

class Tal {
    public void move() {
        System.out.println("动物可以移动");
    }
}

class Dog extends Tal {
    public void move() {
        super.move(); // 应用super类的方法
        System.out.println("狗可以跑和走");
    }

    public void bark() {
        System.out.println("狗可以吠叫");
    }
}

// 在上面的例子中可以看到，尽管 b 属于 Tal 类型，但是它运行的是 Dog 类的 move方法。
// 这是由于在编译阶段，只是检查参数的引用类型。
// 然而在运行时，Java 虚拟机(JVM)指定对象的类型并且运行该对象的方法。
// 因此在上面的例子中，之所以能编译成功，是因为 Tal 类中存在 move 方法，然而运行时，运行的是特定对象的方法。
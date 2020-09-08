package day03;

/**
 * 抽象类
 * 1) 代表逻辑上的抽象概念
 * 语法
 * 2) 使用abstract 声明类
 * 3) 抽象类不能直接实例化(不能使用new创建对象)
 * 4) 抽象类可以保护抽象方法, 使用abstract声明的方法
 * 抽象方法不能有方法体.
 * 5) 抽象类只能被继承, 在具体子类中必须实现全部抽象方法.
 * 6) 抽象类可以定义变量, 引用具体子类的实例(对象)
 */
public class Demo03 {
    public static void main(String[] args) {
        //Shape s = new Shape();//编译错误, 不能直接实例化
        Shape s = new Circle(3, 4, 5);
        s.down();
        System.out.println(s.contains(3, 4));//true
    }
}

abstract class Shape {//抽象的图形
    int x;
    int y;

    public abstract boolean contains(int x, int y);//包含

    public void down() {
        y++;
    }
}

class Circle extends Shape {
    int r;

    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public boolean contains(int x, int y) {
        int a = this.x - x;
        int b = this.y - y;
        return Math.sqrt(a * a + b * b) <= r;
    }
}

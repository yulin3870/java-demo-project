package day02;


/**
 * 子类在构造器中一定调用父类构造器
 * <p>
 * super() 只能在子类构造器中使用
 * super() 只能写在子类构造器的第一行
 * 也就是super() 前不能有其他的语句！
 */
public class Demo04 {
    public static void main(String[] args) {
        new Yoo();//Xoo(int)
    }
}

class Xoo {
    public Xoo(int a) {
        System.out.println("Xoo(int)");
    }
}

//class Yoo extends Xoo{} //编译错误，子类不能默认调用super()
class Yoo extends Xoo {
    //	public Yoo(){} //编译错误，子类不能默认调用super()
    public Yoo() {
        super(8);// 在子类构造器中使用super(int) 调用父类构造器
    }
}
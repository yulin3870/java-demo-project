package day02;

/**
 * final 方法不能被重写了.
 */
public class Demo06 {
    public static void main(String[] args) {

    }
}

class Xoo {
    final void test() {
    }
}

class Yoo extends Xoo {
    //void test(){}//编译错误, 不能重写final方法.
}





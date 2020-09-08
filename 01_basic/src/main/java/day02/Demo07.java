package day02;

/**
 * final的变量
 * 1) 只能初始化(第一次赋值), 不能再修改.
 */
public class Demo07 {
    public static void main(String[] args) {
        int a;
        final int b;
        a = 1;//初始化, 第一次赋值
        b = 8;//初始化, 第一次赋值
        System.out.println(b);
        //输出: A.编译错误 B.运行异常 C.b D.8
        a = 9;
        //b = 10;//编译错误!
        test(4, 5);
    }

    public static void test(int a, final int b) {
        a = 2;
        //b = 3;//编译错误!
    }
}




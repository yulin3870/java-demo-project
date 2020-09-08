package day03;

/**
 * 取余运算 %
 * 1) 负数的余数是负数或0
 * 2）整数方向，余数是周期函数
 * 3）取余运算计算用于处理周期性现象
 */
public class Demo02 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = a % b;//5/2 得2余1
        System.out.println(c);//1

        System.out.println(-4 % 3);// -4/3 得-1余－1
        System.out.println(-3 % 3);// 0
        System.out.println(-2 % 3);// -2/3 得0余－2
        System.out.println(-1 % 3);// -1/3 得0余－1
        System.out.println(0 % 3);// 0/3 得0余0
        System.out.println(1 % 3);// 1
        System.out.println(2 % 3);// 2
        System.out.println(3 % 3);// 0
        System.out.println(4 % 3);// 1
        System.out.println(5 % 3);// 2
        System.out.println(6 % 3);// 0
        System.out.println(7 % 3);// 1
        System.out.println(8 % 3);// 2
    }
}

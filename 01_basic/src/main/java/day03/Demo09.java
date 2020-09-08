package day03;

/**
 * + 是Java中唯一的“重载”的运算符，数学加法和字符串连接
 * <p>
 * 重载：名称一样不同的功能。
 * + 是重载的运算符：数学加，字符串连接 两种功能。
 */
public class Demo09 {
    public static void main(String[] args) {
        System.out.println('1' + 1);//50
        System.out.println("1" + 1);//"11"

        System.out.println(1 + 2 + 3 + "abc");//6abc
        System.out.println('1' + '2' + '3' + "abc");//150abc
        System.out.println("1" + "2" + "3" + "abc");//123abc

        int a = 1;
        int b = 2;
        System.out.println(a + "," + b);
        System.out.println(a + ',' + b);
    }
}

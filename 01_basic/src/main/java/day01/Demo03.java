package day01;

/**
 * 直接量：就是直接写出的数字
 * int i = 5;
 * 中i是变量，而5是直接量（直接写出的数）
 * 0xffff;
 * Java 中整数字面量（直接量）默认都是整数。
 */
public class Demo03 {
    public static void main(String[] args) {
        int i = 5;
        //i = 20000000000;//编译错误，直接量超出int范围了
        //long l = 20000000000; //编译错误，直接量超出int范围了
        long l = 20000000000L;//以L后缀的是long类型字面量
        long now = System.currentTimeMillis();// 返回以毫秒为单位的当前时间
        System.out.println(now);
        long year = now / 1000 / 60 / 60 / 24 / 365 + 1970;
        System.out.println(year);//2013
        long max = 0x7fffffffffffffffL;//long时间耗尽的时刻！
        year = max / 1000 / 60 / 60 / 24 / 365 + 1970;
        System.out.println(year);

        int m = 0x7fffffff;
        m = m + 8;
        System.out.println(m);

    }
}







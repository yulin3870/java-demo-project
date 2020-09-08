package day03;

import java.util.Scanner;

/**
 * 闰年规定
 * 注：闰年的判断公式为：
 * 1.年份能被4整除，且不能被100整除的是闰年。
 * 2.  年份能被400整除的是闰年。
 */
public class Demo11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year;
        System.out.print("输入年份：");
        year = in.nextInt();//2000
        //   2000%4==0 && !(2000%100==0)
        //     true    && ! true
        //          false                 || 2000%400 == 0
        //          false                 || true
        if ((year % 4 == 0 && !(year % 100 == 0)) || (year % 400 == 0)) {
            System.out.println(year + "是闰年");
        }
    }
}







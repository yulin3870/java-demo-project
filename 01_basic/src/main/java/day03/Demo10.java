package day03;

import java.util.Scanner;

/**
 * 计算3个数据中最大的。
 * 已知：  a   b   c
 * max
 * max
 */
public class Demo10 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner console = new Scanner(System.in);
        System.out.print("输入3个数(a b c)：");
        a = console.nextInt();//连续读取空格隔开的3个数
        b = console.nextInt();
        c = console.nextInt();
        int max;
        max = a > b ? a : b;
        max = max > c ? max : c;
        System.out.println("最大数:" + max);
    }
}




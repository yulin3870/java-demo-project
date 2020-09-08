package day01;

import java.util.Scanner;

/**
 * s = g * t * t / 2
 * => 2*s = g*t*t
 * => (2*s)/g = t * t;
 * => Math.sqrt((2*s)/g) = t
 */
public class Demo05 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("输入距离：");
        double t, s, g;
        g = 9.8;
        //s = 10 * 3;
        s = console.nextDouble(); //从控制台读取下一个Double
        t = Math.sqrt((2 * s) / g);
        System.out.println("时间(秒)：" + t);
    }

}

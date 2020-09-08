package day01;

import java.util.Random;

public class Demo09 {
    public static void main(String[] args) {
        char c;
        c = 'A' + 1;
        System.out.println(c);//B
        c = 'A' + 2;
        System.out.println(c);//C
        c = 'A' + 3;
        System.out.println(c);//D

        Random random = new Random();
        int n = random.nextInt(26);//[0,26)
        c = (char) ('A' + n);//计算生成 A~Z 的随机字符
        System.out.println(c);
    }
}

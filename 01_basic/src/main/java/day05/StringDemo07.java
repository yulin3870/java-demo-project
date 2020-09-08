package day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//使用 BufferedReader 在控制台读取字符
public class StringDemo07 {
    public static void main(String args[]) throws IOException {
        char c;
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        // 读取字符
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');

        // 使用 System.in 创建 BufferedReader
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do {
            str = br2.readLine();
            System.out.println(str);
        } while (!str.equals("end"));
    }
}

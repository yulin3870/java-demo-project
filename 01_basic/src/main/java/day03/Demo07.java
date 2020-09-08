package day03;

import java.util.Scanner;

/**
 * 条件运算符
 * 根据查询结果数量和每页显示数量，计算显示页数
 */
public class Demo07 {
    public static void main(String[] srgs) {
        Scanner console = new Scanner(System.in);
        System.out.println("输入查询行数：");
        int rows = console.nextInt();//查询结果数量，行数  66
        console.close();
        int size = 10;//页面大小，即使每个页面显示的行数  10
        int pages;//显示页数
        pages = rows % size == 0 ? rows / size : rows / size + 1;
        System.out.println("查询结果页数：" + pages);

    }

}

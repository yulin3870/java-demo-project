package day04;

import java.util.Scanner;

/**
 * 找到3个数中的最大值 
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner in = new Scanner(System.in);
		System.out.print("输入3个数：");
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		int max;
		if(a>b)  
			max = a; //if 语句块中只有一行代码时候，可以省略{}
		else
			max = b;
		
		if(c>max)
			max=c;
		System.out.println("最大值:"+max);
	}
}






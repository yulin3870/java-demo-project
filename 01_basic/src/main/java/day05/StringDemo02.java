package day05;

import java.util.Scanner;
/**
 * String API 对正则表达式的支持  
 * name.matches("正则表达式");
 * 将一个字符串与正则表达式进行匹配, 
 * 如果匹配成功就返回true, 否则返回false
 */
public class StringDemo02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("输入用户名:");
		String name = in.nextLine();
		// 斜线需要使用转义字符书写!
		boolean pass = name.matches("^\\w{8,10}$");
		if(! pass){
			System.out.println("用户名格式错误");
		}
	}
}

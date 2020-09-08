package day04;

import java.util.Scanner;

/**
 * 验证用户输入 
 * 
 */
public class Demo13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int score = -1;
		//for(;score <0 || score>100;){
		while(score <0 || score>100){
		  System.out.print("输入分数：");
			score = in.nextInt(); //67
		}
		System.out.println("输入的分数："+score); 
		//分数->级别
	}
}








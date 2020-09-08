package day04;

import java.util.Scanner;

/**
 * 个人所得税计算 
 */
public class Demo03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("输入税前薪资：");
		double salary = in.nextDouble();// 薪水，税前薪资
		double payTax;// 应税薪资
		double tax;//税金
		double income;//税后收入
		payTax = salary - 3500;
		if(payTax<=0){
			tax = 0;
		}else if(payTax <= 1500){
			tax = payTax * (3D/100);
		}else if(payTax <= 4500){
			tax = payTax * (10.0/100) - 105;
		}else if(payTax <= 9000){
			tax = payTax * 0.20 - 555;
		}else if(payTax <= 35000){
			tax = payTax * 0.25 - 1005;
		}else if(payTax <= 55000){
			tax = payTax * 0.30 - 2755;
		}else if(payTax <= 80000){
			tax = payTax * 0.35 - 5505;
		}else{
			tax = payTax * 0.45 - 13505;
		}
		income = salary - tax;
		System.out.println(income); 
	}
}

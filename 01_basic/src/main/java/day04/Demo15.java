package day04;
/**
 * do ... while 循环结构
 * 
 * 语法：
 *   do{
 *     //循环体(1)
 *   }while(循环条件(2));
 * 执行流程
 *   [(1)->(2)]-true->[(1)-(2)]-true->[(1)->(2)]-false->结束
 * 
 * 特点：在循环体结束以后检查循环是否需要继续执行。
 * 
 * 案例：将一个整数数字进行翻转
 */
public class Demo15 {
	public static void main(String[] args) {
		int num = 3278;
		int sum = 0;
		
		do{
			int last = num%10;
			sum = sum*10+last;
			num /= 10;
		}while(num != 0);
		
		System.out.println(sum); 
	}
}










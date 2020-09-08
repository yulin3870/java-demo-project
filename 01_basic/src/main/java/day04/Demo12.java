package day04;
/**
 * 将输入的一个整数倒转
 * 如: num = 2345 则结果是：5432 
 */
public class Demo12 {
	public static void main(String[] args) {
//		int num=2345;
//		int sum=0;
//		int last;
//		
//		last = num%10;//5
//		sum = sum*10+last;
//		num /= 10;//234
//		
//		last = num%10;//4
//		sum = sum*10+last;
//		num /= 10;//23
//		
//		last = num%10;//3
//		sum = sum*10+last;
//		num /= 10;//2
//		
//		last = num%10;//2
//		sum = sum*10+last;
//		num /= 10;//0
//		
//		//num = 0 时候结束循环！
		
		int num=2345;
		int sum=0;
		int last;
		
		for(;;){
			last = num%10;
			sum = sum*10+last;
			num /= 10;
			if(num==0){
				break;
			}
		}
		System.out.println(sum); 
	}
}










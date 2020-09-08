package day04;
/**
 * sum = 9+99+999+9999+...+99999999
 * 
 * num=  9  99 999 9999
 * num=num*10+9
 * i =   0  1  2 
 * sum+=num
 */
public class Demo09 {
	public static void main(String[] args) {
		long sum=0;
		long num=0;
		for(int i=0; i<5; i++){
			// i=0 1 2 3 4  5次循环
			num = num*10 + 9;
			sum += num;
			//跟踪语句，跟踪软件运行期间，变量的值
			System.out.println(i+","+num+","+sum); 
		}
		System.out.println(sum); 
	}
}



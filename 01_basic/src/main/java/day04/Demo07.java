package day04;
/**
 * 计算阶乘 
 * sum = 1*2*3*...*20
 */
public class Demo07 {
	public static void main(String[] args) {
		long s=1;
		for(long i=1; i<=20; i++){
			s*=i;
		}
		System.out.println(s); 
		
		
		int x = 1;
		for(int i=1; i<=20; i++){
			x*=i;
		}
		System.out.println(x);
	
	}
}

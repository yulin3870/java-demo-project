package day04;
/**
 * 累加 1+2+...+1000 
 * i = 1 2 3 ... 10000
 * sum += i
 */
public class Demo06 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=10000 ; i++){
			// i = 1 2 3 ... 10000 
			sum += i;
		}
		System.out.println(sum); 
		System.out.println((10000+1)*10000/2); 
	}
}

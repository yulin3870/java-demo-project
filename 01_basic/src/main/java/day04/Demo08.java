package day04;
/**
 * 求π：π=4*(1-1/3+1/5-1/7+......)
 *  PI=4*((1/1-1/3) +  (1/5-1/7) + (1/9-1/11)....)
 *        (1/i-1/(i+2))  (1/i-1/(i+2))
 *  i       1             5           9
 *  pi = 4*(sum+=(1/i-1/(i+2)))
 */
public class Demo08 {
	public static void main(String[] args) {
		double sum=0;
		for(long i=1; i<2000000000; i += 4){
			sum += 1D/i-1.0/(i+2); 
		}
		double pi = sum*4;
		System.out.println(pi);
	}
}

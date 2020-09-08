package day04;
/**
 * 打印出 1000 以内的所有质数 
 *
 */
public class Demo11 {
	public static void main(String[] args) {
	 //方案1 
		for(int num=2; num<=1000; num++){
			//num = 2 3 4 ... 1000
			boolean isPrime = true;
			//int num = 53;
			for(int i=2; i<=num/2; i++){
				if(num % i==0){
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				System.out.println(num+"是质数");
			}
		}
		//方案2
		nextNum:for(int num=2; num<=1000; num++){
			for(int i=2; i<=num/2; i++){
				if(num % i==0){ //如果有约数就取下一个num
					continue nextNum;
				}
			}
			System.out.println("找到质数："+num); 
		}
	}
}

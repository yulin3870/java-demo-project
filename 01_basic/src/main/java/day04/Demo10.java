package day04;
/**
 * 判断一个数num是否是质数
 * i 从2到num/2 逐一比较 i是否是num的约数（整除）
 * 如果找到任何一个约数，这个数就不是质数。
 *
 */
public class Demo10 {
	public static void main(String[] args) {
		boolean isPrime = true;//isPrime 是质数
		int num = 53; // num = 2 3 4 5 ... 1000 
		for(int i=2; i<=num/2; i++){
			if(num%i==0){//如果整除，i就是num的约数
				isPrime=false;
				break;
			}
		}
		if(isPrime){
			System.out.println(num+"是质数");
		}else{
			System.out.println(num+"不是质数");
		}
	}

}

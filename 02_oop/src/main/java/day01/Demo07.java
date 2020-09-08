package day01;
/**
 * 不要进行发散递归! 
 * f(n) = f(n-1) + f(n-2) && f(1)=1, f(2)=1
 */
public class Demo07 {
	public static void main(String[] args) {
		System.out.println(f(5));
		System.out.println(f1(5));
		System.out.println(f(50));
		System.out.println(f1(50));
	}
	public static long f1(long n){
		if(n==1 || n==2){
			return 1;
		}
		return f1(n-1)+f1(n-2);
	}
	public static long f(int n){
		long f1, f2, fn;
		f1 = f2 = fn = 1;
		for(int i=3; i<=n; i++){
			fn = f1+f2; f1=f2; f2=fn;
		}
		return fn;
	}
}

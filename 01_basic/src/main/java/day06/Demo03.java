package day06;
/**
 * 菲波纳且
 * 数列
 *  1  1  2  3  5  8  13  21  ...
 *  1  2  3  4  5  6  7   8   ...
 *  
 *  f(n)/f(n+1) = 0.618 
 * 
 * 计算 第n项
 * 1) 功能:计算菲波纳切数列的n项
 * 2) 功能实现: n项 是 前两项的和 推理 从第一项加到n项
 * 功能分析:
 *     1  1  2  3  5  8  13  21  ... 
 *     1  2  3  4  5  6  7   8   ...
 *                           n
 *    f1+f2=fn
 *       f1+f2=fn
 */
public class Demo03 {
	public static void main(String[] args) {
		System.out.println(f(8));
		System.out.println((double)f(50)/f(51)); 
	}
	public static long f(int n){
		long f1 = 1;
		long f2 = 1;
		long fn = 1;
		
		for(int i=3; i<=n; i++){
			fn = f1+f2;	
			f1 = f2; 
			f2 = fn;
		}
		return fn;
	}
}






package day01;
/**
 * 递归:
 * 
 * 讲故事()
 *  1)从前有座山
 *  2)山上有坐庙
 *  3)庙里的和尚在:讲故事()
 *    1)从前有座山
 *  	2)山上有坐庙
 *  	3)庙里的和尚在: 讲故事()
 *      ...
 *  f(n) = 1+2+...+n = f(n-1)+n 且 f(1)=1
 *  即:
 *  f(n) = f(n-1)+n 且 f(1)=1
 *  
 * 1) 优点,解决问题简洁,只要知道第一层,就可以解决全部问题
 * 2) 要注意给出适当的结束条件
 * 3) 不要进行太深的递归, 否则会出现 栈溢出错误
 * 4) 不要进行发散递归!
 *  
 */
public class Demo06 {
	public static void main(String[] args) {
		int n=5;
		int y = f(n);
		System.out.println(y);
	}
	public static int f(int n){
		if(n==1){
			return 1;
		}
		return n + f(n-1);
	}
}







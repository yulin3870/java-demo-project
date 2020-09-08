package day04;
/**
 * while 循环
 * 语法
 *   while(循环条件(1)){
 *     //循环体（2）
 *   } 
 * 执行流程：
 *   [(1)-true->(2)]->[(1)-true->(2)]->(1)-false->结束
 *   
 * 案例：判断一个数是否是“水仙花数”
 *    水仙花数：3位自幂数，是一个3位并且各个数字的3次方的和
 *    与这个数相等
 *    153 = 1*1*1 + 5*5*5 + 3*3*3
 *        = 1 + 125 + 27
 *        = 153
 */
public class Demo14 {
	public static void main(String[] args) {
		for(int n=153; n<=999; n++){
			//int n = 153;// n = 100 101 ... 999 
			int num = n;
			int sum = 0;
			while(num!=0){
				int last = num%10;
				sum += last * last * last;
				num /= 10;
			}
			if(sum == n){
				System.out.println(n+"是水仙花数！");
			}
		}
	}
}








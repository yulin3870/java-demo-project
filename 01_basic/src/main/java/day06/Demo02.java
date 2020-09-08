package day06;
/**
 * 数组的“迭代” 
 *  迭代：是指将数组元素逐一处理一遍。遍历==迭代
 *  数组长度是有限的，使用for迭代
 */
public class Demo02 {
	public static void main(String[] args) {
		//数组的迭代：
		int[] ary = {6,7,8,9,4,3,2,1};
		//数组下标：0 1 2 3 4 5 6 7
		//for i = 0 1 2 3 4 5 6 7
		for(int i=0; i<ary.length; i++){//i = index 序号，下标
			//i = 0 1 2 3 4 5 6 7 
			//ary[i] 代表每个数组元素
			int t = ary[i];// 6 7 8 9 ... 
			//t 就是每个数组元素的值
			System.out.println(t); //打印了每个数组元素
		}
		
	}
}











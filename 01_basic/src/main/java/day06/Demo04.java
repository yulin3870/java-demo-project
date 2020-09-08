package day06;

import java.util.Arrays;

/**
 * Arrays 集合的工具类
 *  包含了很多实现好的算法方法
 */
public class Demo04 {
	public static void main(String[] args) {
		String[] names = {"Tom","Andy","John","Jerry"};
		//Arrays.toString() 将数组的元素连接为一个字符串.
		String str = Arrays.toString(names);
		System.out.println(str); 
		//Arrays.toString()是可以便捷的输出数组内容
		System.out.println(Arrays.toString(names));
		//API 好处就是简化代码!
		
		//比较两个数组是否相等
		char[] answer = {'B','C'};//标准答案
		char[] in1 = {'A','B'};
		char[] in2 = {'B','C'};
		System.out.println(Arrays.equals(answer, in1)); //false
		System.out.println(Arrays.equals(answer, in2));//ture
	}
}





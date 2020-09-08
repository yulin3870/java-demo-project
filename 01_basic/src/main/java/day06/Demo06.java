package day06;

import java.util.Arrays;

/**
 * 二分查找
 *   
 *    Tom, Andy, Jerry, John, Wang
 *     0    1     2      3     4
 *     
 *     
 *     Tom
 *      
 *     
 *    Andy, Jerry, John, Tom, Wang 
 *     0    1     2      3     4
 *   
 *    Tom
 *  
 * 1) 在未排序的数组上使用二分查找结果不稳定.
 * 2) 必须在排序的数组上使用二分查找!
 * 3) 二分查找结果是元素的位置, 如果返回负数表示没有找到
 */
public class Demo06 {
	public static void main(String[] args) {
		String[] names = {"Tom", "Andy", "Jerry",
				"John", "Wang"};
		int index;
		index = Arrays.binarySearch(names,	"Jerry");
		System.out.println(index);//2
		index = Arrays.binarySearch(names,	"Tom");
		System.out.println(index);//负数
		//以上的查找结果不确定!
		Arrays.sort(names);
		System.out.println(Arrays.toString(names)); 
		index = Arrays.binarySearch(names,	"Andy");
		System.out.println(index);//0
		index = Arrays.binarySearch(names,	"Tom");
		System.out.println(index);//3
		index = Arrays.binarySearch(names,	"Lee");
		System.out.println(index);//负数
		//以上查找是稳定的结果
	}
}







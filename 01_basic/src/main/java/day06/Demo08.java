package day06;

import java.util.Arrays;

/**
 * 数组的扩容
 * 1) 数组长度是不可改变的
 * 2) 数组变量可以重新赋值引用不同的数组
 * 3) 利用更换数组可以实现数组的扩容 
 */
public class Demo08 {
	public static void main(String[] args) {
		int[] ary1 = {4,5,6};
		System.out.println(Arrays.toString(ary1));
		ary1 = new int[]{4,5,6,7};
		System.out.println(Arrays.toString(ary1));
		
		//扩容算法
		ary1=Arrays.copyOf(ary1, ary1.length+1);
		System.out.println(Arrays.toString(ary1));
		//追加元素 8 
		ary1[ary1.length-1] = 8;
		System.out.println(Arrays.toString(ary1));
		System.out.println("aA"+1); 
	}
}










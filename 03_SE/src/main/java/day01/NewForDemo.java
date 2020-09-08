package day01;

import java.util.ArrayList;
import java.util.List;

/**
 * 	新循环 用来便利集合或数组
 * 
 */
public class NewForDemo {
	public static void main(String[] args){
		int[] array = {1,2,3,4,5,6,7,8,} ;
		for(int i = 0 ; i < array.length ; i ++){
			int num = array[i] ;
			System.out.println(num+1) ;// 为每个元素 ＋1 后输出
		}
	// new for
		for(int num : array){
			System.out.println(num+1) ;
		}
		
		/**
		 * 
		 *  	遍历集合
		 * 
		 */
		
		List<String> list = new ArrayList<String>() ;
		list.add("一") ;
		list.add("二") ;
		list.add("三") ;
		list.add("四") ;
		list.add("五") ;
		
		for(int i = 0 ; i < list.size() ; i++){
			String str = list.get(i) ;
			System.out.println("第" + (i+1) + "项:" + str) ;
		}
		
		/**
		 * 新循环是使用迭代器形式实现的
		 * 所有要注意！在新循环中不要通过集合删除元素！
		 */
		
		for(String str : list){
			System.out.println(str) ;
	//   list.remove(str);//报错
		}		
	}
}

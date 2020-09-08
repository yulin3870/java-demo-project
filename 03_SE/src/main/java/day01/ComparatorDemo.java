package day01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
	private static final Comparator<? super String> MyComparator = null;

	public static void main(String[] args){
		List<String>	list = new ArrayList<String>() ;
		list.add("able") ;
		list.add("adam") ;
		list.add("marry") ;
		list.add("BOSS") ;
		list.add("killre") ;
		list.add("TOM") ;
		System.out.println(list) ;
	
	/**
	 * 	使用字符串定义的比较规则进行自然排序
	 */
		
		Collections.sort(list) ;
		System.out.println(list) ;
		
		/**
		 * 	不希望使用字符串的比较规则排序，而是按照字符的多少
		 * 	进行比较后再排序
		 */
		Collections.sort(list, new MyComparator()) ;
		System.out.println(list) ;
		
		/**
		 * 
		 * 	通常我们使用匿名内部类的形式创建临时的比较规则
		 */
		
		//   简便写法
		Collections.sort(list,new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		} )  ;
		System.out.println(list) ;	
		
		/**     普通写法
		Comparator<String> comparator = new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				return o2.length() - o1.length();
			}
		} ;
		Collections.sort(list, comparator) ;
		System.out.println(list) ;	
	 */
	
	}
}	
			
		
	/**
	 * 	 自定义比较器	
	 */
class MyComparator implements Comparator<String>{
		@Override
		public int compare(String o1, String o2) {
			return o1.length() - o2.length();
		}
		
}




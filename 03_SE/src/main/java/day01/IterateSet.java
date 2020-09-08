package day01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 	Set集合是无序的，所也没有get方法
 * 	只能通过迭代器的方式获取元素
 * @author j36
 *
 */
public class IterateSet {
	public static void main(String[] args){
		Set<String> set = new HashSet<String>() ;
		set.add("one") ;
		set.add("two") ;
		set.add("three") ;
		
		// java.util.Iterator ;
		Iterator<String> it = set.iterator() ;
		while(it.hasNext()){
			String str = it.next() ;
			System.out.println(str) ;
		}
		
		// 使用新 for 循环遍历set集合
		for(String str : set){
			System.out.println(str) ;
		}
	
	
	
	
	
	
	
	}
}

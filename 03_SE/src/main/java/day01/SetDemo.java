package day01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *  	不重复集Set
 * @author j36
 *
 */
public class SetDemo {
	public static void main(String[] args){
		Set<String> set = new HashSet<String>() ;
		List<String> list  = new ArrayList<String>() ;
		
		String str = "element" ;
		
		// 向list集合中放入两次同样的元素
		list.add(str) ;
		list.add(str) ;
		
		
		// 向set集合中放入两次
		set.add(str) ;
		set.add(str) ;
		
		System.out.println(list.size()) ;
		System.out.println(set.size()) ;
		
		System.out.println(list) ;
		System.out.println(set) ;
		
		
		
	}
}

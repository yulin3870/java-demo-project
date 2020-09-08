package day01;

import java.util.HashSet;
import java.util.Set;

/**
 *  HashSet的添加元素
 * @author j36
 *
 */
public class SetDemo03 {
	public static void main(String[] args){
		Set<String> set = new HashSet<String>() ;
		
		set.add("一") ;
		set.add("二" ) ;
		set.add("三") ;
		set.add("四") ;
		set.add("五") ;
		
		System.out.println(set) ;
		
	}
}

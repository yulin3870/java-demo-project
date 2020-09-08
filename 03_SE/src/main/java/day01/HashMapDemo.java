
package day01;

import java.util.HashMap;
import java.util.Map;

/**
 * 	HashMap
 * 	根据key-value 的形式存取元素
 * @author j36
 *
 */
public class HashMapDemo {
	public static void main(String[] args){
		Map<String,Point> points = new HashMap<String,Point>() ;
		
		
		// 向 map 中存放元素
		points.put("1,2", new Point(1,2)) ;
		points.put("3,4", new Point(3,4)) ;
		points.put("5,6", new Point(5,6)) ;
		
		
		// 获取 [5,6] 这个点
		Point p = points.get("5,6") ;
		
		
		System.out.println(p.getX()+" , "+p.getY()) ;
		
	
		
		
	}
}

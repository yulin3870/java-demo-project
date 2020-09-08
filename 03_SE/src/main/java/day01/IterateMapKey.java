
package day01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *  遍历Map中所有的key
 * @author j36
 *
 */
public class IterateMapKey {
	public static void main(String[] args){
		Map<String,Integer> map = new HashMap<String,Integer>() ;
		
		// 添加5个元素
		map.put("k1",1) ;
		map.put("k2",2) ;
		map.put("k3",3) ;
		map.put("k4",4) ;
		map.put("k5",5) ;
		/**
		 * 	获取所有的key  
		 * 	因为是无序的，和Set 一样，并且不重复
		 */
		Set<String> keys = map.keySet() ;
		
		for(String key : keys){
			System.out.println("key:"+key) ;
			System.out.println("value"+map.get(key)) ;
		}
		
		/**
		 * 	使用传统for循环
		 */
		for(Iterator<String> it = keys.iterator();it.hasNext();){
			String key = it.next() ;
			System.out.println(key) ;
		}
		
	}
}

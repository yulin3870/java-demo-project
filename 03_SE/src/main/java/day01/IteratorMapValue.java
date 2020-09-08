
package day01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 	遍历Map中所有的value
 * 	这种遍历方式不是很常用
 * @author j36
 *
 */
public class IteratorMapValue {
	public static void main(String[] args){
		Map<String,Integer> map = new HashMap<String,Integer>() ;
		
		// 添加5个元素
		map.put("k1",1) ;
		map.put("k2",2) ;
		map.put("k3",3) ;
		map.put("k4",4) ;
		map.put("k5",5) ;
		/**
		 * 	返回的所有value不是存入的Set集合
		 */
		Collection<Integer> values = map.values() ;
		
		for(Integer value : values){
			System.out.println("value:"+value) ;
		}
		
		
	}
}

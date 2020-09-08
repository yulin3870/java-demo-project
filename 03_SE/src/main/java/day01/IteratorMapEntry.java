package day01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 	 遍历Map中的所有key-value
 *  
 *  Map中保存键值对是使用Entry的实例来报存的
 *  	
 *  Entry是Map的内部实例，每一个实例用于保存一组存放在Map中的键值对
 * 
 *
 */
public class IteratorMapEntry {
	public static void main(String[] args){
		Map<String,Integer> map = new HashMap<String,Integer>() ;
		
		// 添加5个元素
		map.put("k1",1) ;
		map.put("k2",2) ;
		map.put("k3",3) ;
		map.put("k4",4) ;
		map.put("k5",5) ;
		
		// java.util.Map.Entry;   Set<Entry>－－（Entry<String,Integer>）
		Set<Entry<String,Integer>> entries = map.entrySet() ;
		
		// 获取用于遍历集合的迭代器
		Iterator<Entry<String,Integer>> it = entries.iterator() ;
		
		while(it.hasNext()){
			// 遍历每一组键值对
			Entry<String,Integer> entry = it.next() ;
			
			String key = entry.getKey() ;
			int value = entry.getValue() ;
			System.out.println(key+"="+value) ;
			
		}
		
		
	
	
	}
}

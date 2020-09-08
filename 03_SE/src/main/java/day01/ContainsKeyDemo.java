package day18;

import java.util.HashMap;
import java.util.Map;

/**
 *  containsKey() 查看map中是否有给定的key
 * @author j36
 *
 */
public class ContainsKeyDemo {
	public static void main(String[] args){
		String str = "123.456.765.987.432.876.123.987.445.123" ;
		/**
		 *  统计当前字符串中，每组数字出现的次数
		 *  
		 *  思路：
		 *  	1：先将每组数字拆出，
		 *  	2：顺先将每组数字放入map
		 *  	3：放入时要先看这个数字是否作为key在map中存在了
		 *  		不存在：将数字作为key，value为1（第一次出现）
		 *  			存在：将数字作为key取出value，并累加1后再存进去
		 */
		String[] nums = str.split("\\.") ;
		System.out.println(nums.length) ;
		
		Map<String,Integer> map = new HashMap<String,Integer>() ;
		
		//   遍历
		for(String num : nums){
			// 判断当前数字是否作为key在map中存在
			if(map.containsKey(num)){
				int value = map.get(num) ;
				value = value+1 ;
				map.put(num, value) ;
				
			//	map.put(num, map.get(num)+1) ; //简便写法
				
			}else{
				map.put(num, 1) ;
			}
		}
		/**
		 * 
		 * 	{key.toString() = value.toString() , k=v, k=v }
		 */
	
	System.out.println(map) ;
	
	
	
	}
}

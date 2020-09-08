package day01;

import java.util.ArrayList;
import java.util.List;

/**
 * 取子集
 * @author Administrator
 *
 */
public class SubListDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0;i<10;i++){
			list.add(i);
		}
		System.out.println(list);//[0,1,2,3,4,5,6,7,8,9]
		
		//基本类型不能作为泛型
		List<Integer> subList = list.subList(3, 8);//含头不含尾
		System.out.println(subList);//[3,4,5,6,7]
		
		//将子集的元素扩大10倍
		for(int i = 0;i < subList.size() ;i++){
			int sub = subList.get(i);
			sub = sub * 10;
			subList.set(i, sub);
		}
		System.out.println(subList);//[30,40,50,60,70]
		//对子集的修改会影响原集合
		System.out.println(list);//[0,1,2,30,40,50,60,70,8,9]
		
	}
}







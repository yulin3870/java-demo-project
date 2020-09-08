package day01;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 	栈结构
 * 	存取遵循先进后出原则
 * 	栈有良好的历史追溯性
 * @author j36
 *
 */
public class DequeDemo {
	public static void main(String[] args){
		Deque<String> stack = new LinkedList<String>() ;
		stack.push("A") ;//向栈中“压入”元素
		stack.push("B") ;
		stack.push("C") ;
		stack.push("D") ;
		System.out.println(stack) ;//[D,C,B,A]
		
		// 获取栈首元素，但不从栈中删除
		System.out.println(stack.peek()) ;
		
		String str = null ;
		/**
		 * 
		 */
		while(stack.peek() != null){
			str = stack.pop() ;
			System.out.println(str) ;
		}
		
		
	}
}

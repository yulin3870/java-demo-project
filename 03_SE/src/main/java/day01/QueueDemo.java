package day01;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 	队列
 * 	存储一组数据，出去数据本着先进先出原则
 * LinkedList实现了队列接口
 * @author j36
 *
 */
public class QueueDemo {
	public static void main(String[] args){
		// java.util.Queue
		
		Queue<String> queue = new LinkedList<String>() ;
		
		queue.offer("A") ;
		queue.offer("B") ;
		queue.offer("C") ;
		System.out.println(queue) ;
		
		// 查看队首元素
		System.out.println(queue.peek()) ;
		
		/**
		 * 	队列的遍历是一次性的
		 * 	只有取出队首元素，才能获取队列中第二个元素 
		 */
		
		String str = null ;
		/**
		 * 	先取出队首元素并赋值给str
		 * 	之后在判断str是否等于空
		 */
		
		while((str = queue.poll()) != null){
			System.out.println(str);
	
		}
	}
}




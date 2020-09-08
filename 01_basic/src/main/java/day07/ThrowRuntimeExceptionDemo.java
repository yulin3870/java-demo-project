package day07;
/**
 * 	方法中抛出RuntimeException及其子类时
 * 	不需要在该方法声明时定义throws
 * @author Administrator
 *
 */
public class ThrowRuntimeExceptionDemo {
	public static void main(String[] args) {
		connectionDB();
	}
	
	public static void connectionDB(){
		/**
		 * 	方法中抛出RuntimeException及其子类时
		 * 	方法声明时可以不写throws
		 * RuntimeTimeException称之为非检查异常
		 * 	就是当编译的过程中发现了这类异常的抛出时,是可以编译通过的.
		 * 	但是除此之外,抛出的异常类型若不写throws或捕获的话
		 * 	编译是不同通过的.
		 * 	常见的RuntimeException的子类:
		 * 
		*	NullPointerException：	当操作一个空引用时会出现此错误。
		*	NumberFormatException： 数据格式转换出现问题时出现此异常。
		*	ClassCastException：	强制类型转换类型不匹配时出现此异常。
		*	ArrayIndexOutOfBoundsException：数组下标越界，当使用一个不存在的
		*																				数组下标时出现此异常。
		*	ArithmeticException：	数学运行错误时出现此异常
		 */
		throw new RuntimeException("出错了");
		
	}
}







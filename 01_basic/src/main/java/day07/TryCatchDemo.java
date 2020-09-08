package day07;
/**
 * 	java的异常捕获机制
 * 	try catch
 * @author j36
 *
 */
public class TryCatchDemo {
	public static void main(String[] args){
		try{
			String str = "" ;
			/**
			 * 	当jvm执行到str.length()是发现str是null
			 * 	这时候会创建一个NullPointerException实例
			 * 	并将这次的错误信息设置到这个实例中，并抛出
			 */
			System.out.println(str.length()) ;
			
			System.out.println(str.charAt(1)) ;
			
			// NumberFormatException
			int num = Integer.parseInt(str) ;
			
			/**
			 * 	捕获异常的好习惯，应该在最后一个catch中加入Exception
			 * 	这样可以保证程序不会因为没有捕获到一个未知的异常而中断
			 * 	而捕获最大的这个Exception应放在所有catch语句的最后
			 */
		
		}catch(NullPointerException e){
			
			System.out.println("这里有个空指针") ;
		
		}catch(StringIndexOutOfBoundsException e){
			
			System.out.println("字符串下标越界") ;
	
		}catch(Exception e){
			
			System.out.println("反正出现一个错误") ;
		}
	
		System.out.println("测试结束") ;
	
	}
}

package day07;
/**
 * 	finally语句块
 * @author j36
 *
 */
public class FinallyDemo {
	public static void main(String[] args){
		try{
			
			String str = "" ;
			System.out.println(str.length()) ;
		
		}catch(Exception e){
			System.out.println(e.getMessage()) ;
		
		}finally{
			// 无论try中的语句是否报错，finally语句块都会执行
			System.out.println("finally语句块中的内容") ;
		}
	
		System.out.println("结束") ;
	
	
	}
}

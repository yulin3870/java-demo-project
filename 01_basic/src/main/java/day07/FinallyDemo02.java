package day07;
/**
 * 	面试可能会问:final与finally的区别
 * @author j36
 *
 */
public class FinallyDemo02 {
	public static void main(String[] args){
		try{
			String age = "abc" ;// 报错
			System.out.println("连接数据库") ;
			System.out.println("保存年龄："+Integer.parseInt(age)) ;// 异常
			System.out.println("关闭数据库") ;// 不执行
			
		}catch(Exception e){
			System.out.println("出错了") ;
		
		}finally{
			System.out.println("关闭数据库") ;
		}
	
		System.out.println("结束") ;
	}
}

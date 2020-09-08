package day07;
/**
 * 面试题
 * @author Administrator
 *
 */
public class FinallyDemo03 {
	public static void main(String[] args) {
		System.out.println(
			test(null) + "," + test("0") + "," + test("")	
		);
		/**
		 * A:0,0,3
		 * B:1,0,2
		 * C:4,0,1
		 * D:4,4,4
		 */
	}
	
	public static int test(String str){
		try{
			return str.charAt(0)-'0';
		}catch(NullPointerException e){
			return 1;
		}catch(RuntimeException e){
			return 2;
		}catch(Exception e){
			return 3;
		}finally{
			/**
			 * finally中不要书写return
			 * 否则该方法永远返回这个return的值
			 */
			return 4;
		}
	}
}



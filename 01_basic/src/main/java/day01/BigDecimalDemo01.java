package day01;
import java.math.BigDecimal;
/**
 * 	长小数
 * 	可以描述跟精确的小数
 * 	该类不是包装类
 * java.math.BigDecimal
 *
 */
public class BigDecimalDemo01 {
	public static void main(String[] args){
		BigDecimal d1 = new BigDecimal("3.0") ;
		BigDecimal d2 = new BigDecimal("2.9") ;
		/**
		 * 	加法操作： public Decimal add(Decimal d)
		 * 	乘法操作 ：public Decimal multiply(Decimal d)
		 * 	除法操作：public Decimal divide(Decimal d)
		 */
		
		/**
		 *		 除法建议选取该方法，第二个参数
		 */
		BigDecimal d4 = d1.divide(d2,8,BigDecimal.ROUND_HALF_UP) ;
		System.out.println(d4) ;
		
		
		
		
	}
}

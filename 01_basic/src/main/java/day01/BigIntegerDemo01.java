package day01;

import java.math.BigInteger;

/**
 * 	当loog不能满足我们需要保存的整数时使用BigInteger
 * @author j36
 *
 */
public class BigIntegerDemo01 {
	public static void main(String[] args){
		BigInteger sum = BigInteger.valueOf(1) ;
		for(int i = 2 ; i <= 200 ; i++){
			//   sum = sum*i ;
			sum = sum.multiply(BigInteger.valueOf(i)) ;
		}
		System.out.println(sum) ;
	}
}

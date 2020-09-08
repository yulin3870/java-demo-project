package day03;
/**
 * 位运算 
 *           f   f    f   f    f   f    f   a 
 *    n = 11111111 11111111 11111111 11111010  
 * n<<1 = 1111111 11111111 11111111 111110100
 * 
 * 移位运算的数学意义(就是移动小数点运算!)
 *   
 *   12538. 小数点向 右移动一次 
 *   125380. 就是原数字乘以 基数(10)!
 *   如果小数点看作不动, 数字向左移动!
 * 
 * 同理 得:
 *   二进制数字左移动一次, 数学上是原数字乘以一次 基数2
 *  
 *  -6 << 1 = -12
 */
public class Demo12 {
	public static void main(String[] args) {
		int n = 0xfffffffa;
		int m = n<<1;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(m));
		m = n<<4;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(m));
		System.out.println("逻辑右移,高位补0");
		m = n>>>1;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(m));
		System.out.println("数学右移,正数补0,负数补1");
		m = n>>1;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(m));
		
		// r = 45  0~255
		// g = 128 0~255
		// b = 51  0~255
		//    int   =  r g b
		//hex color = 2d8033
		//3个颜色分量 合并为 1个彩色数值
		int r = 45; //00000000 00000000 00000000 00101101
		int g = 128;//00000000 00000000 00000000 01000000
		int b = 51; //00000000 00000000 00000000 00110011
		
		int color= (r<<16)+(g<<8)+b; 
 				        //00000000 00101101 01000000 00110011
		System.out.println(Integer.toBinaryString(color));
		System.out.println(Integer.toHexString(color));
		
//		int d1 = 192;
//		int d2 = 168;
//		int d3 = 10;
//		int d4 = 100;
//		int ip = ?// d1.d2.d3.d4
		
		n=0xfffffffa;
		System.out.println(n);//-6
		m = n<<1;
		System.out.println(m);//-12
		m = n<<2;
		System.out.println(m);//-24
		n = 7;
		m = n<<2;
		System.out.println(m);//28
		m = n>>1;//数学右移
		System.out.println(m);//3
		n = -6;
		m = n>>1;//数学右移
		System.out.println(m);//-3
		m = n>>>1;//逻辑右移
		System.out.println(m);//不满足数学规则
		
		
		
		
		
	}
}
















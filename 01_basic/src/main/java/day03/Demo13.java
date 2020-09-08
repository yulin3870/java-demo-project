package day03;

public class Demo13 {
	public static void main(String[] args) {
		int r = 45; //00000000 00000000 00000000 00101101
		int g = 128;//00000000 00000000 00000000 01000000
		int b = 51; //00000000 00000000 00000000 00110011
		
		// r<<16      00000000 00101101 00000000 00000000
		// g<<8       00000000 00000000 01000000 00000000
		// b          00000000 00000000 00000000 00110011
	  // |   ------------------------------------------
		//            00000000 00101101 01000000 00110011   
		int color= (r<<16)|(g<<8)|b; 
 				        //00000000 00101101 01000000 00110011
		System.out.println(Integer.toBinaryString(color));
		System.out.println(Integer.toHexString(color));
		
		byte x = -6;
		int i = x;//符号位扩展 
		// x =                            11111010
		// i = 11111111 11111111 11111111 11111010
		//mask 00000000 00000000 00000000 11111111  0xff
		// &  ----------------------------------------
		//     00000000 00000000 00000000 11111010 保留最后8位
		// 消去高24位1
		
		System.out.println(Integer.toHexString(i));
		System.out.println(Integer.toHexString(x)); 
		//正确输出byte的16进制形式
		System.out.println(Integer.toHexString(x & 0xff)); 
		
		
		color = 0x5280f0;
		// color  00000000 01010010 10000000 11110000
		// mask   00000000 00000000 00000000 11111111
		// & -----------------------------------------
		// blue   00000000 00000000 00000000 11110000
		int blue = color & 0xff;
		int green = (color>>>8) & 0xff;
		int red = (color>>>16) & 0xff;
		
		//经典的面试题: 如果快速的实现一个整数 * 8 (2的整数倍)
		int n = 7;
		int y = n<<3;
		System.out.println(y);//56
	
	}
}




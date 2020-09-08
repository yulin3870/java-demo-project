package day06;
/**
 * 数组的语法
 1) 数组变量的声明
 2) 数组的创建(内存分配)
 3) 数组元素的访问(读写)
 */
public class Demo01 {
	public static void main(String[] args) {
//1) 数组变量的声明
		//类型[] 变量名; 声明数组类型变量，类型可以基本类型/引用类型
		int[] ary;//声明了“int类型数组” 变量
		String[] players;//声明了“String类型数组” 变量
		//System.out.println(ary[0]);//编译错误
		ary = null;//null 空
		//System.out.println(ary[0]);//没有编译错误，运行异常
		//空指针异常，发生的原因：变量值是null，在访问成员时候
		//发生空指针异常，成员: 属性，方法，元素
		// 如上代码执行结果：A.编译错误 B.运行异常 C.null D.0
 
		int ary1[];//是用于兼容c的语法，Java基本不使用！

//2)如何创建数组: 有3种方式		
		
		//new 运算符，用于分配数组内存空间，按照数组长连续分配
		//空间，数组的元素“自动初始化”有默认值 0		
		//new 运算返回值是数组的内存首地址，赋值给数组变量
    
	//数组变量 = new 类型[长度];
		ary = new int[3]; // 第1种
		System.out.println(ary[0]);//0
//  如上代码执行结果：A.编译错误 B.运行异常 C.null D.0
		
	//直接给数组元素进行初始化，不要给长度
		ary = new int[]{4,5,6}; // 第2种
		
		//数组静态初始化：可以看做是直接给出元素的简化版！
		//静态初始化只能用于声明变量直接初始化！		
		int[] ary3 = {5,6,7}; // 第3种
		//ary = {6,7,8};//编译错误! 静态初始化数组不能用于赋值！
		
		//三种方式的区别
		
		//1) 如果只是知道长度，不知道具体元素，或者长度很大
		//   采用 new int[length]
		
		//2) 已经知道元素，元素数量不多，使用new int[]{2,3,4}
		//   便捷方便。
		
		//3) 是（2）在声明变量时候使用的简化版		
		//数组元素的自动初始化为 “零” 值
		// 0  0.0  \u0000  flase null 
		//字符 \u0000 是c语言的字符串结束符号，(int)\u0000
		
		byte[] buf = new byte[1024];//1KByte = 1024byte
		System.out.println(buf[0]);//0
		char[] chs = new char[5];
		System.out.println((int)chs[0]);//0
		String[] cards = new String[4];
		System.out.println(cards[0]);//null
		
// 3) 数组元素的访问(读写)
		
		//3.1) 使用[]运算，读写数组元素
		
		//3.2) 使用.length 属性获取数组长度
		
		//3.3) 数组下标范围 0 ~ length-1，最后元素length-1
		
		//3.4) 超范围访问数组元素，有运行异常
		
		ary = new int[]{5,6,7};
		System.out.println(ary[0]);//5
		System.out.println(ary[1]);//6
		System.out.println(ary[2]);//7
		System.out.println(ary.length);//3
		//System.out.println(ary[3]);//运行异常，数组越界访问
		ary[0]++;//写数组元素
		System.out.println(ary[0]);//6

// 4) 数组检查
		int[] aryy = new int[4];
		int[] aryy1 = aryy;
		aryy[0]++;
		System.out.println(aryy1[0]);
		//请选择执行结果: A.编译错误 B.运行异常  C.0  D.1

		int[] aryy3 = null;//空,没有数组
		int[] aryy4 = new int[]{}; //空数组, 有数组没有元素

		System.out.println(aryy4.length);
		//System.out.println(aryy3.length);//运行异常
	}
}

















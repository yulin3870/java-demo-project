package day01;

public class Demo02 {
    public static void main(String[] args) {
        int i = 234;//Java会将10进制"234" 转化为 2进制赋值到i的
        //内存中。在计算机内部，只有2进制数据
        String str = Integer.toBinaryString(i);
        System.out.println(str);
        //y = f(g(x))
        System.out.println(Integer.toBinaryString(201));
        System.out.println(Integer.toBinaryString(-10));
        System.out.println(Integer.toBinaryString(-9));
        System.out.println(Integer.toBinaryString(-8));
        System.out.println(Integer.toBinaryString(-1));
        System.out.println(Integer.toBinaryString(0));
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(10));//1010
        i = -1;//在内存中i是32个1, 是补码！
        System.out.println(Integer.toBinaryString(i));

        i = 0xffffffff;
        System.out.println(i);//-1
        int max = 0x7fffffff;
        int min = 0x80000000;
        System.out.println(max);
        System.out.println(min);
    }
}






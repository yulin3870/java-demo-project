package day01;

/**
 * 数据类型转换
 */
public class Demo11 {
    public static void main(String[] args) {
//自动数据类型转换，隐含（自动发生）数据类型转换
        int i = -2;
        long l = i;//数据类型转换, 符号位扩展：根据符号位进行填充
        // i = 11111111 11111111 11111111 11111110
        // l = 11111111 11111111 11111111 11111111 11111111 11111111 11111111 11111110
        System.out.println(Integer.toBinaryString(i));
        System.out.println(l);//-2
        System.out.println(Long.toBinaryString(l));
        // Long.toBinaryString(long l)
        System.out.println(Long.toBinaryString((long) i)); //自动转换/隐含转换
        //如何输出 byte类型的二进制内容
        byte b = -2;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString((int) b & 0xff));
        // b = 11111110
        // int 11111111 11111111 11111111 11111110
        // &   00000000 00000000 00000000 11111111   mask 面具
        //  ---------------------------------------
        //     00000000 00000000 00000000 11111110
//强制类型转换： 有风险：溢出风险和精度损失
        long x = 56;
        i = (int) x;//强制类型转换，不超int范围，没有问题
        System.out.println(i);

        x = 0x23F00000041L;
        i = (int) x;
        System.out.println(i);//65
        System.out.println(x);
        System.out.println(Long.toBinaryString(x));
        System.out.println(Integer.toBinaryString(i));
        double pi = 3.1415926535897932384;
        float f = (float) pi;
        System.out.println(f);

        // 4舍5入
        double price = 567.89;
        long p = (long) (price + 0.5);

    }
}











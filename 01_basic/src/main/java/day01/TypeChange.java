package day01;

public class TypeChange {
    public static void main(String[] args) {
        char c1 = 'a';//定义一个char类型
        int i1 = c1;//char自动类型转换为int
        System.out.println("char自动类型转换为int后的值等于" + i1);
        char c2 = 'A';//定义一个char类型
        int i2 = c2 + 1;//char 类型和 int 类型计算
        System.out.println("char类型和int计算后的值等于" + i2);

        int t1 = 123;
        byte b = (byte) t1;//强制类型转换为byte
        System.out.println("int强制类型转换为byte后的值等于" + b);
    }
}

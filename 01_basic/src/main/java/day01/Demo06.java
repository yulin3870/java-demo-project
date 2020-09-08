package day01;

public class Demo06 {
    public static void main(String[] args) {
        System.out.println(~6 + 1);//"-6"
        //"6"-> 00000000 00000000 00000000 00000110
        // ~    11111111 11111111 11111111 11111001
        // +1   11111111 11111111 11111111 11111010
        //      11111111 11111111 11111111 11111010 -> "-6"
        System.out.println(~-6 + 1);//6

        int a = 0x7fffffff;
        int b = 0x7ffffff0;
        System.out.println(a - b); //15

        float fa = a;//发生精度损失！
        float fb = b;
        System.out.println(fa - fb);//0.0

        double da = a;//double 的精度够用
        double db = b;
        System.out.println(da - db);//15.0
    }
}

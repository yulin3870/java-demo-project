package day03;

/**
 * 赋值表达式
 * 赋值表达式的值是赋值的结果
 */
public class Demo08 {
    public static void main(String[] args) {
        int a;
        System.out.println(a = 8);
        System.out.println(a);
        int b;
        b = (a = 9); //将a=9表达式结果赋值给b
        System.out.println(a + "," + b);//9,9
        a = 1;
        a = a + 2;// 简化为 a+=2 称为：复合赋值运算！
        a += 2;
        System.out.println(a);//5
        a *= 2; // a = a*2;
        System.out.println(a);//10
        System.out.println(a *= 2);//20

        int num = 562912;
        int sum = 0;
        int last = num % 10;
        System.out.println(last);//2
        sum = sum * 10 + last;

        num /= 10;//56291   num = num/10
        last = num % 10;
        System.out.println(last); //1
        sum = sum * 10 + last;

        num /= 10;//5629
        last = num % 10;
        System.out.println(last); //9
        sum = sum * 10 + last;

        num /= 10;//562
        last = num % 10;
        System.out.println(last); //2
        sum = sum * 10 + last;//2192

        num /= 10;//56
        last = num % 10;
        System.out.println(last); //6
        sum = sum * 10 + last; //21926

        num /= 10;//5
        last = num % 10;
        System.out.println(last); //5
        sum = sum * 10 + last;//219265

        System.out.println(sum);
    }
}











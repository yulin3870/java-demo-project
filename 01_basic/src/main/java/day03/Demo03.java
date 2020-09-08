package day03;

/**
 * ++ 与 -- 自增（字减）运算
 * 将变量自身增加1
 */
public class Demo03 {
    public static void main(String[] args) {
        int a = 1;
        a++;
        ++a;
        System.out.println(a);//3
        a = 1;
        int b;
        b = a++; //先执行++运算，然后执行=运算
        //a++ 运算称为后++，先取值在增加。
        //计算过程：
        // ++运算 1)先取a的值1 作为a++表达式的值1
        // ++运算 2)然后将a的值增加1，a为2
        // = 运算 3)将表达式a++的值1 赋值给b为1
        System.out.println(a + "," + b);//2,1
        a = 1;
        a = a++;//先执行++运算，然后执行=运算
        //a++ 运算称为后++，先取值在增加。
        //计算过程：
        // ++运算 1)先取a的值1 作为a++表达式的值1
        // ++运算 2)然后将a的值增加1，a为2
        // = 运算 3)将表达式a++的值1 赋值给a为1
        System.out.println(a);//1

        a = 1;
        b = ++a; //先++，先增加在取值
        //先执行++a 然后再赋值=
        // ++运算 1) 先将a的值增加1，a为2
        // ++运算 2) 取a的值2 作为++a表达式的值2
        // = 运算 3) 将++a的表达值2 赋值给b为2
        System.out.println(a + "," + b);

        int i = 0;
        System.out.println(i++ % 3);//0
        System.out.println(i++ % 3);//1
        System.out.println(i++ % 3);//2
        System.out.println(i++ % 3);//0
        System.out.println(i++ % 3);//1
        System.out.println(i++ % 3);//2
        System.out.println(i++ % 3);//0
    }
}














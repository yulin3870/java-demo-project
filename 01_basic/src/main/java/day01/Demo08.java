package day01;

public class Demo08 {
    public static void main(String[] args) {
        char c = 20013;
        // c 是 char 变量，20013 是int类型的字面量
        // 不能进行超范围赋值！ “int字面量” 在 “不超过char范围” 情况下
        // 可以给char变量赋值
        // 字面量相加，java按照一个整除处理
        //c = -1;//编译错误，超范围
        c = 65535;
        //c = 65536;//编译错误，超范围
        c = 'A' + 1;// 66
        c = 'A' + 65000;//字面量相加结果如果不超范围没有问题
        //c = 'A' + 65535;//编译错误
        int a = 66;//定义变量a
        //c = a; //编译错误，“int 类型变量” 不能只能赋值给char变量
    }
}

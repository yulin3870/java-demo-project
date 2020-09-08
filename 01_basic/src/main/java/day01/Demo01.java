package day01;

/**
 * Java 的变量
 * 1）语法规则，与编译错误
 * 2）面试：面试题目
 * 3) 工作经验
 */
public class Demo01 {
    public static void main(String[] args) {
        //System.out.println(age);//编译错误 age 没有找到
        //int 是数据类型，整数类型，age变量名
        int age; //变量的声明，告诉Java有了变量 age（年龄）
        //System.out.println(age);// 编译错误，age没有初始化！\
        // 运算结果：A 编译错误 B 运行异常 C 0  D age
        age = 18;//第一次赋值，就是初始化
        System.out.println(age);//18 没有问题
        //int age = 9;//编译错误，重复定义
        age = 9;//对age进行赋值，修改原先的值
        System.out.println(age);
        {//代码块
            int score = 85;//声明变量, 同时初始化
            System.out.println(score);//85
            System.out.println(age); //9
        }
        //System.out.println(ago);//编译错，ago 没有声明
        //System.out.println(score);//编译错误，没有score变量
        int score = 70;//可以再次定义score，不在同一个作用域。
        System.out.println(score);//70
    }
}








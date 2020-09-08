package day03;

/**
 * 短路逻辑与非短路逻辑
 * 短路逻辑 && ||
 * 第一个表达式能够确定整个表达式的结果，就不再执行第二个
 * 表达式了。称为短路逻辑
 * 非短路逻辑 & |
 * <p>
 * 1）在实际工作中 常用 短路逻辑
 * 2）非短路逻辑会出现在 面试和笔试环节
 * 3）只有满足短路条件时候才发生短路运算！
 */
public class Demo06 {
    public static void main(String[] args) {
//	 业务规则：女的 “并且” 年龄60岁以上的
        char sex = '男';
        int age = 25;
//	短路的与
        if (sex == '女' && age++ >= 60) {
            System.out.println("欢迎光临!");
        } else {
            System.out.println("欢迎你下次再来！");
        }
        System.out.println(age);//25 说明发生了短路现象
        //非短路的与
        if (sex == '女' & age++ >= 60) {
            System.out.println("欢迎光临!");
        } else {
            System.out.println("欢迎你下次再来！");
        }
        System.out.println(age);//26 说明发生非短路现象
//	 业务规则：女的 “或者” 年龄60岁以上的  
        //短路或逻辑
        sex = '女';
        age = 25;
        if (sex == '女' || age++ >= 60) {
            System.out.println("欢迎光临");
        }
        System.out.println(age);//25

        //非短路 或 逻辑
        if (sex == '女' | age++ >= 60) {
            System.out.println("欢迎光临");
        }
        System.out.println(age);//26 发生非短路判断
    }
}










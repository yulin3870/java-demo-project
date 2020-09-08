package day02;

import java.util.Arrays;

/**
 * 重载: 名字一样详细功能不同!
 *
 * 1) 运算符重载(只有一个 "+")
 * 2) 方法重载: 方法名一样,参数不同
 *   2.1) 如: 打车, 打酱油, 打扑克牌
 *      println('中')      "打印"字符
 *      println((int)'中') "打印"整数
 *
 * 3) 构造器重载: 构造器名一样, 参数不同
 */
public class Demo08 {
    public static void main(String[] args) {
        int[] ary = {'A','B','C'};
        char[] chs = {'A','B','C'};
        //如下方法println()是两个不同的重载方法
        //打印ary.toString()的结果
        System.out.println(Arrays.toString(ary));
        System.out.println(chs);//字符数组按照字符串打印

        Cell2 c1 = new Cell2(4,5);
        c1.drop();//调用了重载的方法
        c1.drop(5);//调用了重载的方法
        System.out.println(c1.row);//10
        Cell2 c2 = new Cell2(3,4,0x777777);
        System.out.println(c2.row);
    }
}
class Cell2{
    int row;//属性, 实例变量
    int col;
    int color;
    //重载的构造器
    public Cell2(int row, int col, int color){
        this.row = row;
        this.col = col;
        this.color = color;
    }
    public Cell2(int row, int col){
        this.row = row;
        this.col = col;
    }
    //重载的方法, 方法名相同, 参数不同
    public void drop(){
        row++;/*下落一步*/
    }

    public void drop(int step){
        row+=step;/*下落n步*/
    }
}


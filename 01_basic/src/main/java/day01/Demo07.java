package day01;

public class Demo07 {
    public static void main(String[] args) {
        char c = 20013;
        char ch = '中';
        System.out.println(c);//中

        c = 65;
        System.out.println(c);//A
        c = 66;
        System.out.println(c);//B


        System.out.println((int) 'A');
        System.out.println((int) 'B');
        System.out.println((int) 'C');
        System.out.println((int) 'D');
        //....
        System.out.println((int) 'Z');
        //  大写字母‘A’～‘Z’,字符代表 65～90


        System.out.println((int) '0');
        System.out.println((int) '1');
        System.out.println((int) '2');
        //....
        System.out.println((int) '9');
        //  数字‘0’～‘9’，字符代表 48～57


        System.out.println((int) 'a');
        System.out.println((int) 'b');
        System.out.println((int) 'c');
        //.....
        System.out.println((int) 'z');
        //  小写字母'a'~'z'，字符代表 97～122


        c = '\n';// c是换行字符 （new Line) 是特殊控制字符
        c = '\r';// 回车字符 return
        c = '\t';// tab
        c = '\\';// 一个\
        c = '\'';// '
        c = '\"';// "
        c = '\u4e2d';// 16进制Unicode 编码


    }

}

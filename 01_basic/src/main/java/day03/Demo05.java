package day03;

/**
 * 关系运算符
 */
public class Demo05 {
    public static void main(String[] args) {
        int age = 15;
        boolean isChild = age < 16;
        System.out.println(isChild);//true

//业务功能：判断一个字符是否为数字字符
        char c = '6';//54  'A'65  '中'20013
        // 65>=48 && 65<=57
        if (c >= '0' && c <= '9') {
            System.out.println(c + "是数字字符！");
        } else {
            System.out.println(c + "不是数字字符！");
        }
//业务功能：判断一个字符是否是英文字符
        c = 'A';// '6' '中'
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
            System.out.println(c + "是英文字符");
        } else {
            System.out.println(c + "不是英文字符");
        }
//	业务功能：判断一个字符不是数字字符
        c = '6';//54  'A'65  '中'20013
        // 65>=48 && 65<=57
        if (!(c >= '0' && c <= '9')) {
            System.out.println(c + "不是数字字符！");
        }
    }
}







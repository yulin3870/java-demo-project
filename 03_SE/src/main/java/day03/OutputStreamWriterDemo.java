package day03;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * 使用字符输出流将字符写入文件
 *
 * @author j36
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws Exception {

        FileOutputStream fos = new FileOutputStream("writer.txt");

        OutputStreamWriter writer = new OutputStreamWriter(fos);
        /**
         * 	write(int c)
         * 	一次写两个字节（一个字节）写int值的低16位
         */

        writer.write('A');

        char[] chs = {'C', 'H', 'I', 'N', 'A', '!'};
        /**
         * 	write(char[] ch)
         * 	一次将一个字符数组中的所有字符写出
         */
        writer.write(chs);
        /**
         * 	write(char[] ch,int start,int len)
         */
        // 写 INA
        writer.write(chs, 2, 3);// 将 chs数组中从下标2的位置写3个元素

        writer.close();


    }
}

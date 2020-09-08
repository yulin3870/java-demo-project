package day03;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

/**
 * 使用字符流输入流读取GBK编码的文本文件
 *
 * @author j36
 */
public class FRDemo {
    public static void main(String[] args) throws Exception {
        /**
         * 	使用文件字符输入流读取文本文件
         */
        FileReader reader = new FileReader("charset.txt");

        int c = -1;
        while ((c = reader.read()) != -1) {
            System.out.println((char) c);
        }

        reader.close();

        System.out.println();

        /**
         * 	FileReader 不能够设置编码集，所以在读取与系统指定默认编码集
         * 	不同的文本文件时，会出现乱码
         * 	解决办法是，使用InputStreamReader读取
         * 	InputStreamReader有一个重载的构造方法支持指定特殊的
         * 	编码集读取文本文件
         */
        FileInputStream fis = new FileInputStream("charset.txt");
        /**
         * 	重载构造方法
         * 	InputStreamReader(FileInputStream file,String charset)
         * 	根据指定的字符集创建字符输入流
         */
        InputStreamReader inReader = new InputStreamReader(fis, "GBK");

        int chr = -1;
        while ((chr = inReader.read()) != -1) {
            System.out.println((char) chr);
        }


        inReader.close();


    }
}

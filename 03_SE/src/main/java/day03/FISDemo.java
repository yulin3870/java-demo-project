package day03;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 文件字节输入流
 * 用于从指定文件中读取数据
 *
 * @author j36
 */
public class FISDemo {
    public static void main(String[] args) {
        // 1 创建File对象，用于指定要读取的文件
        File file = new File("fos.dat");

        // 文件字节输入流
        FileInputStream fis = null;

        try {


            fis = new FileInputStream(file);

            char c = (char) fis.read();

            /**
             * 	读取一个int值，获取后面的字符串长度
             */
            int num = 0;
            int i = fis.read();// 读取第一个字节
            num = (i << 24) | num;// 将这个字节一点到最高8位上

            i = fis.read();
            num = (i << 16) | num;

            i = fis.read();
            num = (i << 8) | num;

            i = fis.read();
            num = i | num;

            // 创建一个字节数组，用于读取后面的字符串内容
            byte[] data = new byte[num];
            /**
             *  int read(byte[] data)
             *  	一次性尝试读取给定数组长度的字节量并存入数组
             *  	返回值为实际读取到的字节量
             *  	返回值若为 -1 则说明读取到了wenjmow
             */
            fis.read(data);
            String str = new String(data, StandardCharsets.UTF_8);
            System.out.println(str);


            fis.read();


        } catch (Exception e) {

        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }


    }
}

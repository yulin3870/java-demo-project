package day03;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 文件字节输出流
 * 用于向文件中写数据的流
 *
 * @author j36
 */
public class FOSDemo {
    public static void main(String[] args) {
        /**
         * 	向文件写数据
         */
        // 1 创建要写的文件的File对象
        File file = new File("fos.dat");
        FileOutputStream fos = null;
        try {
            // 2 创建文件字节输出流
            fos = new FileOutputStream(file);

            // 写数据
            fos.write('A');// 写一个字节
            /**
             *   输出流的写方法
             *   	write(int d)
             *   	write(byte[] d)
             *   	write(byte[] d, int start ,int len)
             */
            String str = "大家好";
            byte[] data = str.getBytes(StandardCharsets.UTF_8);

            int length = data.length;// 获取字符串的字节量
            //写一个int值，将长度写出
            fos.write(length >>> 24);
            fos.write(length >>> 16);
            fos.write(length >>> 8);
            fos.write(length);

            fos.write(data);// 将一个字节数组写出

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }


    }
}

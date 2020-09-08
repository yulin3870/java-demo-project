package day03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件输入输出进行复制文件
 *
 * @author j36
 */
public class CopyFile03 {
    public static void main(String[] args) throws IOException {
        /**
         *  FileInputStream(String  path)
         *  	根据给定路径读取指定的文件
         */
        FileInputStream fis = new FileInputStream("demo.txt");

        FileOutputStream fos = new FileOutputStream("copy3_demo.txt");

        byte[] buf = new byte[1024 * 10];
        int len = -1;

        long start = System.nanoTime();

        while ((len = fis.read(buf)) > 0) {
            fos.write(buf, 0, len);
        }

        System.out.println("复制完毕");

        fis.close();
        fos.close();


    }
}

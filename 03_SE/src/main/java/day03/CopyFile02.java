package day03;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 基于缓存的复制文件
 *
 * @author j36
 */
public class CopyFile02 {
    public static void main(String[] args) throws IOException {
        File src = new File("demo.txt");
        RandomAccessFile srcRaf = new RandomAccessFile(src, "r");

        File des = new File("copy2_demo.txt");
        RandomAccessFile desRaf = new RandomAccessFile(des, "rw");

        byte[] buf = new byte[1024 * 10];// 数组字节适量    太大会溢出
        int len = 0;
        while ((len = srcRaf.read(buf)) > 0) {
            desRaf.write(buf, 0, len);
        }

        System.out.println("复制完毕");

        srcRaf.close();
        desRaf.close();


    }
}

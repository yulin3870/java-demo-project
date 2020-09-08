package day03;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 使用 RandomAccessFile 复制文件
 *
 * @author j36
 */
public class CopyFile {
    public static void main(String[] args) throws IOException {
        /**
         * 	思路：
         * 			创建一个File对象用于描述要复制的文件，
         * 			再创建一个新的File对象描述复制后的文件
         * 			并再用一个RandomAccessFile写数据
         *
         * 			这样我们从第一个文件中读字节并写到第二个文件中
         * 			从而达到复制文件的目的
         */
        // 1   创建一个用于描述源文件的File对象
        File src = new File("demo.txt");

        // 2 创建一个RandouAccessFile用于读取源文件
        RandomAccessFile srcRaf = new RandomAccessFile(src, "r");

        // 3 创建一个用于描述复制后文件的File对象
        File des = new File("copy_dome.txt");

        // 4创建一个RandomAccessFile用于写复制的文件
        RandomAccessFile desRaf = new RandomAccessFile(des, "rw");

        // 5 循环从源文件中读取字节并写到目标文件中
        int date = -1;
        while ((date = srcRaf.read()) != -1) {
            desRaf.write(date);
        }

        System.out.println("复制完毕 ");

        srcRaf.close();
        desRaf.close();
    }
}

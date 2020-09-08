package day03;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读写文件
 *
 * @author j36
 */
public class RandomAccessFileDemo03 {
    public static void main(String[] args) throws IOException {
        File file = new File("rw.dat");
        if (!file.exists()) {
            file.createNewFile();
        }
        /**
         * 	向文件中写数据
         */
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        /**
         * 	输出游标的位置
         * 	RandouAccessFile是基于游标进行读写操作的
         * 	每一个字节，或写一个字节都要是基于游标当前指向的
         * 	位置进行的，而当读写了该字节后，游标字节向后移动一个字节
         */
        System.out.println("pointer:" + raf.getFilePointer());

        //  写一个int值
        raf.writeInt(123123);
        System.out.println("pointer:" + raf.getFilePointer());

        // 写一个double值
        raf.writeDouble(12.34);
        System.out.println("pointer:" + raf.getFilePointer());

        // 写一个字符
        raf.write('A');
        // 使用 UTF-8的形式写一个字符串
        raf.writeUTF("我爱北京天安门");

        raf.seek(0);// 将游标移动到文件的开始（第一个字节）
        System.out.println("pointer:" + raf.getFilePointer());

        /**
         * 	 将数据从文件中读出来
         */
        int iNum = raf.readInt();
        System.out.println("pointer:" + raf.getFilePointer());

        double dNum = raf.readDouble();
        System.out.println("pointer:" + raf.getFilePointer());

        char c = (char) raf.read();
        String str = raf.readUTF();

        System.out.println("int:" + iNum);
        System.out.println("double:" + dNum);
        System.out.println("char:" + c);
        System.out.println("String:" + str);


        // 用完后关闭
        raf.close();


    }
}

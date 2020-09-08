package day03;

import java.io.*;

/**
 * 用于读写基本类型数据的
 * DIS & DOS
 *
 * @author j36
 */
public class DisAndDos {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("data.dat");// 写一个文件输出流

        /**
         * 	创建缓冲流，用于提高写文件的效率
         */
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //	java.io.DataOutputStream
        /**
         * 	创建可以方便写基本类型数据的高级流DOS
         */
        DataOutputStream dos = new DataOutputStream(bos);

        /**
         * 	连续写4个字节，写一个int值
         */
        dos.writeInt(Integer.MAX_VALUE);
        /**
         * 	将字符串使用UTF-8编码转换为字节后写出
         */
        dos.writeUTF("来一个字符串也行");
        /**
         * 	连续写8个字节，写一个double值
         */
        dos.writeDouble(12.5);

        dos.close();// 关闭高级流


        /**
         * 	创建文件输入流用于读取文件
         */
        FileInputStream fis = new FileInputStream("data.dat");

        /**
         * 	创建缓冲字节输入流，提高读取文件的效率
         */
        BufferedInputStream bis = new BufferedInputStream(fis);

        /**
         * 	将文件字节流包装为DIS
         * 	这样就可以方便的从文件中读取基本类型数据了
         */
        DataInputStream dis = new DataInputStream(fis);

        /**
         * 	读取int值
         */
        int imax = dis.readInt();

        String str = dis.readUTF();

        double d = dis.readDouble();

        System.out.println("int:" + imax);
        System.out.println("String:" + str);
        System.out.println("double:" + d);

        dis.close();


    }
}

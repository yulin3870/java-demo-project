package day03;

import java.io.*;

/**
 * 缓冲字符输入输出流
 *
 * @author j36
 */
public class CopyFile06 {
    public static void main(String[] args) throws Exception {
        /**
         * 	读取项目跟目录下的文本文件CopyFile05.java
         */
        FileInputStream fis = new FileInputStream("copyFile05.java");
        /**
         * 	因为缓冲字符输入流只处理字符输入流
         * 	所以我们要先将字节输入流包装为字节输入流
         */
        InputStreamReader reader = new InputStreamReader(fis);

        BufferedReader br = new BufferedReader(reader);

        /**
         *  创建缓冲字符输出流
         */
        FileOutputStream fos = new FileOutputStream("Copy_CopyFiel05,java");
        OutputStreamWriter writer = new OutputStreamWriter(fos);

        /**
         *  缓冲字符输出流，要求处理一个字符输出流
         *  	所以上面要先将字节输出流包装为字节输入流
         */
        BufferedWriter bw = new BufferedWriter(writer);


        String str = null;
        /**
         * 	 String readLine()
         * 	一次读取一行字符
         * 	连续读取字符，直到读取到换行符为止，然后将换行符之前的
         * 	字符组成字符串返回
         * 	注意！返回值中是不包含换行符的
         * 	当返回值为null时表示EOF
         */
        while ((str = br.readLine()) != null) {
            //System.out.println(str) ;
            bw.write(str);// 直接将一个字符串写出
            bw.newLine();// 输出一个换行符，考虑到了不同系统的差异性
            //	bw.write("\n") ; 会换行但是不同操作系统的识别不一样，没有通用性
        }


        br.close();


    }
}

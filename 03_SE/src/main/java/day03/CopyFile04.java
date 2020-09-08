package day03;

import java.io.*;

/**
 * 使用具有缓冲功能的输入输出流进行读写操作完成复制工作
 *
 * @author j36
 */
public class CopyFile04 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("dome.txt");

        FileOutputStream fos = new FileOutputStream("copy4_demo.txt");

        /**
         * 	创建具有缓冲功能的输入输出流
         */
        BufferedInputStream bis = new BufferedInputStream(fis);

        BufferedOutputStream bos = new BufferedOutputStream(fos);


        int d = 0;

        //while((d = fis.read()) != -1){  //效率低
        //fos.write(d) ;
        //}

        while ((d = bis.read()) != -1) { // 效率高
            bos.write(d);
        }

        System.out.println("复制完毕");

        /**
         * 	 bos.flush() 强制将缓冲区中的数据写出
         */
        //bos.flush() ;

        bos.close();// 如果不关闭流，数据将留在缓冲区，没有写入内容
        bis.close();

        //fos.close() ;
        //fis.close() ;


    }
}

package day03;

import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * 带有自动刷新的缓冲字符输出流
 *
 * @author j36
 */
public class PrintWriterDemo {
    public static void main(String[] args) throws Exception {
        //PrintWriter pw = new PrintWriter("pw.txt") ;

        //File file = new File("pw.txt") ;
        //PrintWriter pw = new PrintWriter(file) ;

        FileOutputStream out = new FileOutputStream("pw.txt");
        PrintWriter pw = new PrintWriter(out, true);


        pw.println("abcde");// 自动换行输出
        pw.println("再来一次");

        pw.close();
    }
}

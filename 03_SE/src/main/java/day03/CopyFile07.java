package day03;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyFile07 {
    public static void main(String[] args) throws Exception {
        /**
         * 		创建用于读取文本文件的文件字符输入流
         */
        FileReader reader = new FileReader("FileCopy05.java");

        /**
         * 	创建文件字符输入流
         */
        FileWriter writer = new FileWriter("Copy_Copy_FileCopy05.java");

        int c = -1;
        while ((c = reader.read()) != -1) {
            writer.write(c);
        }

        reader.close();
        writer.close();


    }
}

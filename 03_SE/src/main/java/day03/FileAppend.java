package day03;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

/**
 * 向文件中追加内容
 *
 * @author j36
 */
public class FileAppend {
    public static void main(String[] args) throws IOException {
        /**
         * 	RandomAccessFile想文件末尾追加新内容
         */
        File file = new File("append.txt");

        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        // 将游标移动到文件末尾后再写新数据
        raf.seek(file.length());


        raf.writeUTF("你好！我好！大家好！");

        raf.close();

        /**
         * 	使用文件输出流向文件末尾追加内容
         */
        /**
         * 	第二个叁书为 true 表示向文件末尾追加新内容
         */
        FileOutputStream fos = new FileOutputStream("fos_append.txt", true);

        String str = "我要成为海贼王！";
        byte[] data = str.getBytes(StandardCharsets.UTF_8);

        fos.write(data);

        fos.close();


    }
}

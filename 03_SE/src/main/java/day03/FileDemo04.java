package day03;

import java.io.File;
import java.io.IOException;

/**
 * 创建文件
 *
 * @author j36
 */
public class FileDemo04 {
    public static void main(String[] args) {
        /**
         *  	在项目根目录下创建 demo.txt
         */
        // “ . "   可以省略，不写默认也是当前目录
        File file = new File("demo.txt");
        // 不存在才创建
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}

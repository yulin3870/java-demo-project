package day03;

import java.io.File;

/**
 * 创建若干级子目录
 *
 * @author Administrator
 */
public class FileDemo03 {
    public static void main(String[] args) {
        File file = new File(
                "." + File.separator + "a"
                        + File.separator + "b"
                        + File.separator + "c"
                        + File.separator + "d"
        );
        System.out.println(file.getPath());
        if (!file.exists()) {
            /**
             * mkdirs也是创建目录,只不过会将所有不存在的父目录创建出来
             */
            file.mkdirs();
        }
        System.out.println("创建完毕");
    }
}











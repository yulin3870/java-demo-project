package day03;

import java.io.File;

/**
 * 获取当前目录下的所有子项
 *
 * @author Administrator
 */
public class FileDemo06 {
    public static void main(String[] args) {
        /**
         * 	获取当前项目根目录下的子项
         */
        File src = new File(".");
        if (src.isDirectory()) {
            /**
             * 	只获取当前目录下所有子项的名字
             */
            String[] subNames = src.list();
            for (String name : subNames) {
                System.out.println(name);
            }

            /**
             * 	获取所有的子项
             */
            File[] subs = src.listFiles();
            for (File sub : subs) {
                System.out.println(sub.getName() + ":" + sub.length());
            }
        }
    }
}





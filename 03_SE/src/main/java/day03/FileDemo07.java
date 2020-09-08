package day03;

import java.io.File;

/**
 * 删除目录
 *
 * @author Administrator
 */
public class FileDemo07 {
    public static void main(String[] args) {
        File file = new File("a");
        deleteFile(file);
    }

    /**
     * 删除文件或目录
     *
     * @param file
     */
    public static void deleteFile(File file) {
        /**
         * 若给定的File对象是一个目录
         * 我们要先将其子项全部删除后,才能删除它
         */
        if (file.isDirectory()) {
            /**
             * 循环删除所有子项
             */
            File[] subs = file.listFiles();
            for (File sub : subs) {
                //递归调用,删除给定的子项File
                deleteFile(sub);
                System.out.println(sub);
            }
        }
        /**
         * 	删除当前File对象,无论是文件还是目录
         */
        file.delete();
        //System.out.println(file) ;
    }
}





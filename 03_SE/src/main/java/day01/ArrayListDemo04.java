package day01;

import java.util.ArrayList;
import java.util.List;

/**
 * get方法  用于获取元素集合元素
 */
public class ArrayListDemo04 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");

        /**
         * 获取回来时是以Object获取的，所以要造型
         */
        String element = (String) list.get(1);
        System.out.println(element);// 2

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        /**
         *
         *  将元素 “2”替换为元素 “二”
         */

        Object oid = list.set(1, "二");
        System.out.println(list);
        System.out.println("被替换的元素：" + oid);

        /**
         *  在集合中第二个位置插入元素“一”
         */
        // [1 , 二 , 3 ]
        list.add(1, "一");
        System.out.println(list);//［1,一,二,3]

        /**
         *
         *  删除第 3 个元素
         *  返回值为被删除的元素
         */
        Object re = list.remove(2);

        // 查看3在集合中的位置
        int index = list.indexOf("3");
        System.out.println("3在集合中的位置：" + index);


    }
}
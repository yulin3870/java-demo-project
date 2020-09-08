package day01;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList
 * List的子类实现
 * 由数组方式实现的可重复的有序集
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        /**
         * 	java.util.ArrayList ;
         * 	java.util.List ;
         */
        List list = new ArrayList();
        /**
         * 因为List是有序集合，所以add方法是顺序向集合末尾添加元素
         *
         */
        list.add("一");
        list.add("二");
        list.add("三");

        System.out.println("集合元素数：" + list.size());//3

        System.out.println(list);// [一,二,三]

        list.clear();//清空集合

        System.out.println("集合元素数：" + list.size());// 0
        System.out.println("是否为空集合：" + list.isEmpty());// true
    }
}

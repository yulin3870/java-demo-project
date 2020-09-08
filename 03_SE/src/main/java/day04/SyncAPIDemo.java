package day04;

import java.util.*;

/**
 * 获取线程安全的集合
 *
 * @author j36
 */
public class SyncAPIDemo {
    public static void main(String[] args) {
        // List集合     ArrayList集合不是线程安全的
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");

        /**
         * 	转换为线程安全的
         * 	所有的集合都支持一个以叁书为：Collection的构造方法
         * 	这个构造方法的作用可以在创建当前集合的基础上，将给定
         * 	的集合元素放入其中。
         * 	这个构造方法通常习惯叫它为：集合的复制构造器
         */
        List<String> vector = new Vector<String>(list);
        Set<String> hashset = new HashSet<String>(list);

        System.out.println(vector);
        System.out.println(hashset);

        /**
         * 	使用Collection的方法，可以方便的将一个集合变成线程安全的
         */
        List<String> syncList = Collections.synchronizedList(list);
        System.out.println("syncList" + syncList);

        Set<String> syncSet = Collections.synchronizedSet(hashset);
        System.out.println("syncSet" + syncSet);

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        /**
         * 	将hashmap转换为一个线程安全的map
         */
        Map<String, Integer> syncMap = Collections.synchronizedMap(map);

        System.out.println("syncMap" + syncMap);

    }
}

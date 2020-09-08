package day01;

import java.util.ArrayList;
import java.util.List;

/**
 * 集合中的批量操作
 *
 * @author j36
 */
public class ArrayListDemo03 {
    public static void main(String[] args) {

        List list1 = new ArrayList();
        List list2 = new ArrayList();
        List list3 = new ArrayList();
        //　向第一个集合中添加元素
        list1.add("1");
        list1.add("2");
        list1.add("3");

        // 向第二个集合中添加元素
        list2.add("4");
        list2.add("5");

        list3.add("1");
        list3.add("2");

        // 将集合 2 中的元素存入集合1
        list1.addAll(list2);
        System.out.println(list1);

        //删除集合 1 中与集合 3 中相同的元素
        list1.removeAll(list3);
        System.out.println(list1);

        // 只保留集合 1 中与集合 2 中相同的元素（取交集）
        list1.retainAll(list2);

        // 以上判断元素是否相同，使用的是 equals 方法


    }
}

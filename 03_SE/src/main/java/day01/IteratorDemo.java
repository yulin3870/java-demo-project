package day01;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 使用迭代器遍历集合
 *
 * @author j36
 */
public class IteratorDemo {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("1");
        list.add("#");
        list.add("2");
        list.add("#");
        list.add("3");
        list.add("#");
        list.add("4");

        //获取用于便利集合的迭代器     java.util.Iterator ;
        Iterator it = list.iterator();

        while (it.hasNext()) {
            String element = (String) it.next();
            System.out.println(element);
            if ("#".equals(element)) {
                it.remove();// 删除刚被迭代出来的元素
            }
        }
        System.out.println(list);

    }
}

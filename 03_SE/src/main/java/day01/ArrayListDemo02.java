package day01;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试使用List添加自定义类型的元素
 *
 * @author j36
 */
public class ArrayListDemo02 {
    public static void main(String[] args) {
        // 创建集合
        List list = new ArrayList();

        //添加三个 Point 实例
        list.add(new Point(1, 2));
        list.add(new Point(3, 4));
        list.add(new Point(5, 6));

        System.out.println(list);//[ x=1,y=2 , x=3,y=4 , x=5,y=6 ]

        Point p = new Point(1, 2);
        /**
         *   包含的比较是基于 equals 的       如果不重写 equals 从Objce继承的 equals 等值于 ==
         */
        if (list.contains(p)) {
            System.out.println("包含");// 因为Point 重写了 equals 方法
            /**
             * remove 方法删除集合中第一个与给定对象P相同的元素
             */
            list.remove(p);
        } else {
            System.out.println("不包含");
        }
        System.out.println(list);
    }
}

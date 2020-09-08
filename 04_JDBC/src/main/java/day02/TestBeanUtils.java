package day02;

import day02.entity.Dept;
import org.apache.commons.beanutils.BeanUtils;

public class TestBeanUtils {
    public static void main(String[] args) throws Exception {
        Dept dept = new Dept();
        // BeanUtils.setProperty(obj, name, value)
        // obj 给哪个对象设置属性
        // name 要设置的属性名
        // value 要设置的属性值
        BeanUtils.setProperty(dept, "no", 10000);
        BeanUtils.setProperty(dept, "name", "十多个地方");
        BeanUtils.setProperty(dept, "location", "as");

        System.out.println(dept.getNo() + "," + dept.getName() + "," + dept.getLocation());
    }
}

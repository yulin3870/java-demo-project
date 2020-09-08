package day04.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 将对象序列化后再反序列化
 *
 * @author j36
 */
public class ObjectIODemo {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        person.setAge(12);
        person.setName("李四");
        person.setSex(1);

        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("Object.txt"));

        oos.writeObject(person);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("Objcet.txt"));

        Person p = (Person) ois.readObject();
        System.out.println(p.getName());
        System.out.println(p.getAge());
        //性别在序列化过程被忽略了，所以反序列化时得不到原来的值
        System.out.println(p.getSex());

        /**
         * 	判断反序列化会来的对象和原对象内容是否一致
         */
        System.out.println("两个对象内容是否一样：" + person.equals(p));

        System.out.println("是否为同一个对象：" + (person == p));

        ois.close();

    }
}

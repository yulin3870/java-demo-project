package day02;
/**
 * 如下实例演示了我们如何定义一个泛型类
*/
public class Demo03<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Demo03<Integer> integerBox = new Demo03<Integer>();
        Demo03<String> stringBox = new Demo03<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("泛型类"));

        System.out.printf("整型值为 :%d\n\n", integerBox.get());
        System.out.printf("字符串为 :%s\n", stringBox.get());
    }
}

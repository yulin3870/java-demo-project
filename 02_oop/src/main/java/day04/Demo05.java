package day04;

public class Demo05 {
    enum Color
    {
        RED, GREEN, BLUE;
    }

    /**
     每个枚举都是通过 Class 在内部实现的，且所有的枚举值都是 public static final 的。
     以上的枚举类 Color 转化在内部类实现：
        class Color {
            public static final Color RED = new Color();
            public static final Color BLUE = new Color();
            public static final Color GREEN = new Color();
        }
     */

    // 执行输出结果
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1);

        for (Color myVar : Color.values()) {
            System.out.println(myVar);
        }
    }
}

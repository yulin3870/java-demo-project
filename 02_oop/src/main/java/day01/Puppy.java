package day01;

public class Puppy {

    static String color; //类变量
    int puppyAge; //成员变量

    //构造器
    public Puppy(String name) {
        // 这个构造器仅有一个参数：name
        System.out.println("小狗的名字是 : " + name);
    }

    public static void main(String[] args) {
        /* 创建对象 */
        Puppy myPuppy = new Puppy("tommy");
        /* 通过方法来设定age */
        myPuppy.setAge(2);
        /* 调用另一个方法获取age */
        myPuppy.getAge();
        /*你也可以像下面这样访问成员变量 */
        System.out.println("变量值 : " + myPuppy.puppyAge);
    }

    //方法
    public int getAge() {
        System.out.println("小狗的年龄为 : " + puppyAge);
        return puppyAge;
    }

    //方法
    public void setAge(int age) {
        int b = 3; //局部变量
        puppyAge = age + b;
    }
}

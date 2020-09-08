package day02;

public class Demo02 {
    // DEPARTMENT是一个常量
    public static final String DEPARTMENT = "开发人员";
    static int allClicks = 0;    // 类变量
    //salary是静态的私有变量
    private static double salary;
    // 这个实例变量对子类可见
    public String name;
    String str = "hello world";  // 实例变量
    // 私有变量，仅在该类可见
    private int age;

    //在构造器中对name赋值
    public Demo02(String empName) {
        name = empName;
    }

    public static void main(String[] args) {
        Demo02 variable = new Demo02("RUNOOB");
        variable.setSalary(20);
        variable.printEmp();

        salary = 10000;
        System.out.println(DEPARTMENT + "平均工资:" + salary);
    }

    //设定age的值
    public void setSalary(int empAge) {
        int i = 5;  // 局部变量
        age = empAge + i;
    }

    // 打印信息
    public void printEmp() {
        System.out.println("名字 : " + name);
        System.out.println("年龄 : " + age);
    }

}

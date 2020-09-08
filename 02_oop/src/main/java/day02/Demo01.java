package day02;

public class Demo01 {
    public static void main(String[] args) {
        Penguin p = new Penguin("aa", 11);
        p.eat();
        p.sleep();
        p.introduction();
    }
}

class Animal {
    private String name;
    private int id;

    public Animal(String myName, int myid) {
        //初始化属性值
        this.name = myName;
        this.id = myid;
    }

    public void eat() {
        System.out.println(name + "正在吃");
    }

    public void sleep() {
        System.out.println(name + "正在睡");
    }

    public void introduction() {
        System.out.println("大家好！我是" + id + "号" + name + ".");
    }
}

class Penguin extends Animal {
    public Penguin(String myName, int myid) {
        super(myName, myid);
    }
}

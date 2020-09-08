package day02;

public class Demo08 {
    public static void main(String[] agrs) {
        Dog wangcai = new Dog(4);
        Dog wangwang = new Dog(5);
        //wangwang.id = 9 ;//编译错误，fianl的变量不能再改
        System.out.println(wangcai.id + " , " + wangwang.id);
        System.out.println(Dog.numofDogs);//2 静态只有一份
    }
}

class Dog {
    static int numofDogs;
    final int id;

    public Dog(int id) {
        this.id = id;
        Dog.numofDogs++;
    }

}
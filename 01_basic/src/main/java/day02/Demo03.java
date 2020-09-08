package day02;

/**
 * 静态变量
 * 静态变量是属于类的变量,使用类名访问,静态变量只有一份!
 */
public class Demo03 {
    public static void main(String[] args) {
        Cat tom = new Cat(4);
        System.out.println(tom.age);
        System.out.println(tom.numofCats);

        Cat kitty = new Cat(5);
        System.out.println(kitty.age);
        System.out.println(kitty.numofCats);

        System.out.println(Cat.numofCats);
    }
}

class Cat {
    static int numofCats;//静态变量
    int age;//实例变量

    public Cat(int age) {
        Cat.this.age = age;
        Cat.numofCats++;
    }
}
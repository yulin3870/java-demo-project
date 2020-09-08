package day01;


public class Demo05 {
	public static void main(String[] args) {
		Too f1 = new Too();
        Too f2 = new Too();

        //局部内部类, 很少使用
        class Foo{
        }
        Foo foo = new Foo();

        Xoo xoo = new Xoo();//创建Xoo的对象(实例)
        Xoo x = new Xoo(){};//创建Xoo的匿名类实例!
        //new Xoo(){} 是继承于Xoo并且同时创建了子类型对象的写法
        //{} 是子类的类体.
        Xoo x2 = new Xoo(){//子类类体
            public void test() {//子类中重写父类方法
                System.out.println("x2.test()");
            }
            public void t(){
                System.out.println("t()");
            }
        };
        x2.test();//运行子类的重写方法
        //x2.t();//编译错误, Xoo类型上没有 t()
        Hoo hoo = new Hoo(){};//不是创建抽象类实例!
        //是创建匿名子类实例!
	}
}

class Too{
    /**
     * 代码块: 在对象创建期间执行, 类似于构造器中的代码
     * 静态代码块: 在类加载期间执行.
     *   静态代码可以用于只加载一次的静态资源, 如: 图片的加载
     */
	static{ System.out.println("加载 Foo.class"); }
	{ System.out.println("HI"); }//代码块, 很少使用!
}

class Koo{
    int a;// Koo.this.a
    /** 内部类. 可以共享外部类的属性和方法 */
    class Goo{//在非静态内部类中可以访问 Koo.this
        public void test(){
            System.out.println(Koo.this.a);
        }
    }
    static class Hoo{//静态内部类中不能访问Koo.this
        public void test(){
            //System.out.println(Koo.this.a);//编译错误
        }
    }
}

abstract class Hoo{
}
class Xoo{
    public void test(){
        System.out.println("Xoo.test()");
    }
}





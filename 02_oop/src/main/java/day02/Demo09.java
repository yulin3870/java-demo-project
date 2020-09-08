package day02;

/**
 * 重写（覆盖）和重载的区别
 * 1	重载：
 * 1）方法名一样参数不同的方法，一般的功能相近的不同方法
 * 2）调用的时候根据调用“参数的类型”来识别方法
 * <p>
 * 2 重写（覆盖）
 * 1）子类型中“修改”父类的方法（父类的行为）
 * 2）在子类行中定义于父类型方法名和参数一样的方法
 * 3）在调用时候 根据“对象的类型”来调用相应的方法
 */
public class Demo09 {
    public static void main(String[] args) {
        Super obj = new Sub();
        Too t = new Too();
        t.t(obj);//根据参数obj的类型Super调用重载的方法
    }
}

class Too {
    public void t(Super obj) {//重载的方法
        System.out.println("t(Super)");
        obj.t();// 调用重写的方法
    }                        //根据obj运行时候一用的“对象类型”调用对象的方法

    public void t(Sub obj) {
        System.out.println("t(Sub)");
        obj.t();
    }
}

class Super {
    public void t() {
        System.out.println("Super.t()");
    }
}

class Sub extends Super {
    //重写父类的方法t()
    public void t() {
        System.out.println("Sub.t()");
    }
}


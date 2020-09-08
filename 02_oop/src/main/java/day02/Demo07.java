package day02;

/**
 * 方法的重写：“修改功能”
 * 1）在子类中修改父类的行为，重写就是为了修改
 * 2）语法：子类中定义与父类型相同的方法（方法名一样，参数一样）
 * 3）调用重写的方法时候调用具体对象的方法
 * <p>
 * 属性绑定到类型上，方法绑定到对象上
 */
public class Demo07 {
    public static void main(String[] args) {
        Shape bomb = new Circle(3, 4, 5);
        Shape airplane = new Rect(10, 10, 5, 6);
        //炮弹的位置
        int x = 12;
        int y = 12;

        if (bomb.contains(x, y)) {
            System.out.println("炸弹被打掉了");
        }
        if (airplane.contains(x, y)) {
            System.out.println("飞机被打掉了");
        }

        airplane.move(x, y);
    }
}

class Shape {
    int x;
    int y;

    //判断当前图形是否包含x,y这点
    boolean contains(int x, int y) {
        return false;
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// 矩形
class Rect extends Shape {
    int width;
    int height;

    public Rect(int x, int y, int w, int h) {
        super.x = x;
        super.y = y;
        width = w;
        height = h;
    }

    // 方法的重写，修改父类的方法
    public boolean contains(int x, int y) {
        int dx = x - this.x;
        int dy = y - this.y;
        return dx >= 0 && dx < width && dy > 0 && dy < height;
    }
}

class Circle extends Shape {
    int r;

    public Circle(int x, int y, int r) {
        super.x = x;
        super.y = y;
        this.r = r;
    }

    // 圆是一种图形
    boolean contains(int x, int y) {
        int a = this.x - x;//两点之间距离的算法
        int b = this.y - y;
        double c = Math.sqrt(a * a + b * b);
        return c <= r;
    }

}








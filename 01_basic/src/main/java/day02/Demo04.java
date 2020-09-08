package day02;

/**
 * 静态方法
 * 两个点距离计算
 * <p>
 * 1) 静态方法是属于类的方法, 用类名调用.
 * 静态方法经常用于与当前对象无关的方法
 * <p>
 * 2) 静态方法中没有隐含变量 this 不能访问当前对象!
 */
public class Demo04 {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(6, 8);
        System.out.println(p1.distance(p2));
        //                distance(p1, p2)
        System.out.println(Point.distance(p1, p2));
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * 计算p1和p2之间的距离
     */
    public static double distance(Point p1, Point p2) {
        int a = p1.x - p2.x;
        int b = p1.y - p2.y;
        return Math.sqrt(a * a + b * b);
    }

    /**
     * 当前点(this)到另外点(other)的距离
     */
    public double distance( /*Point this*/ Point other) {
        int a = this.x - other.x;
        int b = this.y - other.y;
        return Math.sqrt(a * a + b * b);
    }
}










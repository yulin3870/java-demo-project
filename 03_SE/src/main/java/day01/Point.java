package day01;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x=" + x + ", y=" + y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     * 	定义POint实例之间的比较规则
     * 	返回值不关心具体的值，只关心取值范围
     * 	若返回值：
     * 	>0  ： 当前对象比给定对象大
     * 	<0  ： 当前对象比给定对象小
     * 	=0  ： 当前对象和给定对象相等
     */
    public int compareTo(Point o){
        /**
         * 	我们定义的点之间的比较规则为
         * 	点到原点的距离长的大
         */
        // 计算当前点的长度
        int len = this.x * this.x + this.y * this.y ;
        // 计算给定的叁数点的长度     幂				o.x 的 2 次方   (  这里的  o.x 是返回 double 类型 )
        int arglen =(int) (Math.pow(o.x, 2) + Math.pow(o.y, 2)) ;

        return len - arglen ;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Point other = (Point) obj;
        if (x != other.x)
            return false;
		return y == other.y;
	}


}

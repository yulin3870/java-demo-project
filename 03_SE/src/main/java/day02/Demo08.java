package day02;
/**
 *   测试泛型
 * @author j36
 *
 */
public class Demo08 {
	public static void main(String[] args){
		Demo06<Integer,Integer> p = new Demo06<Integer,Integer>(1 , 2) ;
		p.setX(1) ;
		p.setY(2) ;
		set(p) ;
		int x = p.getX() ;//ClassCastException 因为set里面的x，y是Double不能强转为Integer
		int y = p.getY() ;
		System.out.println(x+" , "+y) ;
	}

	public static void set(Demo06 p){
		p.setX(3.2) ;
		p.setY(4.2) ;
	}



}

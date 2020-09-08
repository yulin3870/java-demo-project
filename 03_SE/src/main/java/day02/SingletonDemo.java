package day02;
/**
 * 	单例模式
 * 	当前类的实例，全局唯一
 * @author j36
 *
 */
public class SingletonDemo {
	private int width ;
	private int hight ;
	
	/**
	 * 	定义一个私有的当前类型的属性
	 */
	private static SingletonDemo obj = new SingletonDemo() ;
	
	
	/**
	 * 	私有化构造方法
	 * 	目的是为了阻止外界通过new 关键字创建实例
	 */
	private SingletonDemo(){

	}
	
	
	/**
	 * 	定义一个公有的静态方法，用于获取当前类型的实例
	 */
	public static SingletonDemo getInstance(){
		return null ;
	}
	
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	
	
}

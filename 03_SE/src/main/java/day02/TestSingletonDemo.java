package day02;

public class TestSingletonDemo {
	public static void main(String[] args){
		
		SingletonDemo o1 = SingletonDemo.getInstance() ;
		o1.setWidth(200) ;
		o1.setHight(400) ;
		
		SingletonDemo o2 = SingletonDemo.getInstance() ;
		
		
		System.out.println(o1 == o2) ;
		
		
		System.out.println(o2.getWidth()) ;
		System.out.println(o2.getHight()) ;
	
	}
}

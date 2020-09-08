package day02;

public class Demo07 {
	public static void main(String[] args){
		Demo06<Double , String> p = new Demo06<Double , String>(1.2 , "2.3") ;
	
		Demo06<Integer , Integer> p1 = new Demo06<Integer , Integer>(1 , 2) ;
		
		/**
		 * 	若使用时不指定泛型，泛型的默认类型就是 Object
		 */
	
		Demo06 p2 = new Demo06(1 , 2) ;
		
		p.setX(1.2) ;
		
		p1.setX(1) ;
	
	
	}
}

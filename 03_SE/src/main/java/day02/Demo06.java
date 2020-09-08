package day02;
/**
 *  	泛型
 * @author j36
 *
 * @param <X>
 * @param <Y>
 */
public class Demo06<X , Y>{
	
	private X x ;
	private Y y ;
		
	public Demo06(X x , Y y){
		this.x = x ;
		this.y = y ;
	}
	public X getX() {
		return x ;
	}
	public void setX(X x){
		this.x = x ;
	}
	public Y getY() {
		return y ;
	}
	public void setY(Y y) {
		this.y = y ;
	}
}

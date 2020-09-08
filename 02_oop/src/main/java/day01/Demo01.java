package day01;

public class Demo01 {
	public static void main(String[] agrs){
		//c1 是引用类型变量，引用了对象的首地址
		//new 运算符，用于分配内存创建对象，返回对象的首地址
		Cell c1 = new Cell() ;//创建对象，创建Cell类的实例（对象）
		c1.row = 3 ;
		c1.col = 4 ;
		c1.color = 0xCC30FF ;
		Cell c2 = new Cell() ;
		c2.row = 3 ;
		c2.col = 5 ;
		c2.color = 0xCC30FF ;
		
		c1.drop() ;//drop(c1)  c1掉下了
		c2.drop() ;//drop(c2)  c2掉下了
		System.out.println(c1.row) ;
		
		c1.moveLeft() ;// 左
		c2.moveLeft() ;
		System.out.println(c1.col) ;
		
		c1.moveRight() ;// 右
		c2.moveRight() ;
		System.out.println(c1.col) ;
	
	}
}

/**    格子  类，  */
class Cell{
	int row ;
	int col ;
	int color ;
	//掉下
	public void drop(){
		row++ ;//算法
		
	}
	public void moveLeft(){
		col-- ;
	}
	
	
	public void moveRight(){
		col++ ;
	}


}
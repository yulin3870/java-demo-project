package day01;
/**
 * null 值问题 
 * 	空指针异常的原因是引用变量的值是null, 没有引用任何对象
 * 	在null引用上调用了方法/属性会出现空指针异常
 * 	解决空指针异常: 在适当时候(在访问方法/属性)之前对
 * 	引用变量赋值, 使变量引用对象!
 */
public class Demo08 {
	public static void main(String[] args) {
		Cell3 c1 = null;//有变量没有对象
		//以下出现运行异常, 空指针异常
		//System.out.println(c1.col);//访问属性
		//c1.drop();//调用方法
		c1 = new Cell3(4,5);
		c1.drop();
		System.out.println(c1.row); 
	}
}
class Cell3{
	int row;
	int col;
	public Cell3(int row, int col) {
		this.row = row; 
		this.col = col;
	}
	public void drop(){
		row++;
	}
}




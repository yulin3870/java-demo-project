package day04.serialize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * 	使用ObjcetOutputStream进行对象序列化操作
 * @author j36
 *
 */
public class ObjcetOutputStreamDemo {
	public static void main(String[] args) throws Exception{
		/**
		 * 	创建一个对象
		 */
		Person person = new Person() ;
		person.setAge(22) ;
		person.setName("呵呵") ;
		person.setSex(1) ;
	
		// 创建写文件的字节输出流
		FileOutputStream fos = new FileOutputStream("Person.obj") ;
		/**
		 * 	创建可以序列化对象的输出流
		 */
		ObjectOutputStream oos =new ObjectOutputStream(fos) ;
	
		/**
		 * 	将给定的Person对象序列化后写入文件中
		 */
		oos.writeObject(person) ;
		
		oos.close() ;
	}
}

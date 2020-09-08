package day04.serialize;

import java.io.Serializable;

/**
 * 	测试序列化的类
 * @author j36
 *
 */
public class Person implements Serializable{
	/**
	 *   序列化的版本号， ＝ 号后面的值自定
	 */
	private static final long serialVersionUID = 1L;
	
	private int age ;
	private String name ;
	/**
	 * 	当某个属性被transient修饰，那么该属性在序列化过程中被忽略
	 */
	private transient int sex ;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + sex;
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
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex != other.sex)
			return false;
		return true;
	}
	
	
}

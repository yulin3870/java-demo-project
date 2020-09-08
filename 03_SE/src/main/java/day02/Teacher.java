package day02;
/**
 * 	实现模板
 * @author Administrator
 *
 */
public class Teacher extends Person{

	public String getInfo() {
		return "我是一个老师,我喜欢毁人不倦";
	}

	@Override
	public String getName() {
		return "苍井null";
	}

	@Override
	public String sayGoodBye() {
		return "加内";
	}

}

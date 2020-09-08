package day02;
/**
 * 实现模板模式
 * @author Administrator
 *
 */
public class Student extends Person{

	@Override
	public String getInfo() {
		return "我住在北京,我喜欢玩游戏,旅游";
	}

	@Override
	public String getName() {
		return "范传奇";
	}

	@Override
	public String sayGoodBye() {
		return "回见";
	}

}

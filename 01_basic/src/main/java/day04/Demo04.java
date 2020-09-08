package day04;
/** 
 * switch case 语句 
 * switch 开关
 * case 情况下
 * break 打断
 * 根据分数来计算分数级别：优秀 良好 中等。。
 * 
 * switch case 性能十分优秀！
 * 只能根据整数参数进行分支操作。
 * if多路嵌套 条件灵活，适应性广，性能相对于switch差
 * 
 * 如果是根据整数多路分支：switch case
 * 其它情况下使用 if 嵌套分支
 * 
 */
public class Demo04 {
	public static void main(String[] args) {
		int score = 85;//分数 百分制
		String level; //级别
		switch(score/10){
		case 10:
		case 9: level = "优秀"; break;
		case 8: level = "良好"; break;
		case 7: level = "中等"; break;
		case 6: level = "及格"; break;
		default: level = "不及格";
		}
		System.out.println(level);
	}
}

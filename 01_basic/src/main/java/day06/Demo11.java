package day06;

import java.util.Random;
import java.util.Scanner;

/**
 * 字母猜测游戏
 * 
 * 业务规则描述：猜测“随机生成”的字符序列（5个）,
 * 根据“用户输入”的字符序列“检查”是否猜测成功，
 * 如果不成功就“提示”猜中情况，继续猜测。
 *  
 * 业务数据分析：
 *   1) char[] answer 被猜测字母序列
 *   2) char[] input  用输入的字母序列
 *   3) int count 猜测次数   
 *   4) int[] result = {字符匹配数量，匹配成功位置}  
 *   
 *   
 *    用户输入的序列和被猜测序列的比较结果
 * 功能分析设计
 *   1）随机生成 (generate)
 *      方法算法功能描述：生成n个不重复的大写字母
 *      char[] generate(int n)
 *      
 *   2）用户输入(Input)
 *   	   方法算法功能描述：从控制台读取输入，返回5个大写字符
 *      char[] userInput()
 *      
 *   3）检查(check)用户输入
 *   方法算法功能描述：检查标准答案（answer）和用户输入
 *   （input），返回结果：{字符匹配数量，匹配成功位置} 
 *      int[] check(char[] answer, char[] input)
 *      
 *   4）提示猜中情况
 *     void show(int count, int[] result)
 *     
 *   5) main 方法完成猜测流程控制
 * 		1）"生成答案"字符序列：5个字符
 * 		2）等待用户的答案输入
 * 		3）"检查用户输入"的答案，检查结果包含 匹配数量和匹配位置
 * 		4) 统计回答数量
 * 		5) 提示检查结果, 返回 (2)
 */
public class Demo11 {
	public static void main(String[] args) {
		char[] answer, input; 
		int[] result; int count=0;
		System.out.println("欢迎使用猜数字游戏");
		answer = generate(5);
		System.out.println(answer); 
		while(true){
			input = userInput();
			count++;
			result = check(answer, input);
			show(count, result);
			if(result[0]==5 && result[1]==5){
				break;
			}
		}
	}
	public static char[] generate(int n){
		char[] chs = {'A','B','C','D','E','F','G','H','I'};
		boolean[] used = new boolean[chs.length];
		int i;
		char[] answer = new char[n];
		int index = 0;
		Random random = new Random();
		do{
			i = random.nextInt(chs.length);//[0, chs.length)
			if(used[i]){
				continue;
			}
			answer[index++] = chs[i];
			used[i] = true;
		}while(index != n);
		return answer;
	}
	public static char[] userInput(){
		Scanner in = new Scanner(System.in);
		char[] input = {};
		do{
			System.out.print("输入猜测字符:");
			String str = in.nextLine();
			// str.toCharArray() 字符串转换到字符数组
			// "ABCDE" -> ['A','B','C','D','E']
			input = str.toCharArray();
		}while(input.length != 5);
		return input;
	}
	public static int[] check(char[] answer, char[] input){
		int[] result = {0,0};
		for(int i=0; i<answer.length; i++){
			for(int j=0; j<input.length; j++){
				if(answer[i]==input[j]){
					result[0]++;
					if(i==j){
						result[1]++;
					}
					break;
				}
			}
		}
		return result;
	}
	public static void show(int count, int[] result){
		if(result[0]==5 && result[1]==5){
			System.out.println("经过"+count+
					"次的努力, 你太牛了!");
			return;
		}
		System.out.println("猜了"+count+"次, 匹配字符"+
				result[0]+"个, 匹配位置"+result[1]+"个.继续努力...");
	}
}








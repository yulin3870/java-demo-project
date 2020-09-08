package day07;

import java.util.Scanner;

/**
 * 成绩管理
 * 1 Tom      86
 * 2 Jerry    78
 * 3 Andy     88
 * 4 John     98
 * 5 Lee      65
 *  String[] int[]
 *
 * 建立数据模型
 *  String[] names
 *  int[] scores
 *  * 下标相同的是同一个人
 *功能分析
 * 1）输入成绩，输入每个人的成绩
 *   迭代输入每个学生的成绩
 * 2）显示成绩列表和平均分
 *   迭代显示输出每个学生的成绩，迭代累计每个学生的成绩
 *   最后计算平均分，显示平均分
 * 3）查询某个学生的成绩
 *   迭代查找学生，找到以后显示学生的成绩。
 */
public class ScannerDemo02 {
    public static void main(String[] args) {
        String[] names = {"Tom","Jerry","Andy","John","Lee"};
        int[] scores = new int[names.length];
        Scanner in = new Scanner(System.in);
        System.out.println("\t欢迎使用成绩管理");
        while(true){
            System.out.println("1.输入成绩 2.列表 3.查找 0.退出:");
            String cmd = in.nextLine();//cmd=Command 命令
            if("0".equals(cmd)){//比较字符串要使用equals
                System.out.println("C U! (@_@)");
                break;
            }else if("1".equals(cmd)){
                //输入成绩
                System.out.println("输入成绩:");
                for(int i=0; i<scores.length; i++){
                    System.out.print((i+1)+"."+names[i]+":");
                    String str = in.nextLine();//输入是10进制字符串
                    //.parseInt(str) 将10进制字符串解析为int数据
                    scores[i] = Integer.parseInt(str);
                }
            }else if("2".equals(cmd)){
                //成绩列表
                System.out.println("成绩列表");
                int sum = 0;
                for(int i=0; i<scores.length; i++){
                    System.out.println((i+1)+"."+names[i]+":"+scores[i]);
                    sum+=scores[i];
                }
                int avg = sum/scores.length;
                System.out.println("平均分："+avg);

            }else if("3".equals(cmd)){
                //查找
                System.out.print("查谁：");
                String name = in.nextLine();
                for(int i=0; i<names.length; i++){
                    if(names[i].equals(name)){
                        System.out.println(names[i]+":"+scores[i]);
                        break;
                    }
                }
            }else{
                System.out.println("命令搞错了！");
            }
        }
    }
}


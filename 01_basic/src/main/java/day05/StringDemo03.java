package day05;

import java.util.Arrays;

public class StringDemo03 {
	public static void main(String[] args) {
		String str = "5, tom, 5, tom@tom.com, 119";
		//split 劈开, 安装正则匹配到的位置劈开
		String[] data = str.split(",\\s?");
		System.out.println(Arrays.toString(data)); 
		//replaceAll 替换所有匹配的字符串
		String s = str.replaceAll(",\\s?", "|");
		System.out.println(s); 
		//toCharArray 将字符串中的字符复制到字符数组中
		char[] chs = s.toCharArray();
		System.out.println(Arrays.toString(chs));  
		// new String(chs, 0, 5) 将字符数组中0位置开始连续5个
		//字符 创建为新字符串.
		String ss = new String(chs, 0, 5);
		System.out.println(ss); 
	}

}

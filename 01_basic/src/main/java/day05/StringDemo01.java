package day05;

import org.apache.commons.lang3.StringUtils;

public class StringDemo01 {
	public static void main(String[] args) {
		String num = "500";
		String str = StringUtils.leftPad(num, 10, '#');
		System.out.println(str);
	}

}

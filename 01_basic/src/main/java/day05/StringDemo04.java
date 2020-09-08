package day05;

import java.util.Arrays;

/**
 * String API 的连用
 */
public class StringDemo04 {
	public static void main(String[] args) {
		String name = "  TOm    \n and Jerry  ";
		String[] words=name.trim().toLowerCase().split("\\s+");
		System.out.println(Arrays.toString(words));		
	}
}






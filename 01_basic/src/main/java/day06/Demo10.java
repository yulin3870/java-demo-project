package day06;

import java.util.Arrays;

/**
 * 冒泡排序算法
 *  
 *
 */
public class Demo10 {
	public static void main(String[] args) {
		int[] ary = {9,2,6,1,6,8,4};
		Demo10.sort(ary);
		System.out.println(Arrays.toString(ary)); 
	}
	public static void sort(int[] ary){
		
		for(int i=0; i<ary.length-1; i++){
			
			for(int j=0; j<ary.length-i-1; j++){
				
				if(ary[j]>ary[j+1]){
					
					int t = ary[j];
					ary[j] = ary[j+1];
					ary[j+1] = t;
				}
			}
		}
	}
}

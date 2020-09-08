package day06;

import java.util.Arrays;
import java.util.Random;

public class Demo12 {
	public static void main(String[] args) {
		int[] ary = new int[1000];
		Random random = new Random();
		for(int i=0; i<ary.length; i++){
			ary[i] = random.nextInt();
		}
		int[] ary1 = Arrays.copyOf(ary, ary.length);
		long t1 = System.currentTimeMillis();
		Arrays.sort(ary);
		long t2 = System.currentTimeMillis();
		Demo12.sort(ary1);
		long t3 = System.currentTimeMillis();
		System.out.println(t2-t1);
		System.out.println(t3-t2);
	}
	
	public static void sort(int[] ary){
		for(int i=0; i<ary.length-1; i++){
			for(int j=0; j<ary.length-i-1; j++){
				if(ary[j]>ary[j+1]){
					int t=ary[j];
					ary[j]=ary[j+1];
					ary[j+1]=t;
				}
			}
		}
	}
}

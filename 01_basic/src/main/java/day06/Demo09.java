package day06;
/**
 * 
 *  插入排序
 * 
 */
import java.util.Arrays;

public class Demo09 {
	public static void main(String[] args) {
		int[] ary = {2,4,1,6,8,9,3};
		Demo09.sort(ary);
		//Arrays.sort(ary);
		System.out.println(Arrays.toString(ary));
	}
	public static void sort(int[] ary){
		int i,j,k;
		
		for(i=1; i<ary.length; i++){
			
			k = ary[i];
			
			for(j=i-1; j>=0 && ary[j]>k; j--){
				
				ary[j+1] = ary[j];
			}
			ary[j+1] = k;
		}
	}
}

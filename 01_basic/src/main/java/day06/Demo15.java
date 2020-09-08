package day06;

import javafx.scene.control.Cell;

/**
 * Java 的二维数组
 * 1）Java本质上没有二维数组，Java的二维数组是元素数组的数组
 * 也就是元素是数组的一堆数组
 */
public class Demo15 {
    public static void main(String[] args) {
        int[][] ary = {{3, 4, 5}, {4, 5}, {4, 5, 6}};
	/*										  0	1	 2			0	  1		0	  1	2
													  0				   1				2
		*/
        System.out.println(ary[1][1]);


        Cell[][] wall = new Cell[20][10];//20行 10列
        Cell[] line = wall[19];
        System.out.println(wall.length);
        System.out.println(line.length);
    }
}

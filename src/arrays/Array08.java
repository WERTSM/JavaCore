package arrays;

import java.util.Arrays;
/**
 * Created by WERT on 22.12.2016.
 */
public class Array08 {

	public static void main(String[] args) {
		// Примеры многомерных массивов Java
		
		int[][] triangle = { { 1, 2, 3, 4, 5 },
							 { 6, 7, 8, 9 },
							 { 10, 11, 12 },
							 { 13, 14 },
							 { 15 } };
		
		System.out.println("triangle array");
		System.out.println(Arrays.deepToString(triangle));
		System.out.println();
		for (int i=0; i<triangle.length; ++i){
			for(int j=0;j<triangle[i].length;++j){
				System.out.print(" "+triangle[i][j] );
			}
			System.out.println();
		}
	}
}
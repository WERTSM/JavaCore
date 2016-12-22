package arrays;

import java.util.Arrays;
/**
 * Created by WERT on 22.12.2016.
 */
public class Array09 {

	public static void main(String[] args) {
		// Примеры многомерных массивов Java
		
		int[] one = {1};
		int[][] two ={{2,2},{2,2}};
		int[][] three ={{3,3,3},{3,3,3},{3,3,3}};
		System.out.println("one: "+Arrays.toString(one));
				
		System.out.println("\ntwo");
		for (int i=0; i<two.length; ++i){
			for(int j=0;j<two[i].length;++j){
				System.out.print(" "+two[i][j] );
			}
			System.out.println();
		}
		
		System.out.println("\nthree");
		for (int i=0; i<three.length; ++i){
			for(int j=0;j<three[i].length;++j){
				System.out.print(" "+three[i][j] );
			}
			System.out.println();
		}
		
		// начинается магия
		three[1]=two[0];
		three[2]=one;
		
		System.out.println("\nthree after magic");
		for (int i=0; i<three.length; ++i){
			for(int j=0;j<three[i].length;++j){
				System.out.print(" "+three[i][j] );
			}
			System.out.println();
		}
	}
}

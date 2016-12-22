package arrays;

import java.util.Arrays;
/**
 * Created by WERT on 22.12.2016.
 */
public class Array07 {

	public static void main(String[] args) {
		// Примеры многомерных массивов Java

		int[] oneD = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("oneD: " + oneD);
		int[][] twoD = new int[3][];
		twoD[0] = oneD; //магия тут :)
		System.out.println("twoD: " + twoD);
		System.out.println("twoD[0]: " + twoD[0]);
		System.out.println("oneD:" + Arrays.toString(oneD));
		System.out.println("twoD:" + Arrays.deepToString(twoD));
		twoD[0][0] = 108;
		System.out.println("\ntwoD[0][0] = " + twoD[0][0]);
		System.out.println("oneD[0] = " + oneD[0]);
		System.out.println("\noneD:" + Arrays.toString(oneD));
		System.out.println("twoD:" + Arrays.deepToString(twoD));
		System.out.println("---------------------------------------------------\n");
		twoD[1] = new int[10];
		for (int i = 0; i < 10; ++i)
			twoD[1][i] = i + 10;
		System.out.println("twoD:" + Arrays.deepToString(twoD));
		oneD=twoD[1]; // и тут тоже магия :)
		System.out.println("oneD:" + Arrays.toString(oneD));
		System.out.println("\noneD: " + oneD);
		System.out.println("twoD[0]: " + twoD[0]);
		System.out.println("twoD[1]: " + twoD[1]);
	}
}

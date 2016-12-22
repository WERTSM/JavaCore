package arrays;

import static arrays.Numbers.*;
/**
 * Created by WERT on 22.12.2016.
 */
public class Array14 {

	public static void main(String[] args) {
		// Пример сортировки двумерного массива с переменной длиной строк

		// генерируем двумерный массив с переменной длиной строк
		int x = randomInRange(5, 10); // количество строк
		int[][] iOrigin = new int[x][]; // создали массив из x строк

		// генерируем разную длину строк
		for (int i = 0; i < x; ++i)
			iOrigin[i] = new int[randomInRange(1, 10)];

		System.out.println("\nНе сортированный массив");

		// заполняем массив случайными числами и выводим его на косоль
		for (int i = 0; i < x; ++i) {
			for (int j = 0; j < iOrigin[i].length; ++j) {
				iOrigin[i][j] = randomInRange(10, 99);
				System.out.print(" " + iOrigin[i][j]);
			}
			System.out.println();
		}

		// сортируем двумерный массив со строками переменной длины
		int tmp = 0;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < iOrigin[i].length; j++) {
				for (int m = 0; m < x; m++) {
					for (int n = 0; n < iOrigin[m].length; n++) {
						if (iOrigin[m][n] > iOrigin[i][j]) {
							tmp = iOrigin[m][n];
							iOrigin[m][n] = iOrigin[i][j];
							iOrigin[i][j] = tmp;
						}
					}
				}
			}
		}

		System.out.println("\nОтсортированный массив");
		for (int i = 0; i < x; ++i) {
			for (int j = 0; j < iOrigin[i].length; ++j) {
				System.out.print(" " + iOrigin[i][j]);
			}
			System.out.println();
		}
	}
}
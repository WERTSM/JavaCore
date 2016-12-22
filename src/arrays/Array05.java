package arrays;

import static arrays.Numbers.*;
import static arrays.Strings.*;

public class Array05 {

	public static void main(String[] args) {
		// примеры сортировки двумерных массивов

		int x, y, choice = 0;

		if (args.length >= 1 && stringIsInteger(args[0]))
			choice = 1;

		if (args.length >= 2
				&& (stringIsInteger(args[0]) & stringIsInteger(args[1])))
			choice = 2;

		switch (choice) {
		case 1:
			x = y = Integer.parseInt(args[0]);
			break;

		case 2:
			x = Integer.parseInt(args[0]);
			y = Integer.parseInt(args[1]);
			break;

		default:
			x = y = 10;
			break;
		}

		int[][] intOrigin = new int[x][y];

		// заполнем массив случайными числми
		// и сразу же выводим его на консоль
		System.out.println("Несортированный двумерный массив");
		for (int i = 0; i < x; ++i) {
			for (int j = 0; j < y; ++j) {
				intOrigin[i][j] = randomInRange(10, 99);
				System.out.print(" " + intOrigin[i][j]);
			}
			System.out.println();
		}

		// копируем массив intOrigin в intArray
		int[][] intArray = new int[x][y];
		for (int i = 0; i < x; ++i) {
			for (int j = 0; j < y; ++j) {
				intArray[i][j] = intOrigin[i][j];
			}
		}

		int tmp, iCount = 0, sCount = 0;

		// сортируем двумерный массив пузырьком
		for (int i = 0; i < x; ++i) {
			for (int j = 0; j < y; ++j) {
				for (int m = 0; m < x; ++m) {
					for (int n = 0; n < y; ++n) {
						++iCount;
						if (intArray[m][n] > intArray[i][j]) {
							tmp = intArray[m][n];
							intArray[m][n] = intArray[i][j];
							intArray[i][j] = tmp;
							++sCount;
						}
					}
				}
			}
		}

		System.out.println("\nОтсортированный двумерный массив");

		for (int i = 0; i < x; ++i) {
			for (int j = 0; j < y; ++j) {
				System.out.print(" " + intArray[i][j]);
			}
			System.out.println();
		}
		System.out.println("Отсортировано за " + iCount + " итераций");
		System.out.println("Сделано " + sCount + " перестановок\n");

		// копируем массив intOrigin в intArray
		intArray = new int[x][y];
		for (int i = 0; i < x; ++i) {
			for (int j = 0; j < y; ++j) {
				intArray[i][j] = intOrigin[i][j];
			}
		}

		iCount = sCount = 0;

		// сортируем двумерный массив продвинутым пузырьком
		for (int i = 0; i < x; ++i) {
			for (int j = 0; j < y; ++j) {
				intloopM: for (int m = x - 1; m > -1; --m) {
					for (int n = y - 1; n > -1; --n) {
						++iCount;
						if ((m == i & n < j)
								| (i - m == 1 & j == 0 & n == y - 1) | (m < i))
							break intloopM;
						if (intArray[m][n] < intArray[i][j]) {
							tmp = intArray[m][n];
							intArray[m][n] = intArray[i][j];
							intArray[i][j] = tmp;
							++sCount;
						}
					}
				}
			}
		}

		System.out.println("\nОтсортированный двумерный массив");

		for (int i = 0; i < x; ++i) {
			for (int j = 0; j < y; ++j) {
				System.out.print(" " + intArray[i][j]);
			}
			System.out.println();
		}
		System.out.println("Отсортировано за " + iCount + " итераций");
		System.out.println("Сделано " + sCount + " перестановок\n");
	}
}

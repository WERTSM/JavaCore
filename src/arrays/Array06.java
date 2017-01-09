package arrays;

/**
 * Created by WERT on 22.12.2016.
 */
public class Array06 {

	public static void main(String[] args) {
		// Примеры многомерных массиво Java

		System.out.println("Шаг 1");
		int[][] multiplicationTable = new int[10][];
		System.out.println("multiplicationTable = " + multiplicationTable + '\n');

		System.out.println("Шаг 2");
		for (int i = 0; i < 10; i++)
			System.out.println("multiplicationTable[" + i + "] = "
					+ multiplicationTable[i]);

		System.out.println("\nШаг 3");
		for (int i = 0; i < 10; i++) {
			multiplicationTable[i] = new int[10]; // создаем 10 массивов int
			System.out.println("multiplicationTable[" + i + "] = "
					+ multiplicationTable[i]);
		}

		System.out.println("\nСодержимое массива после создания");
		for (int i = 0; i < 10; ++i) {
			for (int j = 0; j < 10; ++j) {
				System.out.print(" " + multiplicationTable[i][j]);
			}
			System.out.println();
		}

		System.out.println("\nСодержимое массива после присвоения значений");
		for (int i = 0; i < 10; ++i) {
			for (int j = 0; j < 10; ++j) {
				multiplicationTable[i][j] = i * j;
				System.out.print(" " + multiplicationTable[i][j]);
			}
			System.out.println();
		}
	}
}
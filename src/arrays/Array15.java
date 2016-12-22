package arrays;

import java.util.Arrays;
/**
 * Created by WERT on 22.12.2016.
 */
public class Array15 {

	public static void main(String[] args) {
		// Примеры работы с массивами

		varArgs("Без параметров varargs: ");
		varArgs("Один параметр varargs: ", 108);
		varArgs("Три параметра varargs: ", 1, 2, 3);

		int[] iInt = { 10, 11, 12 };

		varArgs("Массив как параметр varargs: ", iInt);
	}

	static void varArgs(String str, int... numbers) {
		System.out.print(str + " numbers.length = " + numbers.length
				+ " Содержимое numbers: " + Arrays.toString(numbers) + '\n');
	}
}

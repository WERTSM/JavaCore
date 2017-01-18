package arrays;

import static util.Numbers.*;
import static util.Strings.*;
/**
 * Created by WERT on 22.12.2016.
 */
public class Array04 {

	public static void main(String[] args) {
		// пример динамического создания и инициализации массива значениями

		if (args.length >= 2) {
			String[] str = { args[0], args[1] };
			System.out.print("Элементы массива str:");
			for (String strprt : str) {
				System.out.print("  " + strprt);
			}
		}

		if (args.length >= 1 && stringIsInteger(args[0])) {
			int arrayLength = Integer.parseInt(args[0]);
			// создаем массив int-ов указанного в командной строке размера
			int[] intArray = new int[arrayLength];

			// заполняем массив случайными числами
			for (int i = 0; i < intArray.length; ++i) {
				intArray[i] = randomInRange(10, 99);
			}

			System.out.print("\nЭлементы массива intArray:");
			for (int x : intArray) {
				System.out.print(" " + x);
			}
		}
	}
}
package arrays;

/**
 * Created by WERT on 22.12.2016.
 */
import static util.Numbers.*;

public class Array02 {

	public static void main(String[] args) {
		// примеры одномерных массивов

		int[] intArray = new int[10];

		// заполняем массив случайными числами
		for (int i = 0; i < intArray.length; ++i) {
			intArray[i] = randomInRange(1, 100);
		}

		System.out.print("Массив intArray до сортировки: ");
		for (int x : intArray) {
			System.out.print(" " + x);
		}

		//сортировка массива по возрастанию пузырьком
		int tmp;
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray.length - i - 1; j++) {
				if (intArray[j] > intArray[j + 1]) {
					tmp = intArray[j];
					intArray[j] = intArray[j + 1];
					intArray[j + 1] = tmp;
				}
			}
			System.out.print("\nМассив intArray после "+i+" итой итерациии: ");
			for (int x : intArray) {
				System.out.print(" " + x);
			}
		}

		System.out.print("\nМассив intArray после сортировки: ");
		for (int x : intArray) {
			System.out.print(" " + x);
		}

		char e = '\u0000';
		System.out.println(e);//инициализация по умолчанию char//оффтоп
	}
}
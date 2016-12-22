package arrays;

import static arrays.Numbers.*;
import java.util.Arrays;
/**
 * Created by WERT on 22.12.2016.
 */
public class Array11 {

	public static void main(String[] args) {
		// Примеры работы с массивами в Java

		int[] a = { 1, 2 };
		int[] b = { 1, 2 };

		System.out.println("a==b is " + (a == b)); // сравнивает ссылки
		System.out.println("a.equals(b) is " + a.equals(b)); // сравнивает ссылки
		System.out.println("a=" + a + "    b=" + b);
		System.out.println("Arrays.equals(a,b) is " + Arrays.equals(a, b));

		int[][] aa = { { 11, 22 }, { 33, 44 } };
		int[][] bb = { { 11, 22 }, { 33, 44 } };
		System.out.println("Arrays.equals(aa,bb) is " + Arrays.deepEquals(aa, bb));

		int[] intArray = new int[10];

		// заполняем массив случайными числами
		for (int i = 0; i < intArray.length; ++i)
			intArray[i] = randomInRange(1, 100);

		System.out.print("Массив intArray до сортировки: " + Arrays.toString(intArray));
		Arrays.sort(intArray); //сортируем массив
		System.out.print("\nМассив intArray после сортировки: " + Arrays.toString(intArray));
		
		int index = Arrays.binarySearch(a, 2); //ищем двойку в массиве a
		System.out.println("\nindex="+index); //получаем индекс 2 в массиве а

	}
}

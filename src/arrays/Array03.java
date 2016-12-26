package arrays;

import java.util.Arrays;

import static arrays.Numbers.randomInRange;

/**
 * Created by WERT on 22.12.2016.
 */
public class Array03 {

    public static void main(String[] args) {
        // примеры алгоритмов сортировки одномерных массивов и их сравнение

        int[] intOrigin = new int[20];

        // заполняем массив случайными числами
        for (int i = 0; i < intOrigin.length; ++i) {
            intOrigin[i] = randomInRange(1, 100);
        }

        // копируем массив intOrigin в intArray
        int[] intArray = Arrays.copyOf(intOrigin, intOrigin.length);

        System.out.print("Массив intArray до сортировки: ");
        for (int x : intArray) {
            System.out.print(" " + x);
        }

        // сортировка массива по возрастанию пузырьком
        int tmp, iCount = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length - i - 1; j++) {
                ++iCount;
                if (intArray[j] > intArray[j + 1]) {
                    tmp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = tmp;
                }
            }/*
            System.out.print("\nМассив intArray после " + i + " итой итерациии: ");
            for (int x : intArray) {
                System.out.print(" " + x);
            }*/
        }

        System.out.print("\nМассив intArray после сортировки: ");
        for (int x : intArray) {
            System.out.print(" " + x);
        }
        System.out.println("\nКоличество итераций = " + iCount);

        // копируем массив intOrigin в intArray
        intArray = Arrays.copyOf(intOrigin, intOrigin.length);

        System.out.print("\nМассив intArray до сортировки: ");
        for (int x : intArray) {
            System.out.print(" " + x);
        }

        iCount = 0;

        // сортировка массива по возрастани продвинутым пузырьком :)
        for (int i = intArray.length - 1; i >= 2; i--) {
            boolean sorted = true;
            for (int j = 0; j < i; j++) {
                ++iCount;
                if (intArray[j] > intArray[j + 1]) {
                    tmp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = tmp;
                    sorted = false;
                }
            }
            System.out.print("\nМассив intArray после " + i + " итой итерациии и sorted " + sorted + ": ");
            for (int x : intArray) {
                System.out.print(" " + x);
            }
            if (sorted)
                break;

        }

        System.out.print("\nМассив intArray после сортировки: ");
        for (int x : intArray) {
            System.out.print(" " + x);
        }
        System.out.println("\nКоличество итераций = " + iCount);

        // копируем массив intOrigin в intArray
        intArray = Arrays.copyOf(intOrigin, intOrigin.length);

        System.out.print("\nМассив intArray до сортировки: ");
        for (int x : intArray) {
            System.out.print(" " + x);
        }

        iCount = 0;

        // сортировка выбором
        for (int i = 0; i < intArray.length; i++) {
            int min = intArray[i];
            int imin = i;
            for (int j = i + 1; j < intArray.length; j++) {
                ++iCount;
                if (intArray[j] < min) {
                    min = intArray[j];
                    imin = j;
                }
            }

            if (i != imin) {
                int temp = intArray[i];
                intArray[i] = intArray[imin];
                intArray[imin] = temp;
            }
            System.out.print("\nМассив intArray после " + i + " итой итерациии: ");
            for (int x : intArray) {
                System.out.print(" " + x);
            }
        }

        System.out.print("\nМассив intArray после сортировки: ");
        for (int x : intArray) {
            System.out.print(" " + x);
        }
        System.out.println("\nКоличество итераций = " + iCount + "\n\n");
    }
}
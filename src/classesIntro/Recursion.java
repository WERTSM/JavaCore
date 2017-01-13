package classesIntro;

/**
 * Created by WERT on 13.01.2017.
 */
public class Recursion {

    // примеры рекурсивных методов

    // обратный отсчет
    void countdown(int i) {

        if (i < 0) return;
        System.out.print(i-- + " ");
        countdown(i);
    }

    // заполнение массива значениями
    void arrayFill(int[] arrayI, int length) {
        if (length == 0) return;
        arrayI[--length] = length;
        arrayFill(arrayI, length);
    }

    // вывод значений массива в обратном порядке
    void arrayPrint(int[] arrayI, int length) {
        if (length == 0) return;
        System.out.print(arrayI[--length] + " ");
        arrayPrint(arrayI, length);
    }

    // вычисление факториала от числа n
    int fact(int n) {
        if (n == 1) return 1;
        return fact(n - 1) * n;
    }

}
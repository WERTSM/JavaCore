package classesIntro;

/**
 * Created by WERT on 13.01.2017.
 */

import java.util.Arrays;

public class Classes005 {

    public static void main(String[] args) {
        // примеры использования рекурсивных методов

        Recursion rcn1 = new Recursion();
        rcn1.countdown(10);

        int[] myArray = new int[10];
        rcn1.arrayFill(myArray, myArray.length);

        System.out.println();
        System.out.println(Arrays.toString(myArray));
        rcn1.arrayPrint(myArray, myArray.length);

        System.out.println();
        System.out.println("Факториал от числа 5 равен " + rcn1.fact(5));

    }

}
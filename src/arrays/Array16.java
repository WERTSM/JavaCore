package arrays;

import java.util.Arrays;

/**
 * Created by WERT on 22.12.2016.
 */
public class Array16 {

    public static void main(String[] args) {
        // Примеры работы с массивами

        varArgs("Без параметров varargs: ");
        varArgs("Строка и три параметра int varargs: " + 1, 2, 3);
        // varArgs("Строка и три параметра int varargs: "+1.01,2.02,3.03); // ошибка!
        varArgs(108); //!!! без varargs !!!
        varArgs(1, 2, 3);
        varArgs(1.01, 2.02, 3.03, 4.04);
        varArgs(true, true, true);
    }

    static void varArgs(String str, int... numbers) {
        System.out.print(str + " numbers.length = " + numbers.length
                + " Содержимое numbers: " + Arrays.toString(numbers) + '\n');
    }

    static void varArgs(int numbers) { // без varargs!
        System.out.print("int = " + numbers + "    !!! без varargs !!!\n");
    }

    static void varArgs(int... numbers) {
        System.out.print("int... " + " numbers.length = " + numbers.length
                + " Содержимое nubers: " + Arrays.toString(numbers) + '\n');
    }

    static void varArgs(double... numbers) {
        System.out.print("double... " + " numbers.length = " + numbers.length
                + " Содержимое numbers: " + Arrays.toString(numbers) + '\n');
    }

    static void varArgs(boolean... numbers) {
        System.out.print("boolean... " + " numbers.length = " + numbers.length
                + " Содержимое numbers: " + Arrays.toString(numbers) + '\n');
    }
}
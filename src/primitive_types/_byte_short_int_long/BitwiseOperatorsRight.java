package primitive_types._byte_short_int_long;

//import static types_int.PrintByte.printlnByte;

import static primitive_types._byte_short_int_long.PrintByte.*;
/**
 * Created by WERT on 15.12.2016.
 */
public class BitwiseOperatorsRight {

    public static void main(String[] args) {
        // Пример операции логического сдвига >>> в Java

        System.out.println("Пример побитового сдвига значения int вправо без знака (>>>)");
        int a1 = 0xff;
        System.out.println("a1 как десятичное = " + a1);
        System.out.print("a1 как двоичное = ");
        printlnInt(a1);
        System.out.println("Сдвиг на 4 позиции вправо без знака");
        System.out.println("a1 как десятичное = " + (a1 >>> 4));
        System.out.print("a1 как двоичное = ");
        printlnInt((a1 >>> 4));
        System.out.println("--------------------------------------");
        a1 = -50;
        System.out.println("a1 как десятичное = " + a1);
        System.out.print("a1 как двоичное = ");
        printlnInt(a1);
        System.out.println("Сдвиг на 2 позиции вправо без знака");
        System.out.println("a1 как десятичное = " + (a1 >>> 2));
        System.out.print("a1 как двоичное = ");
        printlnInt((a1 >>> 2));
        System.out.println("\nПример побитового сдвига значения byte вправо без знака (>>>)");
        byte b1 = -50;
        System.out.println("b1 как десятичное = " + b1);
        System.out.print("b1 как двоичное = ");
        printlnByte(b1);
        System.out.println("Сдвиг на 2 позиции вправо без знака");
        System.out.println("b1 как десятичное = " + (b1 >>> 2));
        System.out.print("b1 как двоичное = ");
        //если раскомментировать строку ниже то компилятор выдаст ошибку
        //так как считает это выражение типа int
//		printlnByte((b1>>>2));

        //а здесь уже все нормально компилится, но результат не нормальный :)
        printlnByte((byte) (b1 >>> 2));

        //исправленый пример
        System.out.println("\nПример ПРАВИЛЬНОГО побитового сдвига значения byte вправо без знака (>>>)");
        System.out.println("b1 как десятичное = " + b1);
        System.out.print("b1 как двоичное = ");
        printlnByte(b1);
        System.out.println("Сдвиг на 2 позиции вправо без знака c использованием маски 0xff");
        System.out.println("b1 как десятичное = " + ((b1 & 0xff) >>> 2));
        System.out.print("b1 как двоичное = ");
        printlnByte((byte) ((b1 & 0xff) >>> 2));
    }
}

package types_int;

import static types_int.PrintByte.*;

/**
 * Created by WERT on 15.12.2016.
 */
public class BitwiseOperators_32_16 {

    public static void main(String[] args) {
        // Примеры граблей при операциях сдвига
        int mask = 0xFF000000;
        System.out.print("mask = ");
        printlnInt(mask);
        System.out.println("mask >>> 16 " + "16%32=" + (16 % 32));
        System.out.print("mask = ");
        printlnInt((mask >>> 16));
        System.out.println("mask >>> 24 " + "24%32=" + (24 % 32));
        System.out.print("mask = ");
        printlnInt((mask >>> 24));
        System.out.println("mask >>> 32 " + "32%32=" + (32 % 32));
        System.out.print("mask = ");
        printlnInt((mask >>> 32)); // сдвига не произойдет
        System.out.println("mask >> 32 " + "32%32=" + (32 % 32));
        System.out.print("mask = ");
        printlnInt((mask >> 32)); // сдвига не произойдет
        System.out.println("mask << 32 " + "32%32=" + (32 % 32));
        System.out.print("mask = ");
        printlnInt((mask << 32)); // сдвига не произойдет
        System.out.println("mask << 64 " + "64%32=" + (64 % 32));
        System.out.print("mask = ");
        printlnInt((mask << 64)); // сдвига не произойдет
        System.out.println("mask >>> 48 " + "48%32=" + (48 % 32));
        System.out.print("mask = ");
        printlnInt((mask >>> 48)); //сдвиг на 16 вправо

    }
}
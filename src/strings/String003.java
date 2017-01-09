package strings;

/**
 * Created by WERT on 09.01.2017.
 */

import java.io.UnsupportedEncodingException;

public class String003 {

    public static void main(String[] args) {
        // создание строк из массива byte

        // Россия в кодировке CP1251
        byte[] byteCp1251 = {(byte) 0xD0, (byte) 0xEE, (byte) 0xF1,
                (byte) 0xF1, (byte) 0xE8, (byte) 0xFF};

        // Россия в кодирвке CP866
        byte[] byteCp866 = {(byte) 0x90, (byte) 0xAE, (byte) 0xE1,
                (byte) 0xE1, (byte) 0xA8, (byte) 0xEF};

        // Россия в кодировке KOI8-R
        byte[] byteKOI8R = {(byte) 0xF2, (byte) 0xCF, (byte) 0xD3,
                (byte) 0xD3, (byte) 0xC9, (byte) 0xD1};

        // Россия в кодировке Mac cyrillic
        byte[] byteMacCyr = {(byte) 0x90, (byte) 0xEE, (byte) 0xF1,
                (byte) 0xF1, (byte) 0xE8, (byte) 0xDF};

        // создание строк из массива byte без указания кодировки

        System.out.println("Строки созданные без указания кодировки");

        String strCp1251 = new String(byteCp1251);
        System.out.println("strCp1251 -> " + strCp1251);

        String strCp866 = new String(byteCp866);
        System.out.println("strCp866 -> " + strCp866);

        String strKoi8r = new String(byteKOI8R);
        System.out.println("strKoi8r -> " + strKoi8r);

        String strMacCyr = new String(byteMacCyr);
        System.out.println("strMacCyr -> " + strMacCyr);

        // создание строк из массива byte c указанием кодировки

        System.out.println("\nСтроки созданные c указанием кодировки");

        try {
            strCp1251 = new String(byteCp1251, "Cp1251");
            System.out.println("strCp1251 -> " + strCp1251);

            strCp866 = new String(byteCp866, "Cp866");
            System.out.println("strCp866 -> " + strCp866);

            strKoi8r = new String(byteKOI8R, "KOI8-R");
            System.out.println("strKoi8r -> " + strKoi8r);

            strMacCyr = new String(byteMacCyr, "MacCyrillic");
            System.out.println("strMacCyr -> " + strMacCyr);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
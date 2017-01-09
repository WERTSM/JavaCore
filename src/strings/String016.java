package strings;

/**
 * Created by WERT on 09.01.2017.
 */

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class String016 {

    public static void main(String[] args) {
        // примеры некоторых методов класса String

        char[] chr = new char[10];
        byte[] bte = new byte[10];

        String str0 = null;
        String str1 = "";
        String str2 = "abc";
        String str3 = "Привет!";
        String str4 = "Это строка";
        String str5 = "Россия";
        String str6 = "строки";
        String str7 = " пробелы кругом ";

        // проверка на пустую строку
        // println("str0 is empty? " + str0.isEmpty()); // ошибка!
        System.out.println("str1 is empty? " + str1.isEmpty());
        System.out.println("str2 is empty? " + str2.isEmpty());

        // извлечение символа из строки
        System.out.println("символ по индексу 6 в str3 = " + str3.charAt(6));
        // извлечение символов из строки в массив символов
        System.out.println("str4.length() = " + str4.length());
        str4.getChars(4, 10, chr, 2);
        System.out.println("chr = " + Arrays.toString(chr));

        // извлечение байт из строки
        bte = str2.getBytes();
        System.out.println("bte (str2) = " + Arrays.toString(bte));

        try {
            // указали кодировку символов
            bte = str5.getBytes("Cp1251");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        System.out.println("bte (str5) = " + Arrays.toString(bte));

        // поиск подстроки в строке
        boolean b = str4.regionMatches(4, str6, 0, 5);
        System.out.println("поиск подстроки str6  в строке str4 " + b);

        // определение начинается ли строка с подстроки поиска
        b = str4.startsWith("Это");
        System.out.println("str4 начинается с Это " + b);
        b = str4.startsWith("ок", 7);
        System.out.println("str4 в позиции 7 начинается с ок " + b);

        // определение заканчивается ли строка с подстрокой поиска
        b = str4.endsWith("ока");
        System.out.println("строка 4 заканчивается на ока " + b);

        // поиск первого вхождения символа или подстроки в строке
        System.out.println("Первое вхождение символа т в str4 " + str4.indexOf(1090));
        System.out.println("Первое вхождение символа т в str4 " + str4.indexOf(1090, 2));
        System.out.println("Первое вхождение символа т в str4 " + str4.indexOf("т"));
        System.out.println("Первое вхождение символа т в str4 " + str4.indexOf("т", 2));

        // поиск последнего вхождения символа или подстроки в строке
        System.out.println("Последнее вхождение символа о в str4 " + str4.lastIndexOf(1086));
        System.out.println("Последнее вхождение символа о в str4 "
                + str4.lastIndexOf(1086, 6));
        System.out.println("Последнее вхождение символа о в str4 " + str4.lastIndexOf("о"));
        System.out.println("Последнее вхождение символа о в str4 "
                + str4.lastIndexOf("о", 6));

        // замена символов о на символы а в str4
        System.out.println("замена о на а в str4 = " + str4.replace("о", "а"));

        // определение содержит ли строка подстроку
        System.out.println("str6 содержит \"ок\" " + str6.contains("ок"));

        // замена подстроки в строке
        System.out.println("замена ок на ойк в str4 " + str4.replace("ок", "ойк"));

        // объединение строк со знаком разделителя
        System.out.println(String.join("-", "Java", "это", "круто!"));

        // изменение регистра букв в строке
        System.out.println("str6.toUpperCase() " + str6.toUpperCase());
        System.out.println("str3.toLowerCase() " + str3.toLowerCase());

        // убираем пробелы в начале и конце строки
        System.out.println("-" + str7.trim() + "-");

    }

}
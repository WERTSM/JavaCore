package strings;

/**
 * Created by WERT on 09.01.2017.
 */

import java.util.Arrays;

public class String017 {

    public static void main(String[] args) {
        // примеры регулярных выражений в Java

        String strTst1 = "Регулярные выражения - это не хухры мухры!";
        String[] words = strTst1.split("\\s");
        System.out.println(Arrays.toString(words));

        String strTst2 = "Слово +956 Сл0вО -351 15Тест";
        System.out.println(strTst2);
        System.out.println("replaceAll -> "
                + strTst2.replaceAll("(-|\\+)?\\d+", "*NUMBER*"));
        System.out.println("replaceFirst -> "
                + strTst2.replaceFirst("(-|\\+)?\\d+", "*NUMBER*"));

        for (int i = 0; i < args.length; ++i) {
            System.out.println("args[" + i + "] = " + args[i]
                    + (args[i].matches("(-|\\+)?\\d+") ? " подходит"
                    : " не подходит"));
        }
    }
}
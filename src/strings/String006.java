package strings;

/**
 * Created by WERT on 09.01.2017.
 */

import java.util.Date;

public class String006 {

    public static void main(String[] args) {
        // примеры создания строк в Java

        String iS = String.valueOf(1);     // строка из int
        String dS = String.valueOf(2.22);  // строка из double
        String fS = String.valueOf(3.33f); // строка из foat
        String bS = String.valueOf(true);  // строка из boolean

        System.out.println("iS = " + iS);
        System.out.println("dS = " + dS);
        System.out.println("fS = " + fS);
        System.out.println("bS = " + bS);

        String stTwo = "" + 2.22; // double в строку
        System.out.println("\nstTwo = " + stTwo);

        Date today = new Date();
        System.out.println("\nСегодня: " + today); // дату в строку

        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println("\nintArray как строка " + intArray);

        char[] c = {'C', 'и', 'м', 'в', 'о', 'л', 'ь', 'н', 'ы', 'й'};
        String s1 = String.valueOf(c, 0, 10);
        String s2 = String.valueOf(c, 3, 7);
        System.out.println("\nc = " + c);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        s1 = null;
        System.out.println("s1 after null = " + s1);

    }
}
package strings;

/**
 * Created by WERT on 09.01.2017.
 */

import java.util.Date;

public class String008 {

    public static void main(String[] args) {
        // примеры создания строк класса StringBuilder

        int i1 = 10;
        StringBuilder strBld1 = new StringBuilder("Строка");
        strBld1.append(i1);
        System.out.println(strBld1);
        char[] c1 = {'c', 'h', 'a', 'r'};
        strBld1.append(c1);
        System.out.println(strBld1);

        StringBuilder strBld2 = new StringBuilder().appendCodePoint(128640);
        System.out.println("strBld2 = " + strBld2);

        StringBuilder strBld3 = new StringBuilder().append(new Date());
        System.out.println("strBld3 = " + strBld3);

        String009 str = new String009("String009");
        StringBuilder strBld4 = new StringBuilder().append(str);
        System.out.println("strBld4 = " + strBld4);

    }
}
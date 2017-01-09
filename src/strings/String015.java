package strings;

/**
 * Created by WERT on 09.01.2017.
 */
public class String015 {

    public static void main(String[] args) {
        // примеры сравнения строк

        String abc = "abc";
        String def = "def";
        String abc0 = "abc0";

        System.out.println("abc.compareTo(def) = " + abc.compareTo(def));
        System.out.println("abc.compareTo(abc) = " + abc.compareTo("abc"));
        System.out.println("def.compareTo(abc) = " + def.compareTo(abc));
        System.out.println("abc.compareTo(abc0) = " + abc.compareTo(abc0));

    }

}
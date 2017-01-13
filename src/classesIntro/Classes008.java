package classesIntro;

/**
 * Created by WERT on 13.01.2017.
 */
public class Classes008 {

    final static String FIELD = "FIELD";

    static String zero(int i) {
        final String str;
        if (i == 0)
            str = "НОЛЬ";
        else
            str = "НЕ НОЛЬ";
        return str;
    }

    public static void main(String[] args) {

        System.out.println
                (zero(0));
        System.out.println
                (zero(1));
        System.out.println
                (FIELD);

    }

}
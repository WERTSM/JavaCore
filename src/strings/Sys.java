package strings;

/**
 * Created by WERT on 09.01.2017.
 */
public class Sys {

    public static int iHash(Object x) {
        return System.identityHashCode(x);
    }
}
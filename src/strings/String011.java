package strings;

/**
 * Created by WERT on 09.01.2017.
 */
public class String011 {

    public static void main(String[] args) {
        // примеры создания строк класса StringBuffer

        StringBuffer strBfr1 = new StringBuffer("Подстрочка");
        System.out.println("substring(int) = " + strBfr1.substring(3));
        System.out.println("substring(int, int) = " + strBfr1.substring(0, 3));

        StringBuffer strBfr2 = new StringBuffer().appendCodePoint(128640);
        strBfr2.append("---");
        strBfr2.appendCodePoint(128648);
        System.out.println("\nstrBfr2 = " + strBfr2.toString());
        System.out.println("strBfr2.length() = " + strBfr2.length());
        System.out.println("strBfr2.codePointCount() = "
                + strBfr2.codePointCount(0, strBfr2.length()));

        System.out.println("\ncodePint at 5 = " + strBfr2.codePointAt(5));
        System.out.println("codePint before 6 = "
                + Integer.toHexString(strBfr2.codePointBefore(6)));
        System.out.println("codePint at 6 = "
                + Integer.toHexString(strBfr2.codePointAt(6)));

        System.out.println("\nstrBfr2.capacity() = " + strBfr2.capacity());
        strBfr2.trimToSize();
        System.out.println("after trim");
        System.out.println("strBfr2.capacity() = " + strBfr2.capacity());

    }
}
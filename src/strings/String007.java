package strings;

/**
 * Created by WERT on 09.01.2017.
 */
public class String007 {

    public static void main(String[] args) {
        // примеры создания строк класса StringBuilder

        StringBuilder strBld1 = new StringBuilder();
        System.out.println("strBld1.length() = " + strBld1.length());
        System.out.println("strBld1.capacity() = " + strBld1.capacity());

        StringBuilder strBld2 = new StringBuilder(10);
        System.out.println("\nstrBld2.length() = " + strBld2.length());
        System.out.println("strBld2.capacity() = " + strBld2.capacity());

        StringBuilder strBld3 = new StringBuilder("Hello");
        System.out.println("\nstrBld3 = " + strBld3);
        System.out.println("strBld3.length() = " + strBld3.length());
        System.out.println("strBld3.capacity() = " + strBld3.capacity());

    }
}
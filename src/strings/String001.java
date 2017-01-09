package strings;

/**
 * Created by WERT on 09.01.2017.
 */
public class String001 {

    public static void main(String[] args) {
        // строковые литералы в Java это тоже объекты

        System.out.println("Hello World!");
        System.out.println("Строка \"Hello World!\" содержит " + "Hello World!".length()
                + " символов");
        System.out.println("Первый символ строки \"Hello World!\" это буква "
                + "Hello World!".charAt(0));
        System.out.println("Hello World!".subSequence(0, 6));
    }
}
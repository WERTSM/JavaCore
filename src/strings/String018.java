package strings;

/**
 * Created by WERT on 09.01.2017.
 */
public class String018 {

    public static void main(String[] args) {
        // примеры форматирования строк

        double x = 10000.0 / 3.0;

        System.out.println("Строка без форматирования x=" + x);
        System.out.printf("Строка с форматированием x=%.2f", x);
        System.out.println();
        System.out.printf("Строка с форматированием x=%8.2f", x);
        System.out.println();
        System.out.printf("Строка с форматированием x=%16.2f", x);
        System.out.println();
        String str = String.format("Строка с форматированием x=%10.2f", x);
        System.out.println(str);

    }
}
package strings;

/**
 * Created by WERT on 09.01.2017.
 */
public class String019 {

    public static void main(String[] args) {
        // примеры форматирования строк

        int i1 = 108, i2 = -33, i3 = 77;
        System.out.printf("i1 десятичное = %d  шестнадцатиричное = %<x\n", i1);
        System.out.printf("i2=%d i2=%<5d i2=%(<5d i3=%d i3=%<+d i3=%<+5d\n", i2, i3);
        System.out.printf("%4$2s %3$2s %2$2s %1$2s\n", "a", "b", "c", "d");

        double d1 = 55.333333, d2 = 3333.9898;
        System.out.printf("d1=%f d1=%<5.2f d1=%<.7f d1=%<6.2f\n", d1);
        System.out.printf("d2=%f d2=%<5.2f d2=%<.5f d2=%<8.2f\n", d2);

        String s1 = "Строка";
        System.out.printf("s1=%s s1=%<.5s s1=%<7.7s s1=%<7.5s", s1);

    }
}
package strings;

/**
 * Created by WERT on 09.01.2017.
 */

import static strings.Sys.iHash;

public class String002 {

    private static final int SIZE_OF_STRING = 10_000;
    private static long time;

    public static void main(String[] args) {
        // пример создания строк в Java

        String s1 = "Hello";             // Строковый литерал
        String s2 = "Hello";             // Строковый литерал
        String s3 = s1;                  // одинаковые ссылки
        String s4 = new String("Hello"); // Строковый объект
        String s5 = new String("Hello"); // Строковый объект
        String s6 = s5;                  // одинаковые ссылки

        System.out.println("хэш объекта s1 = " + iHash(s1) + "  хэш строки " + s1 + " = "
                + s1.hashCode());
        System.out.println("хэш объекта s2 = " + iHash(s2) + "  хэш строки " + s2 + " = "
                + s2.hashCode());
        System.out.println("хэш объекта s3 = " + iHash(s3) + "  хэш строки " + s3 + " = "
                + s3.hashCode());
        System.out.println("хэш объекта s4 = " + iHash(s4) + "  хэш строки " + s4 + " = "
                + s4.hashCode());
        System.out.println("хэш объекта s5 = " + iHash(s5) + "  хэш строки " + s5 + " = "
                + s5.hashCode());
        System.out.println("хэш объекта s6 = " + iHash(s6) + "  хэш строки " + s6 + " = "
                + s6.hashCode());

        s3 = "world"; // создался новый объект в string pool
        System.out.println("\nстрока s1 = " + s1);  // строка s1 осталась неизмененной
        System.out.println("хэш объекта s3 = " + iHash(s3) + " строка = " + s3);

        System.out.println();

        s6 = "Hello"; // ссылка на существующий объект в string pool
        System.out.println("хэш объекта s6 = " + iHash(s6) + " строка = " + s6);

        System.out.println();

        s4 = s4.intern(); //ищется ссылка на существующий объект в string pool
        System.out.println("хэш объекта s4 = " + iHash(s4) + " строка = " + s4);

        System.out.println();

        System.out.println("World" + " = " + System.identityHashCode("World"));
        String s7 = "World";
        System.out.println("s7 = " + System.identityHashCode(s7));

        // метод intern() ищет есть ли создаваемая строка в пуле
        String s8 = new String("World").intern();
        System.out.println("s8 = " + System.identityHashCode(s8));

        String sL = "";
        String sO = new String();

        System.out.print("\nНа создание строки sL ушло ");
        startBenchmark();
        for (int i = 0; i < SIZE_OF_STRING; ++i)
            sL += "1";
        stopBenchmark();

        System.out.print("\nНа создание строки sO ушло ");
        startBenchmark();
        for (int i = 0; i < SIZE_OF_STRING; ++i)
            sO += "1";
        stopBenchmark();

    }

    private static void startBenchmark() {
        time = System.currentTimeMillis();
    }

    private static void stopBenchmark() {
        time = System.currentTimeMillis() - time;
        System.out.println(time + "мс");
    }

}
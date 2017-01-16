package classesIntro;

/**
 * Created by WERT on 13.01.2017.
 */
public class Classes010 {
    // примеры инициализационных блоков

    // инициализационный блок
    {
        System.out.println("В инициализационном блоке");
        str1 = "Hello World!";
    }

    static String str4, str6;

    // статический инициализационный блок
    static {
        System.out.println("В статическом инициализационном блоке 1");
        str4 = "STATIC";
    }

    static {
        System.out.println("В статическом инициализационном блоке 2");
        str6 = "static";
    }

    String str1, str2, str5;
    String str3 = "Привет мир!";

    Classes010() {
        System.out.println("В конструкторе по умолчанию");
        str2 = "STRING";
    }

}
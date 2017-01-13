package classesIntro;

/**
 * Created by WERT on 13.01.2017.
 */
public class Classes012 {

    public static void main(String[] args) {
        // Примеры передачи методов как аргументов

        int i = sum(5, 5);
        System.out.println("i = " + i);
        i = sum(sum(i, i), 5); // передали метод как аргумент
        System.out.println("i = " + i);

        GetSetStr gss = new GetSetStr("Строка 1");
        gss.printStr();
        // передаем метод и литерал как аргумент
        gss.setStr(gss.getStr() + "2");
        gss.printStr();
        // передаем метод и литерал как аргумент в конструктор
        gss = new GetSetStr(gss.getStr() + "3");
        gss.printStr();

    }

    static int sum(int a, int b) {
        return a + b;
    }

}
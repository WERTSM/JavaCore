package classesIntro;

/**
 * Created by WERT on 13.01.2017.
 */

import static classesIntro.Print.printLine;

public class Classes002 {

    static Box fieldBox; // поле класса (статическое)

    public static void main(String[] args) {
        // подробный пример создания экземпляра класса

        System.out.println("fieldBox = " + fieldBox);

        Box mybox; // объявление ссылки на объект

        // println("mybox = " + mybox); // ошибка компиляции

        mybox = null;
        System.out.println("mybox = " + mybox);

        mybox = new Box(); // создание в памяти экземпляра объекта Box
        System.out.println("mybox = " + mybox);
        System.out.println("mybox.height = " + mybox.height);

        printLine();
        System.out.println();

        Box b1 = new Box();
        b1.label = "box1";
        System.out.println("box1.label = " + b1.label);
        Box b2 = b1; // b1 и b2 ссылаются на один объект
        b2.label = "box2";
        System.out.println("box1.label = " + b1.label);
        b2 = new Box(); // теперь b2 ссылается на другой объект
        b1.label = "box1";
        b2.label = "box2";
        printLine();
        System.out.println();
        System.out.println("box1.label = " + b1.label);
        System.out.println("box2.label = " + b2.label);

    }

}
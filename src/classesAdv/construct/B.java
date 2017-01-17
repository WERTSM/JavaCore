package classesAdv.construct;

/**
 * Created by WERT on 17.01.2017.
 */
public class B extends A {

    String b;

    {
        System.out.println("Инициализационный блок класса B");
    }

    B() {
        b = "Класс B";
        System.out.println(b + " Конструктор");
    }

}
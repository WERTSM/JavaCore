package classesAdv.construct;

/**
 * Created by WERT on 17.01.2017.
 */
public class C extends B {

    String c;

    {
        System.out.println("Инициализационный блок класса C");
    }

    C() {
        c = "Класс C";
        System.out.println(c + " Конструктор");
    }

}
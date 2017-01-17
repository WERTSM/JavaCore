package classesAdv.inheritance.abc;
/**
 * Created by WERT on 17.01.2017.
 */

import static util.Print.printLnLineLn;

class C extends B {
    String x = "Класс C";

    void printC() {
        System.out.println("in method C");
        super.printX();
        printLnLineLn();
    }

    void printX() {
        System.out.print("X->" + x);
    }
/*
    void printB() {
        System.out.println("Переопределяем. Поэтому и происходит вызов отсюда вызов метода");
    }
*/
}
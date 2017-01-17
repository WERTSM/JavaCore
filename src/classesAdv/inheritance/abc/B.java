package classesAdv.inheritance.abc;
/**
 * Created by WERT on 17.01.2017.
 */

import static util.Print.printLnLineLn;

class B extends A {
    String x = "Класс B";

    void printB() {
        System.out.println("in method B");
        super.printX();
        printLnLineLn();
    }

    void printX() {
        System.out.print("X->" + x);
    }
}
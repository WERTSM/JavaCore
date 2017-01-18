package interfaces.multiext02;
/**
 * Created by WERT on 18.01.2017.
 */

import static util.Print.printLnLineLn;

interface A {
    default void meth() {
        System.out.println("meth() in A");
    }
}

interface B extends A {

    int es = 12;
    default void meth() {
        System.out.println("meth() in B");
    }
}

interface C extends A {
    int es = 23;
    default void meth() {
        System.out.println("meth() in C");
    }
}

interface D extends C, B {

    default void meth() {
        System.out.print("meth() in D");
        printLnLineLn();
        C.super.meth();
        B.super.meth();
        //int es = 89;  <-- не было бы ошибки
    }
}

class Dd implements D {
}

class Cb implements C, B {
    public void meth() {
        System.out.println("meth() in Cb");
    }
}

public class IntMultiExt {

    public static void main(String[] args) {

        D dd = new Dd();
        dd.meth();

        D d= new Dd();
        //d.es; <-- не понятно какой из двух констант

        Cb cb = new Cb();
        cb.meth();

    }

}
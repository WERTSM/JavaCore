package classesAdv.inheritance.abc;
/**
 * Created by WERT on 17.01.2017.
 */

import static util.Print.printLnLineLn;

public class ABC {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();
        a.printA();
        a.printX();
        printLnLineLn();
        b.printB();
        b.printX();
        printLnLineLn();
        c.printC();
        c.printX();
        printLnLineLn();
        System.out.println(a.x);
        System.out.println(b.x);
        System.out.println(c.x);
        printLnLineLn();
        System.out.println(((A) b).x);
        System.out.println(((A) c).x);
        System.out.println(((B) c).x);
        printLnLineLn();
        b.printA();
        c.printA();
        c.printB();
        System.out.println("**********");
        // пример присвоения переменной суперкласса
        // ссылки на объект подкласса
        A ab;
        ab = new B();
        ab.printA();
        //ab.printB(); // ОШИБКА!
        B bc = new C();
        bc.printA();
        bc.printB();
        bc.printX();
        // bc.printc(); // ОШИБКА!
    }

}
package interfaces.multiext01;
/**
 * Created by WERT on 18.01.2017.
 */

import static util.Print.printLnLineLn;

interface A {
    default void methA1() {
        System.out.println("Method A1");
    }

    default void methA2() {
        System.out.println("Method A2");
    }
}

interface B extends A {
    void methB1();
}

class Ext1 implements B {
    @Override
    public void methB1() {
        System.out.print("Метод В1");
    }
}

class Ext2 implements B {

    @Override
    public void methA1() {
        System.out.println("Метод A1");
    }

    @Override
    public void methA2() {
        System.out.println("Метод A2");
    }

    @Override
    public void methB1() {
        System.out.print("Метод В1");
    }

}

public class MulitEx {

    public static void main(String[] args) {

        Ext1 ext1 = new Ext1();
        ext1.methA1();
        ext1.methA2();
        ext1.methB1();
        printLnLineLn();
        B ext2 = new Ext2(); // внимание сюда
        ext2.methA1();
        ext2.methA2();
        ext2.methB1();
        A ext3 = new Ext2(); // внимание сюда
        printLnLineLn();
        ext3.methA1();
        ext3.methA2();
        // ext3.methB1(); // ОШИБКА
    }

}
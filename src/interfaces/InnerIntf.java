package interfaces;
/**
 * Created by WORK_WERT on 19.01.2017.
 */

import interfaces.MyInter.Myinner;

// класс А содержит вложенные интерфейсы
class A {
    interface Aint1 {
        default void aintPrt1() {
            System.out.println("Default aintPrt1");
        }

        static void aintPrt2() {
            System.out.println("aintPrt2 static");
        }
    }

    private interface Apriv {
        default void privPrt() {
            System.out.println("privPrt() default");
        }
    }

    protected interface Aprot {
        void protPrt();
    }

    // внутренний класс Аа реализует Apriv
    class Aa implements Apriv {
    }

    // метода класса А использующий внутренний класс Aa
    void AaPrint() {
        Aa aa = new Aa();
        aa.privPrt();
    }

}

// интерфейс MyInter содержит волженный интерфейс
interface MyInter {
    void prt();

    interface Myinner {
        default void myinnerPrt() {
            System.out.println("myinnerPrt default");
        }
    }
}

// класс B реализует вложенный интерфейс Aint
class B implements A.Aint1 {
}

// класс Bb релизует вложенный интерфейс Aprot
class Bb implements A.Aprot {
    @Override
    public void protPrt() {
        System.out.println("aprotPrt() in Bb");
    }
}

// класс С реализует вложенный интерфейс Myinner
class C implements Myinner {
}

// класс D реализует интерфейс MyInter
class D implements MyInter {
    @Override
    public void prt() {
        System.out.println("prt() in Class D");
    }
}

public class InnerIntf {

    public static void main(String[] args) {

        // используем статический метод вложенного интерфейса
        A.Aint1.aintPrt2();

        A a = new A();
        a.AaPrint();

        B b = new B();
        b.aintPrt1();

        Bb bb = new Bb();
        bb.protPrt();

        C c = new C();
        c.myinnerPrt();

        D d = new D();
        d.prt();

    }

}
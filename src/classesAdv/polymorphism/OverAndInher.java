package classesAdv.polymorphism;

/**
 * Created by WERT on 18.01.2017.
 */
class A {
    String a = "Class A";

    void prt() {
        System.out.println(a);
    }

    void prta() {
        System.out.println(a);
    }
}

class B extends A {
    String b = "Class B";

    void prt() {
        System.out.println(b);
    }

    void superprt() {
        super.prt();
    }
}

class C extends B {
    String c = "Class C";

    void prt() {
        System.out.println(c);
    }

    void superprt() {
        super.prt();
    }
}

public class OverAndInher {
    public static void main(String[] args) {
        C c = new C();
        c.prt();
        c.superprt();
        B b = c;
        b.prt();
        b.superprt();
        A a = b;
        a.prt();
        a.prta();
        b.prta();
        c.prta();
    }
}
 /*
    Суть этой программы состоит в том, что переопределенные методы базовых классов не перестают существовать.
    То есть переопределенные методы базовых классов могут быть вызваны и использованы.
 */
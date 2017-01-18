package interfaces;

/**
 * Created by WORK_WERT on 19.01.2017.
 */
// Статические методы из интерфейсов не наследуются ни реализующими их классами, ни интерфейсами наследниками.
//Аналогично с абстрактными классами
interface Int1 {
    int i = 12;

    static void f() {
        System.out.println("Int 1");
    }

    static void f2() {
        System.out.println("f2");
    }
}

interface Int2 extends Int1 {

    static void f() {
        System.out.println("Int 2");
    }

}

class Obj1 implements Int1 {
}

class Obj2 implements Int2 {
}

abstract class AClazz1 {
    int i = 12;

    static void f() {
        System.out.println("Int 1");
    }

    static void f2() {
        System.out.println("f2");
    }
}

abstract class AClazz2 extends AClazz1 {

    static void f() {
        System.out.println("Int 2");
    }

}

class Obj11 extends AClazz1 {
}

class Obj22 extends AClazz2 {
}


public class StaticAndAbstract {
    public static void main(String[] args) {
        Int1.f();
        Int2.f();
        //Int2.f2();
        Obj1 ob1 = new Obj1();
        //ob1.f();
        Obj2 ob2 = new Obj2();
        //ob2.f();

        AClazz1.f();
        AClazz2.f();
        //Int2.f2();
        Obj22 ob22 = new Obj22();
        //ob2.f();
    }
}
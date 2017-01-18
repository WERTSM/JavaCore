package classesAdv;

/**
 * Created by WERT on 17.01.2017.
 */
class MyStringCreate {
    String myStr;

    MyStringCreate(String s) {
        System.out.println("MyString constructor s = " + s);
        myStr = s;
    }

    public String toString() {
        return myStr;
    }
}

class Sup {
    String set = "MySuperString";

    Sup() {
        System.out.println("Sup() перед вызовом display()");
        display();
        System.out.println("Sup() после вызова display()");
    }

    void display() {
        System.out.println("Sup set = " + set);
    }
}

class Sub extends Sup {
    {
        System.out.println("инициализационный блок 1");
    }

    String set = new MyStringCreate("MySubString").toString();

    {
        System.out.println("инициализационный блок 2");
    }

    void display() {
        System.out.println("Sub set = " + set);
    }

    Sub() {
        System.out.println("Sub() перед вызовом display()");
        display();
        System.out.println("Sub() после вызова display()");
    }
}

public class Create {

    public static void main(String[] args) {
        new Sub();
    }
}
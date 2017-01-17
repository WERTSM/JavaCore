package classesAdv;

/**
 * Created by WERT on 17.01.2017.
 */
class MyString {
    String myStr;

    MyString(String s) {
        myStr = s;
    }

    public String toString() {
        return myStr;
    }
}

class MyClass {
    String str = "MyClass";
    MyString mystr = new MyString("MyString");
}

public class Composition {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        System.out.println(mc.str);
        System.out.println(mc.mystr);
    }
}
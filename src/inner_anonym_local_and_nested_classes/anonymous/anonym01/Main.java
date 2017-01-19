package inner_anonym_local_and_nested_classes.anonymous.anonym01;

/**
 * Created by WORK_WERT on 19.01.2017.
 */

interface Iout {
    void justPrint();
}

class External {
    String str = "External";

    void extPrint() {
        System.out.println("ExtPrint");
    }
}

class Outer {
    String str = "Outer";

    void outPrint() {
        Iout iout = new Iout() {
            public void justPrint() {
                System.out.println("Just Print!");
            }
        };
        iout.justPrint();
    }

    void extPrint() {
        External ext = new External() {
            String str = "Anonymous";

            void extPrint() {
                System.out.println("AnonymPrint");
                super.extPrint();
                System.out.println("str = " + str);
                System.out.println("super.str = " + super.str);
                System.out.println("Outer.this.str = " + Outer.this.str);
            }
        };
        ext.extPrint();
    }
}

public class Main {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.outPrint();
        out.extPrint();
    }
}
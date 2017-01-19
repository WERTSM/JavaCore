package innerclasses.inner08;

/**
 * Created by WORK_WERT on 19.01.2017.
 */

public class Outer {
    private String outerStr = "Outer";

    Outer() {
    }

    ;

    Outer(String str) {
        outerStr = str;
    }

    void printInnerStr(Inner inn) {
// строка ниже выдаст ошибку компиялции		
//		System.out.println("Print from Outer innerStr = " + Inner.innerStr);
        System.out.println("Print from Outer innerStr = " + inn.innerStr);
    }

    class Inner {
        Inner() {
        }

        ;

        Inner(String str) {
            innerStr = str;
        }

        ;
        private String innerStr = "Inner";

        void printOterStr() {
            System.out.println("Print from Inner outerStr = " + outerStr);
        }
    }
}
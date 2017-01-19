package innerclasses.inner01;

/**
 * Created by WORK_WERT on 19.01.2017.
 */
public class OuterClass {

    private int outInt = 10;

    class InnerClass {

        int innerInt;

        InnerClass() {
        }

        InnerClass(int i) {
            innerInt = i;
        }

        int getOutInt() {
            return outInt;
        }

        int getInnerInt() {
            return innerInt;
        }

    }

    InnerClass getInnerClass() {
        return new InnerClass();
    }

    InnerClass getInnerClass(int i) {
        return new InnerClass(i);
    }

}
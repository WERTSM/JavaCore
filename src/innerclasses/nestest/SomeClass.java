package innerclasses.nestest;

/**
 * Created by WORK_WERT on 19.01.2017.
 */
public class SomeClass {

    void printMyString() {
        System.out.println("MyString");
    }

    public static class Test {
        public static void main(String[] args) {
            SomeClass test = new SomeClass();
            test.printMyString();
        }

    }

}
package classesAdv;

/**
 * Created by WORK_WERT on 19.01.2017.
 */
//пример нескольких классов верхнего уровня в одном .java файле

public class ClassesInOneFile {

    public static void main(String[] args) {
        Example e = new Example();
        e.testPrint();
    }

}

// класс Example верхенего уровня (не вложенный)
class Example {
    void testPrint() {
        System.out.println("TestPrint");
    }
}
package interfaces;

/**
 * Created by WERT on 18.01.2017.
 */
//статические методы
interface MyInt {

    static void prt1() {
        System.out.println("PRT1 in MyInt");
    }

    void prt2();
}

class Prt implements MyInt {
    @Override
    public void prt2() {
        System.out.println("PRT2 in Prt");
    }
}

public class Staticm implements MyInt {

    public static void main(String[] args) {

        // вызов статического метода на интерфейсе
        MyInt.prt1();

        Prt prt = new Prt();
        prt.prt2();
        // prt.prt1(); // ошибка

        Staticm ifs = new Staticm();
        ifs.prt2();

    }

    @Override
    public void prt2() {
        System.out.println("PRT2 in main()");
    }

}
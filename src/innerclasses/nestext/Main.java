package innerclasses.nestext;

/**
 * Created by WORK_WERT on 19.01.2017.
 */


public class Main {

    public static void main(String[] args) {

        Outer.Nested ou = new Outer.Nested();
        System.out.println(ou.getName());

        Outer n = new Outer();
        System.out.println(n.getName());

        Outer.Nested.Ext1 ext1 = new Outer.Nested.Ext1();
        System.out.println(ext1.getName());

        Ext2 ext2 = new Ext2();
        System.out.println(ext2.getName());

    }

}
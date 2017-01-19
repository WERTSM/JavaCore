package innerclasses.inner05;

/**
 * Created by WORK_WERT on 19.01.2017.
 */

public class Main {

    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        System.out.println("o.getThis -> " + o.getThis());
        System.out.println("o.getStr  -> " + o.getStr());
        System.out.println("i.getThis -> " + i.getThis());
        System.out.println("i.getStr  -> " + i.getStr());
        Outer.SuperInner s = i.new SuperInner(i);
        System.out.println("s.getThis -> " + s.getThis());
        System.out.println("s.getStr  -> " + s.getStr());

    }

}
package inner_anonym_local_and_nested_classes.inner_nonstatic.inner06;

/**
 * Created by WORK_WERT on 19.01.2017.
 */
public class Main {

    public static void main(String[] args) {

        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.printStr();

    }

}
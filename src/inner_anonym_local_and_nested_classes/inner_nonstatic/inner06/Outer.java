package inner_anonym_local_and_nested_classes.inner_nonstatic.inner06;

/**
 * Created by WORK_WERT on 19.01.2017.
 */

public class Outer {
    String str = "Outer";

    class Inner extends External {
        String str = "Inner";

        void printStr() {
            System.out.println(str);
            System.out.println(super.str);
            System.out.println(Outer.this.str);
        }
    }
}

class External {
    String str = "External";
}
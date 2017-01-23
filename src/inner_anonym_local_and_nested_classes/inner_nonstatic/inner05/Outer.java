package inner_anonym_local_and_nested_classes.inner_nonstatic.inner05;

/**
 * Created by WORK_WERT on 19.01.2017.
 */
public class Outer {

    private String str = "Outer";

    Object getThis() {
        return this;
    }

    String getStr() {
        return str;
    }

    class Inner extends Outer {
        private String str = "Inner";
//		String getStr() { return str; }
    }

    class SuperInner extends Inner {
        private String str = "SuperInner";

        public SuperInner(Inner o) {
            o.super();
        }

        String getStr() {
            return str + " " + super.str + " " + Outer.this.str;
        }
    }
}
package inner_anonym_local_and_nested_classes.inner_nonstatic.inner04;

/**
 * Created by WORK_WERT on 19.01.2017.
 */
public class Outer {

    private String str = "Outer";

    Object getThis() {
        return this;
    }

    class Inner1 extends Outer {

        private String str = "Inner1";

        Object getOuterThis() {
            return Outer.this.getThis();
        }

        String getStrInner1() {
            return str;
        }

        String getStrOuter() {
            return Outer.this.str;
        }
    }

}
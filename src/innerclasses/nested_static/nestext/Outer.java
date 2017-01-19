package innerclasses.nested_static.nestext;

/**
 * Created by WORK_WERT on 19.01.2017.
 */
class Outer {

    private static String outerName = "outerName";

    Outer() {
        outerName = "defaultNameFromOuter";
    }

    String getName() {
        return outerName;
    }

    static class Nested {

        Nested() {
            outerName = "defaultNameFromNested";
        }

        String getName() {
            return outerName;
        }

        static class Ext1 extends Nested {

            Ext1() {
                outerName = "defaultNameFromExt1";
            }

            String getName() {
                return outerName;
            }

        }

    }

}

class Ext2 extends Outer.Nested {

    String getName() {
        // return outerName; // нет доступа
        return super.getName() + " !!! from EXT2 !!!";
    }
}
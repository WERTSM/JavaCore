package innerclasses.nested_static.nested;

/**
 * Created by WORK_WERT on 19.01.2017.
 */
// внешний класс Outer
public class Outer {

    static String out = "out";
    private static String outerName = "outerName";

    Outer() {
    }

    Outer(String name) {
        outerName = name;
        Nested.nst = "nst " + name;
    }

    String getName() {
        return outerName;
    }

    String getStnst() {
        return Nested.stnst;
    }

    // вложенный класс Nested
    static class Nested {
        private String nestedName;
        static String nst = "nst";
        private static String stnst = "stnst";

        Nested(String name) {
            nestedName = name;
            outerName = "OUT " + nestedName;
        }

        void setName(String name) {
            nestedName = name;
        }

        String getName() {
            return nestedName;
        }

        String getOuterName() {
            return outerName;
        }
    }

    // вложенный интерфейс
    interface IGetNames {
        String getOuterName();

        String getNestedStnst();

        // класс вложенный во вложенный в интерфейс и его же реализующий
        static class GetNames implements IGetNames {

            @Override
            public String getOuterName() {
                return outerName;
            }

            @Override
            public String getNestedStnst() {
                return Nested.stnst;
            }

            String getNestedName(Nested objNested) {
                return objNested.getName();
            }

        }
    }

}
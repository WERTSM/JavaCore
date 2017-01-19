package innerclasses.inner03;

/**
 * Created by WORK_WERT on 19.01.2017.
 */
public class Outer {/*

    private String outstr = "Outer";
    private String str = "strOuter00";
    protected String proOut = "proOut";

    class Inner01 extends Outer {

        private String strInn01 = "strInn01";
        protected String str = "strInner01";
        protected String prostr = "proStrInn01";

        String getOutStr() {
            return outstr;
        }

        String getStrInn01() {
            return strInn01;
        }

        void printStr() {
            System.out.println("Inner01>" + str);
            System.out.println("Inner01>" + Inner01.super.str);
        }

        class Inner02 extends Inner01 {
            public Inner02() {
                this(new Outer().new Inner01());
            }

            public Inner02(Inner01 o) {
                o.super();
            }

            private String str = "strInner02";

            String getOutStr() {
                return outstr;
            }

            void printStr() {
                System.out.println("Inner02>" + str);
                System.out.println("Inner02>" + super.str);
            }
        }
    }

    void printStr() {
        System.out.println(str);
    }

}

class External extends Outer.Inner01 {
    public External() {
        this(new Outer().new Inner01());
    }

    public External(Inner01 o) {
        o.super();
    }

    private String str = "strExternal";

    void printStr() {
        System.out.println("External>" + str);
        System.out.println("External>" + super.str);
        System.out.println("External>" + prostr);
        System.out.println("External>" + proOut);
        super.printStr();
        System.out.println("External>" + getOutStr());
        System.out.println("External>" + getStrInn01());
    }*/
}
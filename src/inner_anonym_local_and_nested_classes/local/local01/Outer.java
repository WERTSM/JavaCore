package inner_anonym_local_and_nested_classes.local.local01;

/**
 * Created by WORK_WERT on 19.01.2017.
 */

class External01 {
    String strE01 = "External01";
}

class External02 {
    String strE02 = "External02";
}

public class Outer {
    String strO = "Outer";
    private String strOP = "private Outer";

    class Inner extends External01 {
        String strI = "Inner";
        private final String strIP = "private final Inner";

        void printInner(String afStr) {
            final String fstr = "printLocal final";
            String noFinal = "noFinal";

            class Local extends External02 {
                String strL = "Local";

                void printLocal() {
                    System.out.println("strL = " + strL);
                    System.out.println("fstr = " + fstr);
                    System.out.println("noFinal = " + noFinal);
                    System.out.println("afStr = " + afStr);
                    System.out.println("strI = " + strI);
                    System.out.println("strIP = " + strIP);
                    System.out.println("str0P = " + strOP);
                    System.out.println("strE02 = " + strE02);
                    System.out.println("strE01 = " + strE01);
                }
            }

            Local loc = new Local();
            loc.printLocal();
        }

    }

}
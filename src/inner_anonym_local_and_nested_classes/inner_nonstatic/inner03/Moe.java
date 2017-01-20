package inner_anonym_local_and_nested_classes.inner_nonstatic.inner03;

/**
 * Created by WERT on 20.01.2017.
 */
public class Moe {

    private int m = 10;

    class MoeInner extends Moe {
        void mm() {
            System.out.println(m);
        }


        class MoeInner2 extends MoeInner {
            void mm() {
                System.out.println(m);
            }
        }

    }

    static class Test {
        public static void main(String[] args) {
            Moe.MoeInner mmm = new Moe().new MoeInner();
            Moe.MoeInner.MoeInner2 mmmmm = new Moe().new MoeInner().new MoeInner2();
            mmm.mm();
        }
    }
}

/*
class N extends Moe.MoeInner.MoeInner2{
    void t() {
        System.out.println();
    }
}*/
class NeMoe {

    private int n = 15;
}
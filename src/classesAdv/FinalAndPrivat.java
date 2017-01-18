package classesAdv;

/**
 * Created by WERT on 18.01.2017.
 */
public class FinalAndPrivat {
    private void fAP() {
        //final void fAP() { Ошибка при переопределении!
        System.out.println("Root");
    }

    public static void main(String[] args) {
        FinalAndPrivat root = new Branch();
        root.fAP();
    }
}

class Branch extends FinalAndPrivat {
    void fAP() {
        System.out.println("Branch");
    }
}
package classesAdv.packeges.pkg002;

/**
 * Created by WERT on 16.01.2017.
 */

//модификатор доступа к классу по умолчанию
class PrvMod {

    private static int prvInt = 16108;

    int getPrvInt() {
        return prvInt;
    }

    void setPrvInt(int i) {
        prvInt = i;
    }
}

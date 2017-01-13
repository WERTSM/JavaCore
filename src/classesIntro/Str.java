package classesIntro;

/**
 * Created by WERT on 13.01.2017.
 */
public class Str {

    String myStr;

    Str(String str) {
        myStr = str;
    }

    void setStr(String str) {
        myStr = str;
    }

    void printStrHash() {
        System.out.println("хэш объекта myStr = " + System.identityHashCode(myStr) + "  строка = " + myStr);
    }

    String getStr() {
        return myStr;
    }

}
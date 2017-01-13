package classesIntro;

/**
 * Created by WERT on 13.01.2017.
 */
public class GetSetStr {
    String string;

    GetSetStr() {
        string = "default";
    }

    GetSetStr(String str) {
        string = str;
    }

    void setStr(String str) {
        string = str;
    }

    void printStr() {
        System.out.println(string);
    }

    String getStr() {
        return string;
    }

}
package inner_anonym_local_and_nested_classes.local.local03;

/**
 * Created by WORK_WERT on 19.01.2017.
 */

public class Main {

    public static void main(String[] args) {
        GetLocalClass lc = new External().getLocal("test");
        System.out.println(lc.getLocalStr());
        System.out.println(lc.getStr());
    }

}
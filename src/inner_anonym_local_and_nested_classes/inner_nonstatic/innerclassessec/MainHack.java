package inner_anonym_local_and_nested_classes.inner_nonstatic.innerclassessec;

/**
 * Created by WORK_WERT on 19.01.2017.
 */
public class MainHack {

    public static void main(String[] args) {
        if (args.length > 0) {
            PassCheck pass = new PassCheck();
            pass.comparePasswod(args[0]);
            PassCheck.Hack hack = pass.new Hack();
            hack.comparePasswod("justSting");
        }
    }
}
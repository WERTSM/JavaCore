package inner_anonym_local_and_nested_classes.inner_nonstatic.inner07;

/**
 * Created by WORK_WERT on 19.01.2017.
 */
public class Main {

    public static void main(String[] args) {
        if (args.length > 0) {
            PassCheck pass = new PassCheck();
            pass.comparePasswod(args[0]);
        }
    }
}
package interfaces.smile1;

/**
 * Created by WORK_WERT on 19.01.2017.
 */
public class ConsolePrinter implements IPrinter {

    @Override
    public void print(String text) {
        System.out.println(text);
    }

}
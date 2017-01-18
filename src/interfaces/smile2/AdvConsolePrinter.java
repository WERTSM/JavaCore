package interfaces.smile2;

/**
 * Created by WORK_WERT on 19.01.2017.
 */
public class AdvConsolePrinter implements IPrinter {

    @Override
    public void print(String text) {

        System.out.println(text);
        System.out.println("String lenght: " + text.length());
    }

}
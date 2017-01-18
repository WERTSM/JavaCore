package interfaces.smile2;

/**
 * Created by WORK_WERT on 19.01.2017.
 */
public class PredefinedReader implements IReader {

    final String text;

    public PredefinedReader(String text) {
        this.text = text;
    }

    @Override
    public String read() {
        return text;
    }

}
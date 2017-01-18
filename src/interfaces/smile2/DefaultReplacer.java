package interfaces.smile2;

/**
 * Created by WORK_WERT on 19.01.2017.
 */
public class DefaultReplacer implements IReplacer {

    @Override
    public String replace(IReader reader, String from, String to) {
        return reader.read().replace(from, to);
    }

}
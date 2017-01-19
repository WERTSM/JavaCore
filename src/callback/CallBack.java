package callback;
/**
 * Created by WORK_WERT on 19.01.2017.
 */

import javax.swing.*;
import java.awt.event.ActionListener;

public class CallBack {

    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(2000, listener);
        t.start();
        JOptionPane.showMessageDialog(null, "Завершить программу?");
        System.exit(0);

    }

}
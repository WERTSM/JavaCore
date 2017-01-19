package callback;
/**
 * Created by WORK_WERT on 19.01.2017.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TimePrinter implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Date now = new Date();
        System.out.println("Текущее время: " + now);

    }

}
package innerclasses.anonym06;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by WORK_WERT on 19.01.2017.
 */

// класс выводит текущее время через определенный интервал
class Clock {
    public void start(int interval, final boolean line) {
        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.println("Время: " + new Date());
                if (line) System.out.println("-------");
            }
        };
        Timer t = new Timer(interval, listener);
        t.start();
    }
}

public class TimerShow {

    public static void main(String[] args) {

        Clock clock = new Clock();
        clock.start(1000, true);
        // Программа выполняется до тех пор, пока
        // пользователь не щелкнет на кнопке OK.
        JOptionPane.showMessageDialog(null, "Завершить программу?");
        System.exit(0);

    }

}
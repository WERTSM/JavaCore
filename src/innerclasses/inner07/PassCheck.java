package innerclasses.inner07;

/**
 * Created by WORK_WERT on 19.01.2017.
 */

public class PassCheck {

    private String PASSWORD = "s0mEpAS$w0rD";

    void comparePasswod(String pass) {
        if (PASSWORD.equals(pass))
            System.out.println("Пароль правильный");
        else System.out.println("Пароль не правильный");
    }
}
package inner_anonym_local_and_nested_classes.inner_nonstatic.innerclassessec;

/**
 * Created by WORK_WERT on 19.01.2017.
 */

public class PassCheck {

    private String PASSWORD = "n0taPassword";

    void comparePasswod(String pass) {
        if (PASSWORD.equals(pass))
            System.out.println("Пароль правильный");
        else System.out.println("Пароль не правильный");
    }

    class Hack extends PassCheck {
        @Override
        void comparePasswod(String pass) {
            System.out.println("PASSWORD = " + PASSWORD);
            System.out.println("!!!!!");
        }
    }
}
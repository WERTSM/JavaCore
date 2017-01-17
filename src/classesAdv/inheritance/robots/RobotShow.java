package classesAdv.inheritance.robots;

/**
 * Created by WERT on 17.01.2017.
 */
public class RobotShow {

    public static void main(String[] args) {

        Robot rb = new Robot("NoNaMe");
        System.out.println("rb.getName = " + rb.getName());

        RobotCleaner rc = new RobotCleaner();
        System.out.println("rc.getName = " + rc.getName());
        rc.printName();

    }

}
package classesAdv.inheritance.robots;

/**
 * Created by WERT on 17.01.2017.
 */
public class RobotCleaner extends Robot {

    String name = "Shadow";

    RobotCleaner() {
        name = "Cleaner";
    }

    RobotCleaner(String name) {
        super(name);
    }

    void printName() {
        System.out.println(name);
        System.out.println(((Robot) this).name);
    }

}
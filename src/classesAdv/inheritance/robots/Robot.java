package classesAdv.inheritance.robots;

/**
 * Created by WERT on 17.01.2017.
 */
public class Robot {

    private int serialNumber;
    protected String name = "NoNaMe";

    Robot() {
        System.out.println("Robot()");
    }

    Robot(String name) {
        this.name = name;
    }

    protected int getSerialNumber() {
        return serialNumber;
    }

    protected String getName() {
        return name;
    }

    protected void setSerialNumber(int sn) {
        serialNumber = sn;
    }

    protected void setName(String name) {
        this.name = name;
    }

}
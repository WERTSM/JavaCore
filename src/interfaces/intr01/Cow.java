package interfaces.intr01;

/**
 * Created by WERT on 18.01.2017.
 */
class Cow implements Sound {

    String type;

    Cow() {
        type = "Корова";
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void getSound() {
        System.out.println("Му-му");
    }

}
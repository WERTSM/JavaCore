package interfaces.intr01;

/**
 * Created by WERT on 18.01.2017.
 */
class Dog implements Sound {

    String type;

    Dog() {
        type = "Собака";
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void getSound() {
        System.out.println("Гав-гав");
    }

}
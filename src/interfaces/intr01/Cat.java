package interfaces.intr01;

/**
 * Created by WERT on 18.01.2017.
 */
class Cat implements Sound {

    String type;

    Cat() {
        type = "Кошка";
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void getSound() {
        System.out.println("Мяу-мяу");
    }

}
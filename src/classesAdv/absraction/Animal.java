package classesAdv.absraction;

/**
 * Created by WERT on 18.01.2017.
 */
abstract class Animal { // абстрактный класс

    private String type;

    abstract void getSound(); // абстрактный метод

    Animal(String aType) {
        type = aType;
    }

    String getType() {
        return type;
    }

}
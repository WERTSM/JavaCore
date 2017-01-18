package classesAdv.absraction;

/**
 * Created by WERT on 18.01.2017.
 */
class Dog extends Animal {

    Dog(String aType) {
        super(aType);
    }

    @Override
    void getSound() {
        System.out.println("Гав-гав");
    }

}
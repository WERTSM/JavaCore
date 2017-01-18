package classesAdv.absraction;

/**
 * Created by WERT on 18.01.2017.
 */
class Cat extends Animal {

    Cat(String aType) {
        super(aType);
    }

    @Override
    void getSound() {
        System.out.println("Мяу-мяу");
    }

}
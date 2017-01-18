package classesAdv.absraction;

/**
 * Created by WERT on 18.01.2017.
 */
class Cow extends Animal {

    Cow(String aType) {
        super(aType);
    }

    @Override
    void getSound() {
        System.out.println("Му-му");
    }

}
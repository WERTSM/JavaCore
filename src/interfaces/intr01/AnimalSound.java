package interfaces.intr01;

/**
 * Created by WERT on 18.01.2017.
 */
public class AnimalSound {

    public static void main(String[] args) {

        Sound[] animal = new Sound[3];

        animal[0] = new Cow();
        animal[1] = new Cat();
        animal[2] = new Dog();

        for (int i = 0; i < 3; ++i) {

            System.out.print(animal[i].getType() + " ");
            animal[i].getSound();

        }

    }

}
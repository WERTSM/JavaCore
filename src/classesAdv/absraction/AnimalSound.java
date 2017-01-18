package classesAdv.absraction;

/**
 * Created by WERT on 18.01.2017.
 */
public class AnimalSound {

    public static void main(String[] args) {

        Animal[] animal = new Animal[3];

        animal[0] = new Cow("Корова");
        animal[1] = new Cat("Кошка");
        animal[2] = new Dog("Собака");

        for (int i = 0; i < 3; ++i) {

            System.out.print(animal[i].getType() + " ");
            animal[i].getSound();

        }

    }

}
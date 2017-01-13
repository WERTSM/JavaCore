package classesIntro;

/**
 * Created by WERT on 13.01.2017.
 */
public class Herd {

    public static void main(String[] args) {
        // примеры static полей и методов

        Cow cow1 = new Cow();
        System.out.println("Cow.count = " + Cow.count);
        Cow cow2 = new Cow("Буренка");
        System.out.println("Cow.getCount() = " + Cow.getCount());
        System.out.println();
        // так делать не рекомендуется
        System.out.println("cow1.count = " + cow1.count);
        System.out.println("cow2.getCount() = " + cow2.getCount());

    }

}
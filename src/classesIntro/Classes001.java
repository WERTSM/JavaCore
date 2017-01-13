package classesIntro;

/**
 * Created by WERT on 13.01.2017.
 */
public class Classes001 {

    public static void main(String[] args) {

        Box box1 = new Box(10, 20, 30);
        Box box2 = new Box(15, 15, 15);

        System.out.println("box 1 sizes");
        box1.printSizes();
        System.out.println("box1 volume = " + box1.getVolume());
        System.out.print("box 1 print volume ");
        box1.printVolume();

        System.out.println("\n\nbox 2 sizes");
        box2.printSizes();
        System.out.println("box2 volume = " + box2.getVolume());
        System.out.print("box 2 print volume ");
        box2.printVolume();

    }

}
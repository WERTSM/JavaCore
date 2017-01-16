package classesIntro;

/**
 * Created by WERT on 13.01.2017.
 */

import static util.Print.printLine;

public class Classes003 {

    public static void main(String[] args) {

        Box box1 = new Box();
        box1.setData(15);
        box1.setData("Box1");
        System.out.println("box1.depth = " + box1.depth);
        System.out.println("box1.label = " + box1.label);

        printLine();
        System.out.println();

        Box box2 = new Box();
        box2.setData(1, 2, 3);
        box2.setData("Box2");
        System.out.println("box2.depth = " + box2.depth);
        System.out.println("box2.depth = " + box2.label);

    }

}
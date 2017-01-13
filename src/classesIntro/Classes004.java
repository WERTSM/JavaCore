package classesIntro;

/**
 * Created by WERT on 13.01.2017.
 */
public class Classes004 {

    public static void main(String[] args) {

        Box box1 = new Box();
        System.out.println("box1.depth = " + box1.depth);
        Box box2 = new Box(10);
        System.out.println("box2.depth = " + box2.depth);
        Box box3 = new Box(10, 20, 30);
        System.out.println("box3.depth = " + box3.depth);

    }

}
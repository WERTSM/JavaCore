package classesIntro;

/**
 * Created by WERT on 13.01.2017.
 */
public class Classes007 {

    static void сhange(int i) {
        System.out.println("В методе change");
        i = 5;
    }

    static void сhange(Box b) {
        System.out.println("В методе change");
        b.setData("BOX1");
    }

    static void chnge(Box b) {
        System.out.println("В методе chhge");
        b = new Box();
        b.setData("NEW BOX");
    }

    public static void main(String[] args) {
        // примеры передачи аргументов в методы

        int a = 10;
        System.out.println("До вызова метода a = " + a);
        сhange(a);
        System.out.println("После вызова метода a = " + a);
        System.out.println();

        Box box1 = new Box();
        box1.setData("box1");
        System.out.println("До вызова метода box1.label = " + box1.label);
        сhange(box1);
        System.out.println("После вызова метода box1.label = " + box1.label);
        System.out.println();

        Box box2 = new Box();
        box2.setData("box2");
        System.out.println("До вызова метода box2.label = " + box2.label);
        chnge(box2);
        System.out.println("После вызова метода box2.label = " + box2.label);

    }

}
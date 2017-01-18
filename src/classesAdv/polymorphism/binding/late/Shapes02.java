package classesAdv.polymorphism.binding.late;

/**
 * Created by WERT on 18.01.2017.
 */
class Shape2 {

    void drow() {
        System.out.println("Shape2.drow()");
    }

    Shape2() {
        System.out.println("Shape2() перед вызовом drow()");
        drow();
        System.out.println("Shape2() после вызова drow()");
    }
}

class Circle2 extends Shape2 {
    private String color;

    {
        color = "Красный";
    }

    Circle2(String clr) {
        color = clr;
        System.out.println("Circle2(), color = " + color);
    }

    void drow() {
        System.out.println("Circle2.drow(), color = " + color);
    }

}

public class Shapes02 {
    public static void main(String[] args) {
        new Circle2("Жёлтый");
    }
}

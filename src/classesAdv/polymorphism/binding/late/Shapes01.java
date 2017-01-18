package classesAdv.polymorphism.binding.late;
/**
 * Created by WERT on 18.01.2017.
 */

import static util.Numbers.randomInRange;

public class Shapes01 {

    public static Shape RandomShape() {
        switch (randomInRange(0, 5)) {
            case 0:
                return new Shape();
            case 1:
                return new Circle();
            case 2:
                return new Square();
            case 3:
                return new Triangle();
            case 4:
                return new Oval();
            default:
                return new Rect();
        }
    }

    public static void main(String[] args) {
        // Пример полиморфизма
        Shape[] shape = new Shape[6];
        for (int i = 0; i < shape.length; i++) {
            shape[i] = RandomShape();
        }

        for (Shape s : shape) {
            s.drow();
        }
    }
}

class Shape {
    void drow() {
        System.out.println("Shape.drow()");
    }

    void erase() {
        System.out.println("Shape.erase()");
    }
}

class Circle extends Shape {
    void drow() {
        System.out.println("Circle.drow()");
    }
}

class Square extends Shape {
    void drow() {
        System.out.println("Square.drow()");
    }
}

class Triangle extends Shape {
    void drow() {
        System.out.println("Triangle.drow()");
    }
}

class Oval extends Circle {
    void drow() {
        System.out.println("Oval.drow()");
    }
}

class Rect extends Square {
    void drow() {
        System.out.println("Rect.drow()");
    }
}
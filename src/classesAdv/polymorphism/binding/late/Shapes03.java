package classesAdv.polymorphism.binding.late;

/**
 * Created by WERT on 18.01.2017.
 */
class Shape3 {
    public String toString() {
        return "Shape3";
    }
}

class Circle3 extends Shape3 {
    public String toString() {
        return "Circle3";
    }
}

class BuildShape3 {
    Shape3 build() {
        return new Shape3();
    }
}

class BuildCircle3 extends BuildShape3 {
    @Override
    Circle3 build() {
        return new Circle3();
    }
}

public class Shapes03 {
    public static void main(String[] args) {
        Shape3 s = new BuildShape3().build();
        System.out.println(s);
        s = new BuildCircle3().build();
        System.out.println(s);
    }
}
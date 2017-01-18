package classesAdv.polymorphism.overrite;

/**
 * Created by WERT on 18.01.2017.
 */
class B extends A {
    int i = 2; // Затеняет поле i класса A
    static double j = 2.0; // Затеняет статическое поле j класса A

    // Переопределяем метод f() класса A
    int f() {
        return -i;
    }

    // Переопределяем статический метод g() класса A
    static char g() {
        return 'B';
    }
}
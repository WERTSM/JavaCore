package classesAdv.polymorphism;

/**
 * Created by WERT on 18.01.2017.
 */
class A {

    int i = 1; // Поле экземпляра
    static double j = 1.0; // поле класса

    // Метод экземпляра
    int f() {
        return i;
    }

    // Статический метод (метод класса)
    static char g() {
        return 'A';
    }
}
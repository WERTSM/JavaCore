package classesIntro;

/**
 * Created by WERT on 13.01.2017.
 */
class Box {

    double width;
    double height;
    double depth;
    String label = "Box";

    // конструктор принмающий три параметра
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор без параметров (по умолчанию)
    Box() {
    }

    // конструктор принимающий один параметр
    Box(double size) {
        width = height = depth = size;
    }

    // метод вывода объема на консоль
    void printVolume() {
        System.out.print(width * height * depth);
    }

    // метод вывода размеров Box на консоль
    void printSizes() {
        System.out.println("width  = " + width);
        System.out.println("height = " + height);
        System.out.println("depth  = " + depth);
    }

    // метод получения объема, возвращает double
    double getVolume() {
        return width * height * depth;
    }

    // задаем один и тот же размер
    void setSameSize(double size) {
        width = height = depth = size;
    }

    // задаем все размеры
    void setSizes(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // перегруженный метод setData
    void setData(double size) {
        width = height = depth = size;
    }

    void setData(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    void setData(String boxLabel) {
        label = boxLabel;
    }

}
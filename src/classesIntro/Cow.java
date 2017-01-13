package classesIntro;

/**
 * Created by WERT on 13.01.2017.
 */
public class Cow {

    static int count;

    String name = "NoNaMe";
    int age;
    double milkYield;

    // возвращаем ссылку на объект
    Cow getThis() {
        return this;
    }

    Cow() {
        name = null;
        ++count;
    }

    Cow(String name) {
        this();
        this.name = name;
    }

    Cow(String name, int age) {
        this(name);
        this.age = age;
    }

    static int getCount() {
        return count;
    }

    void setName(String name) {
        this.name = name;
    }

}
package inner_anonym_local_and_nested_classes.nested_static.clinint;

/**
 * Created by WORK_WERT on 19.01.2017.
 */
public interface IClassInInInterface {
    void printHello();

    class Print implements IClassInInInterface {

        @Override
        public void printHello() {
            System.out.println("Hello from Interface!");
        }

        public static void main(String[] args) {
            new Print().printHello();
        }

    }

}
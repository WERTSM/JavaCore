package inner_anonym_local_and_nested_classes.anonymous.anonym02;

/**
 * Created by WORK_WERT on 19.01.2017.
 */

class External {
    External() {
    }

    Object getThis() {
        return this;
    }

    static External iext = new External() {
    };
}

public class Main {

    public static void main(String[] args) {

        External ext = new External();
        System.out.println("ext.this = " + ext.getThis());

        External extanonym = External.iext;
        System.out.println("extanonym1.this = " + extanonym.getThis());

    }

}
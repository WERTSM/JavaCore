package interfaces.intr01;

/**
 * Created by WERT on 18.01.2017.
 */
public interface Sound {

    default void getSound() {
        System.out.println("----");
    }

    String getType();

}
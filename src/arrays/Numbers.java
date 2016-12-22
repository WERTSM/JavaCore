package arrays;

/**
 * Created by WERT on 22.12.2016.
 */
public class Numbers {


    public static int randomInRange(int min, int max) {
        int range = Math.abs(max - min) + 1;
        return (int) (Math.random() * range) + (min <= max ? min : max);

    }

    public static double randomInRange(double min, double max) {
        double range = Math.abs(max - min);
        return (Math.random() * range) + (min <= max ? min : max);

    }

}
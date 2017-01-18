package interfaces.minmax;

/**
 * Created by WERT on 18.01.2017.
 */
public class MaxMinDemo {

    public static void main(String[] args) {

        MaxMin mm = new MaxMin();
        System.out.println("getMax(10, 5) = " + mm.getMax(10, 5));
        System.out.println("getMin(10, 5) = " + mm.getMin(10, 5));
    }

}
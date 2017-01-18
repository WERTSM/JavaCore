package interfaces.minmax;

/**
 * Created by WERT on 18.01.2017.
 */
public class MaxMin implements Min, Max {


    @Override
    public int getMax(int i, int j) {
        if (i > j) return i;
        return j;
    }

    @Override
    public int getMin(int i, int j) {
        if (i > j) return j;
        return i;
    }

}
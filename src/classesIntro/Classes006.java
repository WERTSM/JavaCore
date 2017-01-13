package classesIntro;

/**
 * Created by WERT on 13.01.2017.
 */

import static arrays.Strings.stringIsInteger;

public class Classes006 {

    public static void main(String[] args) {
        // рекурсивный метод main

        if (args.length == 0) return;
        if (!stringIsInteger(args[0])) return;

        int arg = Integer.valueOf(args[0]);
        if (arg < 1) return;
        System.out.println(arg--);
        args[0] = Integer.toString(arg);
        main(args);

    }

}
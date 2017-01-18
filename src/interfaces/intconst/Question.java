package interfaces.intconst;
/**
 * Created by WERT on 18.01.2017.
 */

import static util.Numbers.randomInRange;

public class Question implements SharedConstants {


    int ask() {

        int prob = randomInRange(0, 100);

        if (prob < 30)
            return NO;    // 30%
        else if (prob < 60)
            return YES;   // 30%
        else if (prob < 75)
            return LATER; // 15%
        else if (prob < 98)
            return SOON;  // 13%
        else
            return NEVER; // 2%
    }

}
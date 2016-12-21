package classes_bigdecimal_and_biginteger.class_bigdecimal_and_kolos_help_to_work.kolos_help_to_work;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * @author WERT
 */
public class KolosUniversal {
    public static void main(String[] args) {

        ArrayList<BigDecimal[]> varags = new ArrayList();

        double doublePrice1 = 360.57;
        double doublePrice2 = 707.02;
        double doublePrice3 = 652.08;

        double doubleLimit1 = 2157.00;
        double doubleLimit2 = 473.00;
        double doubleLimit3 = 1632.00;

        double doubleTotalAmount = 1_307_784.82;

        double doubleStep1 = 1.00;
        double doubleStep2 = 1.00;
        double doubleStep3 = 1.00;

        double minDoubleSpace1 = 1000.00;
        double minDoubleSpace2 = 200.00;
        double minDoubleSpace3 = 800.00;

        BigDecimal totalAmount = BigDecimal.valueOf(doubleTotalAmount);

        BigDecimal[] firstVar = new BigDecimal[4];
        firstVar[0] = BigDecimal.valueOf(doublePrice1);
        firstVar[1] = BigDecimal.valueOf(minDoubleSpace1);
        firstVar[2] = BigDecimal.valueOf(doubleLimit1);
        firstVar[3] = BigDecimal.valueOf(doubleStep1);

        BigDecimal[] secondVar = new BigDecimal[4];
        secondVar[0] = BigDecimal.valueOf(doublePrice2);
        secondVar[1] = BigDecimal.valueOf(minDoubleSpace2);
        secondVar[2] = BigDecimal.valueOf(doubleLimit2);
        secondVar[3] = BigDecimal.valueOf(doubleStep2);

        BigDecimal[] ferstVar = new BigDecimal[4];
        ferstVar[0] = BigDecimal.valueOf(doublePrice3);
        ferstVar[1] = BigDecimal.valueOf(minDoubleSpace3);
        ferstVar[2] = BigDecimal.valueOf(doubleLimit3);
        ferstVar[3] = BigDecimal.valueOf(doubleStep3);

        varags.add(firstVar);
        varags.add(secondVar);
        varags.add(ferstVar);

        KolosFor kolosFor = new KolosFor(varags, totalAmount);
        kolosFor.umaturman(ferstVar);
    }
}
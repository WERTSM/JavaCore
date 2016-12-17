package kolos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by WERT on 16.12.2016.
 */

public class KolosFor {

    BigDecimal totalAmount;
    List<BigDecimal[]> abb;
    ListIterator<BigDecimal[]> iter;

    KolosFor(List a, BigDecimal d) {
        this.totalAmount = d;
        this.abb = a;
        iter = abb.listIterator();
    }
/*
    public BigDecimal um(BigDecimal[] s) {
        BigDecimal tempTotalAmount = BigDecimal.valueOf(0.00);
        BigDecimal cost1 = (price1.multiply(forSpace1)).setScale(2, BigDecimal.ROUND_HALF_UP);
        BigDecimal cost2 = (price2.multiply(forSpace2)).setScale(2, BigDecimal.ROUND_HALF_UP);
        BigDecimal cost3 = (price3.multiply(forSpace3)).setScale(2, BigDecimal.ROUND_HALF_UP);
        tempTotalAmount = tempTotalAmount.add(cost1).add(cost2).add(cost3);//.add(cost4);

        return s[1].multiply(s[3]);
    }
*/


    public void umaturman(BigDecimal[] b) {
        for (BigDecimal forSpace3 = b[1]; forSpace3.compareTo(b[2]) <= 0; forSpace3 = forSpace3.add(b[3])) {
            System.out.println(forSpace3);
            if (iter.hasNext()) {
                umaturman(iter.next());
            }
            //else umaturman(iter.previous());


        }
    }
}



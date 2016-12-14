/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos;

import java.math.BigDecimal;

/**
 *
 * @author WERT
 */
public class kolos_1_2_1 {

    public static void main(String[] args) {
        BigDecimal z1, z2, z3;
        BigDecimal x1 = BigDecimal.valueOf(391.07);
        BigDecimal x2 = BigDecimal.valueOf(682.67);
        BigDecimal x3 = BigDecimal.valueOf(743.84);        
        BigDecimal xxx = BigDecimal.valueOf(2155681.50);

        BigDecimal result = BigDecimal.valueOf(4029283.53);
        BigDecimal tempresult = null;
        BigDecimal w1, w2, w3;

        /*
        BigDecimal t1 = BigDecimal.valueOf(12.00);
        BigDecimal t2 = BigDecimal.valueOf(3.06);
        BigDecimal t3 = BigDecimal.valueOf(5.35);
        BigDecimal t4 = BigDecimal.valueOf(1.03);
         */
        BigDecimal t1 = BigDecimal.valueOf(0.50);
        BigDecimal t2 = BigDecimal.valueOf(0.50);
        BigDecimal t3 = BigDecimal.valueOf(0.50);

        BigDecimal l1 = BigDecimal.valueOf(1683.00);
        BigDecimal l2 = BigDecimal.valueOf(1060.00);
        BigDecimal l3 = BigDecimal.valueOf(1000.00);
        for (w1 = BigDecimal.valueOf(1.00); w1.compareTo(l1) <= 0; w1 = w1.add(t1)) {
            //System.out.println(tempresult);
            //System.out.println(w1);
            for (w2 = BigDecimal.valueOf(1.00); w2.compareTo(l2) <= 0; w2 = w2.add(t2)) {
                //System.out.println(w2);
                for (w3 = BigDecimal.valueOf(1.00); w3.compareTo(l3) <= 0; w3 = w3.add(t3)) {
                    tempresult = BigDecimal.valueOf(0.00);
                    z1 = (x1.multiply(w1)).setScale(2, BigDecimal.ROUND_HALF_UP);
                    z2 = (x2.multiply(w2)).setScale(2, BigDecimal.ROUND_HALF_UP);
                    z3 = (x3.multiply(w3)).setScale(2, BigDecimal.ROUND_HALF_UP);
                    //System.out.println("z1 z2 z3= " + z1 +" "+z2+" "+z3);
                    tempresult = tempresult.add(z1).add(z2).add(z3).add(xxx);
                    //System.out.println("tempresult= " + tempresult);
                    if (tempresult.compareTo(result) == 0) {
                        System.out.println("YES");
                        System.out.println("w1 = " + w1 + "; w2 = " + w2 + " w3 = " + w3);
                    }
                }
            }
        }
    }
}

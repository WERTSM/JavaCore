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
public class kolos {

    public static void main(String[] args) {
        BigDecimal x1 = BigDecimal.valueOf(89674.49);
        BigDecimal y1 = BigDecimal.valueOf(4.00);
        BigDecimal z1, z2, z3;
        BigDecimal x2 = BigDecimal.valueOf(360.57);
        BigDecimal x3 = BigDecimal.valueOf(554.77);
        BigDecimal tempresult = BigDecimal.valueOf(0.00);
        BigDecimal result = BigDecimal.valueOf(1764489.32);
        BigDecimal w2, w3;
        BigDecimal t2 = BigDecimal.valueOf(0.01);
        BigDecimal t3 = BigDecimal.valueOf(0.01);
        BigDecimal l2 = BigDecimal.valueOf(12462.30);
        BigDecimal l3 = BigDecimal.valueOf(8.40);

        for (w2 = BigDecimal.valueOf(1.00); w2.compareTo(l2) <= 0; w2 = w2.add(t2)) {
            //System.out.println("w2= " + w2);
            for (w3 = BigDecimal.valueOf(1.00); w3.compareTo(l3) <= 0; w3 = w3.add(t3)) {
                //System.out.println("w3= " + w3);
                tempresult = BigDecimal.valueOf(0.00);
                z1 = (x1.multiply(y1)).setScale(2, BigDecimal.ROUND_HALF_UP);
                z2 = (x2.multiply(w2)).setScale(2, BigDecimal.ROUND_HALF_UP);
                z3 = (x3.multiply(w3)).setScale(2, BigDecimal.ROUND_HALF_UP);
                
                //System.out.println("z1 z2 z3= " + z1 +" "+z2+" "+z3);
                tempresult = tempresult.add(z1).add(z2).add(z3);
                //System.out.println("tempresult= " + tempresult);
                if (tempresult.compareTo(result) == 0) {
                    System.out.println("YES");
                    System.out.println("w1 = " + w2 + "; w2 = " + w3);
                }
            }
        }
    }
}

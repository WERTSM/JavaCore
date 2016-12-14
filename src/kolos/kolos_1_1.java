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
public class kolos_1_1 {

    public static void main(String[] args) {
        BigDecimal z1, z2, z3, z4;
        BigDecimal x1 = BigDecimal.valueOf(383.95);
        BigDecimal x2 = BigDecimal.valueOf(670.24);
        BigDecimal x3 = BigDecimal.valueOf(1346.44);
        BigDecimal x4 = BigDecimal.valueOf(718.64);
        BigDecimal xxx = BigDecimal.valueOf(35537.70);
        BigDecimal tempresult;
        BigDecimal result = BigDecimal.valueOf(3480806.22);
        BigDecimal w1, w2, w3, w4;
        BigDecimal t1 = BigDecimal.valueOf(1.00);
        BigDecimal t2 = BigDecimal.valueOf(1.00);
        BigDecimal t3 = BigDecimal.valueOf(1.00);
        BigDecimal t4 = BigDecimal.valueOf(1.00);
        BigDecimal l1 = BigDecimal.valueOf(7305.00);
        BigDecimal l2 = BigDecimal.valueOf(641.80);
        BigDecimal l3 = BigDecimal.valueOf(1122);
        BigDecimal l4 = BigDecimal.valueOf(130.74);
        for (w1 = BigDecimal.valueOf(5000.00); w1.compareTo(l1) <= 0; w1 = w1.add(t1)) {
            System.out.println(w1);
            for (w2 = BigDecimal.valueOf(300.00); w2.compareTo(l2) <= 0; w2 = w2.add(t2)) {
                //System.out.println(w2);
                for (w3 = BigDecimal.valueOf(1.50); w3.compareTo(l3) <= 0; w3 = w3.add(t3)) {
                    for (w4 = BigDecimal.valueOf(1.50); w4.compareTo(l4) <= 0; w4 = w4.add(t4)) {
                        tempresult = BigDecimal.valueOf(0.00);
                        z1 = (x1.multiply(w1)).setScale(2, BigDecimal.ROUND_HALF_UP);
                        z2 = (x2.multiply(w2)).setScale(2, BigDecimal.ROUND_HALF_UP);
                        z3 = (x3.multiply(w3)).setScale(2, BigDecimal.ROUND_HALF_UP);
                        z4 = (x4.multiply(w4)).setScale(2, BigDecimal.ROUND_HALF_UP);
                        //System.out.println("z1 z2 z3= " + z1 +" "+z2+" "+z3);
                        tempresult = tempresult.add(z1).add(z2).add(z3).add(z4).add(xxx);
                        //System.out.println("tempresult= " + tempresult);
                        if (tempresult.compareTo(result) == 0) {
                            System.out.println("YES");
                            System.out.println("w1 = " + w1 + "; w2 = " + w2 + "w3 = " + w3 + "; w4 = " + w4);
                        }
                    }
                }
            }
        }
    }
}

package kolos;

import java.math.BigDecimal;

/**
 * @author WERT
 */
public class KolosThreeVar {
    public static void main(String[] args) {

        double doublePrice1 = 360.57;
        double doublePrice2 = 707.02;
        double doublePrice3 = 652.08;
        //double doublePrice4 = 718.64;

        double doubleLimit1 = 2157.00;
        double doubleLimit2 = 473.00;
        double doubleLimit3 = 1632.00;
        //double doubleLimit4 = 277.00;

        //double doubleTotalAmount = 1_307_665.77;
        double doubleTotalAmount = 1_307_784.82;

        double doubleStep1 = 1.00;
        double doubleStep2 = 1.00;
        double doubleStep3 = 1.00;
        //double doubleStep4 = 1.00;

        double minDoubleSpace1 = 1000.00;
        double minDoubleSpace2 = 200.00;
        double minDoubleSpace3 = 800.00;
        //double minDoubleSpace4 = 120.00;

        BigDecimal cost1, cost2, cost3;//, cost4;
        BigDecimal price1 = BigDecimal.valueOf(doublePrice1);
        BigDecimal price2 = BigDecimal.valueOf(doublePrice2);
        BigDecimal price3 = BigDecimal.valueOf(doublePrice3);
        //BigDecimal price4 = BigDecimal.valueOf(doublePrice4);
        BigDecimal tempTotalAmount;
        BigDecimal totalAmount = BigDecimal.valueOf(doubleTotalAmount);

        BigDecimal space1 = BigDecimal.valueOf(minDoubleSpace1);
        BigDecimal space2 = BigDecimal.valueOf(minDoubleSpace2);
        BigDecimal space3 = BigDecimal.valueOf(minDoubleSpace3);
        // BigDecimal space4 = BigDecimal.valueOf(minDoubleSpace4);

        BigDecimal step1 = BigDecimal.valueOf(doubleStep1);
        BigDecimal step2 = BigDecimal.valueOf(doubleStep2);
        BigDecimal step3 = BigDecimal.valueOf(doubleStep3);
        // BigDecimal step4 = BigDecimal.valueOf(doubleStep4);

        BigDecimal limit1 = BigDecimal.valueOf(doubleLimit1);
        BigDecimal limit2 = BigDecimal.valueOf(doubleLimit2);
        BigDecimal limit3 = BigDecimal.valueOf(doubleLimit3);
        // BigDecimal limit4 = BigDecimal.valueOf(doubleLimit4);

        for (BigDecimal forSpace1 = space1; forSpace1.compareTo(limit1) <= 0; forSpace1 = forSpace1.add(step1)) {
            //System.out.println("Первая переменная - " + forSpace1 + " из " + limit1);
            tempTotalAmount = BigDecimal.valueOf(0.00);
            cost1 = (price1.multiply(forSpace1)).setScale(2, BigDecimal.ROUND_HALF_UP);
            cost2 = (price2.multiply(space2)).setScale(2, BigDecimal.ROUND_HALF_UP);
            cost3 = (price3.multiply(space3)).setScale(2, BigDecimal.ROUND_HALF_UP);
            // cost4 = (price4.multiply(space4)).setScale(2, BigDecimal.ROUND_HALF_UP);
            tempTotalAmount = tempTotalAmount.add(cost1).add(cost2).add(cost3);//.add(cost4);
            if (tempTotalAmount.compareTo(totalAmount) == 0) {
                System.out.println("\n---------------YES---------------\n");
                System.out.println("space1 = " + forSpace1 + "; space2 = " + space2 + "; space3 = " + space3 + "; space4 = ");// + forSpace4);
                System.out.println("\n---------------YES---------------\n");
            }
            //System.out.println(tempTotalAmount);
            if (tempTotalAmount.compareTo(totalAmount) < 0) {
                for (BigDecimal forSpace2 = space2; forSpace2.compareTo(limit2) <= 0; forSpace2 = forSpace2.add(step2)) {
                    //System.out.println("222222222222222222");
                    tempTotalAmount = BigDecimal.valueOf(0.00);
                    cost1 = (price1.multiply(forSpace1)).setScale(2, BigDecimal.ROUND_HALF_UP);
                    cost2 = (price2.multiply(forSpace2)).setScale(2, BigDecimal.ROUND_HALF_UP);
                    cost3 = (price3.multiply(space3)).setScale(2, BigDecimal.ROUND_HALF_UP);
                    // cost4 = (price4.multiply(space4)).setScale(2, BigDecimal.ROUND_HALF_UP);
                    tempTotalAmount = tempTotalAmount.add(cost1).add(cost2).add(cost3);//.add(cost4);
                    if (tempTotalAmount.compareTo(totalAmount) == 0) {
                        System.out.println("\n---------------YES---------------\n");
                        System.out.println("space1 = " + forSpace1 + "; space2 = " + forSpace2 + "; space3 = " + space3 + "; space4 = ");// + forSpace4);
                        System.out.println("\n---------------YES---------------\n");
                    }
                    if (tempTotalAmount.compareTo(totalAmount) < 0) {
                        for (BigDecimal forSpace3 = space3; forSpace3.compareTo(limit3) <= 0; forSpace3 = forSpace3.add(step3)) {
                            //System.out.println("3333333333333");
                            //tempTotalAmount = BigDecimal.valueOf(0.00);
                            //cost1 = (price1.multiply(forSpace1)).setScale(2, BigDecimal.ROUND_HALF_UP);
                            //cost2 = (price2.multiply(forSpace2)).setScale(2, BigDecimal.ROUND_HALF_UP);
                            //cost3 = (price3.multiply(forSpace3)).setScale(2, BigDecimal.ROUND_HALF_UP);
                            //cost4 = (price4.multiply(space4)).setScale(2, BigDecimal.ROUND_HALF_UP);
                            //tempTotalAmount = tempTotalAmount.add(cost1).add(cost2).add(cost3);//.add(cost4);
                            //if (tempTotalAmount.compareTo(totalAmount) < 0) {
                            // for (BigDecimal forSpace4 = space4; forSpace4.compareTo(limit4) <= 0; forSpace4 = forSpace4.add(step4)) {
                            tempTotalAmount = BigDecimal.valueOf(0.00);
                            cost1 = (price1.multiply(forSpace1)).setScale(2, BigDecimal.ROUND_HALF_UP);
                            cost2 = (price2.multiply(forSpace2)).setScale(2, BigDecimal.ROUND_HALF_UP);
                            cost3 = (price3.multiply(forSpace3)).setScale(2, BigDecimal.ROUND_HALF_UP);
                            //cost4 = (price4.multiply(forSpace4)).setScale(2, BigDecimal.ROUND_HALF_UP);
                            tempTotalAmount = tempTotalAmount.add(cost1).add(cost2).add(cost3);//.add(cost4);
                            //System.out.println(tempTotalAmount);
                            if (tempTotalAmount.compareTo(totalAmount) == 0) {
                                System.out.println("\n---------------YES---------------\n");
                                System.out.println("space1 = " + forSpace1 + "; space2 = " + forSpace2 + "; space3 = " + forSpace3 + "; space4 = ");// + forSpace4);
                                System.out.println("\n---------------YES---------------\n");
                            }
                            if (tempTotalAmount.compareTo(totalAmount) > 0) {
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
    //}
            //}
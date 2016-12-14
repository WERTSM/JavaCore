package kolos;

import java.math.BigDecimal;

/**
 * @author WERT
 */
public class kolos_4var {
    public static void main(String[] args) {

        double doublePrice1 = 360.57;
        double doublePrice2 = 652.08;
        double doublePrice3 = 554.77;
        double doublePrice4 = 360.57;

        double doubleLimit1 = 530.00;
        double doubleLimit2 = 2706.00;
        double doubleLimit3 = 40.00;
        double doubleLimit4 = 1190.00;

        double doubleTotalAmount = 1_750_598.00;

        double doubleStep1 = 1.00;
        double doubleStep2 = 1.00;
        double doubleStep3 = 1.00;
        double doubleStep4 = 1.00;

        double minDoubleSpace1 = 120.00;
        double minDoubleSpace2 = 700.00;
        double minDoubleSpace3 = 10.00;
        double minDoubleSpace4 = 300.00;

        BigDecimal cost1, cost2, cost3, cost4;
        BigDecimal price1 = BigDecimal.valueOf(doublePrice1);
        BigDecimal price2 = BigDecimal.valueOf(doublePrice2);
        BigDecimal price3 = BigDecimal.valueOf(doublePrice3);
        BigDecimal price4 = BigDecimal.valueOf(doublePrice4);
        BigDecimal tempTotalAmount = null;
        BigDecimal totalAmount = BigDecimal.valueOf(doubleTotalAmount);

        BigDecimal space1 = BigDecimal.valueOf(minDoubleSpace1);
        BigDecimal space2 = BigDecimal.valueOf(minDoubleSpace2);
        BigDecimal space3 = BigDecimal.valueOf(minDoubleSpace3);
        BigDecimal space4 = BigDecimal.valueOf(minDoubleSpace4);

        BigDecimal step1 = BigDecimal.valueOf(doubleStep1);
        BigDecimal step2 = BigDecimal.valueOf(doubleStep2);
        BigDecimal step3 = BigDecimal.valueOf(doubleStep3);
        BigDecimal step4 = BigDecimal.valueOf(doubleStep4);

        BigDecimal limit1 = BigDecimal.valueOf(doubleLimit1);
        BigDecimal limit2 = BigDecimal.valueOf(doubleLimit2);
        BigDecimal limit3 = BigDecimal.valueOf(doubleLimit3);
        BigDecimal limit4 = BigDecimal.valueOf(doubleLimit4);

        for (BigDecimal forSpace1 = space1; forSpace1.compareTo(limit1) <= 0; forSpace1 = forSpace1.add(step1)) {
            System.out.println("Первая переменная - " + forSpace1);
            tempTotalAmount = BigDecimal.valueOf(0.00);
            cost1 = (price1.multiply(forSpace1)).setScale(2, BigDecimal.ROUND_HALF_UP);
            cost2 = (price2.multiply(space2)).setScale(2, BigDecimal.ROUND_HALF_UP);
            cost3 = (price3.multiply(space3)).setScale(2, BigDecimal.ROUND_HALF_UP);
            cost4 = (price4.multiply(space4)).setScale(2, BigDecimal.ROUND_HALF_UP);
            //System.out.println("cost1 cost2 cost3= " + cost1 +" "+cost2+" "+cost3);
            tempTotalAmount = tempTotalAmount.add(cost1).add(cost2).add(cost3).add(cost4);
            //System.out.println("tempTotalAmount= " + tempTotalAmount);
            if (tempTotalAmount.compareTo(totalAmount) < 0) {
                //System.out.println("Первая переменная слишком большая");

                for (BigDecimal forSpace2 = space2; forSpace2.compareTo(limit2) <= 0; forSpace2 = forSpace2.add(step2)) {

                    tempTotalAmount = BigDecimal.valueOf(0.00);
                    cost1 = (price1.multiply(forSpace1)).setScale(2, BigDecimal.ROUND_HALF_UP);
                    cost2 = (price2.multiply(forSpace2)).setScale(2, BigDecimal.ROUND_HALF_UP);
                    cost3 = (price3.multiply(space3)).setScale(2, BigDecimal.ROUND_HALF_UP);
                    cost4 = (price4.multiply(space4)).setScale(2, BigDecimal.ROUND_HALF_UP);
                    //System.out.println("cost1 cost2 cost3= " + cost1 +" "+cost2+" "+cost3);
                    tempTotalAmount = tempTotalAmount.add(cost1).add(cost2).add(cost3).add(cost4);
                    //System.out.println("tempTotalAmount= " + tempTotalAmount);
                    if (tempTotalAmount.compareTo(totalAmount) < 0) {
                        //System.out.println("Вторая переменная слишком большая");


                        for (BigDecimal forSpace3 = space3; forSpace3.compareTo(limit3) <= 0; forSpace3 = forSpace3.add(step3)) {

                            tempTotalAmount = BigDecimal.valueOf(0.00);
                            cost1 = (price1.multiply(forSpace1)).setScale(2, BigDecimal.ROUND_HALF_UP);
                            cost2 = (price2.multiply(space2)).setScale(2, BigDecimal.ROUND_HALF_UP);
                            cost3 = (price3.multiply(forSpace3)).setScale(2, BigDecimal.ROUND_HALF_UP);
                            cost4 = (price4.multiply(space4)).setScale(2, BigDecimal.ROUND_HALF_UP);
                            //System.out.println("cost1 cost2 cost3= " + cost1 +" "+cost2+" "+cost3);
                            tempTotalAmount = tempTotalAmount.add(cost1).add(cost2).add(cost3).add(cost4);
                            //System.out.println("tempTotalAmount= " + tempTotalAmount);
                            if (tempTotalAmount.compareTo(totalAmount) < 0) {
                                //System.out.println("Третья переменная слишком большая");


                                for (BigDecimal forSpace4 = space4; forSpace4.compareTo(limit4) <= 0; forSpace4 = forSpace4.add(step4)) {

                                    tempTotalAmount = BigDecimal.valueOf(0.00);
                                    cost1 = (price1.multiply(forSpace1)).setScale(2, BigDecimal.ROUND_HALF_UP);
                                    cost2 = (price2.multiply(forSpace2)).setScale(2, BigDecimal.ROUND_HALF_UP);
                                    cost3 = (price3.multiply(forSpace3)).setScale(2, BigDecimal.ROUND_HALF_UP);
                                    cost4 = (price4.multiply(forSpace4)).setScale(2, BigDecimal.ROUND_HALF_UP);
                                    //System.out.println("cost1 cost2 cost3= " + cost1 +" "+cost2+" "+cost3);
                                    tempTotalAmount = tempTotalAmount.add(cost1).add(cost2).add(cost3).add(cost4);
                                    //System.out.println("tempTotalAmount= " + tempTotalAmount);
                                    if (tempTotalAmount.compareTo(totalAmount) == 0) {
                                        System.out.println("YES");
                                        System.out.println("space1 = " + forSpace1 + "; space2 = " + forSpace2 + "; space3 = " + forSpace3 + "; space4 = " + forSpace4);
                                    }
                                    if (tempTotalAmount.compareTo(totalAmount) > 0) {
                                        //System.out.println("Четвертая переменная слишком большая");
                                        //System.out.println("space1 = " + forSpace1 + "; space2 = " + forSpace2 + "; space3 = " + forSpace3 + "; space4 = " + forSpace4);

                                        break;
                                    }
                                    //System.out.println("Пока4");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

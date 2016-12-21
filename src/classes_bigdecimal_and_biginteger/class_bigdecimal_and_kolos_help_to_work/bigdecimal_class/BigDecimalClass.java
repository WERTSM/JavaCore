package classes_bigdecimal_and_biginteger.class_bigdecimal_and_kolos_help_to_work.bigdecimal_class;

import java.math.BigDecimal;

/**
 * Created by WORK_WERT on 19.12.2016.
 */

public class BigDecimalClass {

    public static void main(String[] args) {
        // Примеры работы с BigDecimal

        // пример сути проблемы с точностью представления double
        double d1 = 2;
        double d2 = 1.1;
        System.out.println("d1 = " + d1 + "   d2 = " + d2);
        System.out.println("d1-d2 = " + (d1 - d2));

        // как это решается с использованием BigDecimal
        BigDecimal bd1 = BigDecimal.valueOf(2);
        BigDecimal bd2 = BigDecimal.valueOf(1.1);
        System.out.println("bd1 = " + bd1 + "   bd2 = " + bd2);
        System.out.println("bd1-bd2 = " + (bd1.subtract(bd2)));

        double d3 = 10;
        double d4 = 0.0825;
        System.out.println("d3*d4 = " + (d3 * d4));

        // лучше создавать объекты BigDecimal из строки
        // или при помощи метда valueOf()
        BigDecimal bd3 = new BigDecimal(0.3);
        System.out.println("bd3 = " + bd3);
        bd3 = new BigDecimal("0.3");
        System.out.println("bd3 = " + bd3);
        bd3 = BigDecimal.valueOf(0.3);
        System.out.println("bd3 = " + bd3);

        // примеры округления
        bd3 = new BigDecimal(0.3);
        // bd3.setScale(1); //выдаст ошибку
        System.out.println("ROUND_CEILING bd3 = " + bd3.setScale(1, BigDecimal.ROUND_CEILING));

        // ROUND_CEILING: В большую сторону
        System.out.println();
        System.out.println("ROUND_CEILING: В большую сторону");
        BigDecimal bdr = new BigDecimal("0.333");
        System.out.print("bdr =  " + bdr);
        System.out.println("   ROUND_CEILING bdr =  " + bdr.setScale(2, BigDecimal.ROUND_CEILING));
        bdr = new BigDecimal("-0.333");
        System.out.print("bdr = " + bdr);
        System.out.println("   ROUND_CEILING bdr = " + bdr.setScale(2, BigDecimal.ROUND_CEILING));

        // ROUND_DOWN: Округление в меньшую сторону по модулю
        System.out.println();
        System.out.println("ROUND_DOWN: Округление в меньшую сторону по модулю");
        bdr = new BigDecimal("0.333");
        System.out.print("bdr =  " + bdr);
        System.out.println("   ROUND_DOWN bdr =  " + bdr.setScale(2, BigDecimal.ROUND_DOWN));
        bdr = new BigDecimal("-0.333");
        System.out.print("bdr = " + bdr);
        System.out.println("   ROUND_DOWN bdr = " + bdr.setScale(2, BigDecimal.ROUND_DOWN));

        // ROUND_UP: Округление в большую сторону по модулю
        System.out.println();
        System.out.println("ROUND_UP: Округление в большую сторону по модулю");
        bdr = new BigDecimal("0.333");
        System.out.print("bdr =  " + bdr);
        System.out.println("   ROUND_UP bdr =  " + bdr.setScale(2, BigDecimal.ROUND_UP));
        bdr = new BigDecimal("-0.333");
        System.out.print("bdr = " + bdr);
        System.out.println("   ROUND_UP bdr = " + bdr.setScale(2, BigDecimal.ROUND_UP));

        // ROUND_FLOOR: В меньшую сторону
        System.out.println();
        System.out.println("ROUND_FLOOR: В меньшую сторону");
        bdr = new BigDecimal("0.333");
        System.out.print("bdr =  " + bdr);
        System.out.println("   ROUND_FLOOR bdr =  " + bdr.setScale(2, BigDecimal.ROUND_FLOOR));
        bdr = new BigDecimal("-0.333");
        System.out.print("bdr = " + bdr);
        System.out.println("   ROUND_FLOOR bdr = " + bdr.setScale(2, BigDecimal.ROUND_FLOOR));

        // ROUND_HALF_UP: Округление вверх, если число после запятой >= .5
        System.out.println();
        System.out.println("ROUND_HALF_UP: Округление вверх, если число после запятой >= .5");
        bdr = new BigDecimal("0.335");
        System.out.print("bdr =  " + bdr);
        System.out.println("   ROUND_HALF_UP bdr =  " + bdr.setScale(2, BigDecimal.ROUND_HALF_UP));
        bdr = new BigDecimal("-0.335");
        System.out.print("bdr = " + bdr);
        System.out.println("   ROUND_HALF_UP bdr = " + bdr.setScale(2, BigDecimal.ROUND_HALF_UP));
        bdr = new BigDecimal("0.333");
        System.out.print("bdr =  " + bdr);
        System.out.println("   ROUND_HALF_UP bdr =  " + bdr.setScale(2, BigDecimal.ROUND_HALF_UP));
        bdr = new BigDecimal("-0.333");
        System.out.print("bdr = " + bdr);
        System.out.println("   ROUND_HALF_UP bdr = " + bdr.setScale(2, BigDecimal.ROUND_HALF_UP));

        // ROUND_HALF_DOWN: Округление вверх, если число после запятой > .5
        System.out.println();
        System.out.println("ROUND_HALF_DOWN: Округление вверх, если число после запятой > .5");
        bdr = new BigDecimal("0.335");
        System.out.print("bdr =  " + bdr);
        System.out.println("   ROUND_HALF_DOWN bdr =  " + bdr.setScale(2, BigDecimal.ROUND_HALF_DOWN));
        bdr = new BigDecimal("-0.335");
        System.out.print("bdr = " + bdr);
        System.out.println("   ROUND_HALF_DOWN bdr = " + bdr.setScale(2, BigDecimal.ROUND_HALF_DOWN));
        bdr = new BigDecimal("0.336");
        System.out.print("bdr =  " + bdr);
        System.out.println("   ROUND_HALF_DOWN bdr =  " + bdr.setScale(2, BigDecimal.ROUND_HALF_DOWN));
        bdr = new BigDecimal("-0.336");
        System.out.print("bdr = " + bdr);
        System.out.println("   ROUND_HALF_DOWN bdr = " + bdr.setScale(2, BigDecimal.ROUND_HALF_DOWN));

        // ROUND_HALF_EVEN: Округление по четности
        System.out.println();
        System.out.println("ROUND_HALF_EVEN: Округление по четности");
        bdr = new BigDecimal("0.335");
        System.out.print("bdr =  " + bdr);
        System.out.println("  ROUND_HALF_EVEN bdr =  " + bdr.setScale(2, BigDecimal.ROUND_HALF_EVEN));
        bdr = new BigDecimal("0.325");
        System.out.print("bdr =  " + bdr);
        System.out.println("  ROUND_HALF_EVEN bdr =  " + bdr.setScale(2, BigDecimal.ROUND_HALF_EVEN));

        bdr = new BigDecimal("-0.335");
        System.out.print("bdr = " + bdr);
        System.out.println("  ROUND_HALF_EVEN bdr = " + bdr.setScale(2, BigDecimal.ROUND_HALF_EVEN));
        bdr = new BigDecimal("-0.325");
        System.out.print("bdr = " + bdr);
        System.out.println("  ROUND_HALF_EVEN bdr = " + bdr.setScale(2, BigDecimal.ROUND_HALF_EVEN));

        // ROUND_UNNECESSARY: без округления
        System.out.println();
        System.out.println("ROUND_UNNECESSARY: без округления");
        bdr = new BigDecimal("0.333");
        System.out.print("bdr =  " + bdr);
        System.out.println("   ROUND_UNNECESSARY bdr =  " + bdr.setScale(3, BigDecimal.ROUND_UNNECESSARY));
        bdr = new BigDecimal("-0.333");
        System.out.print("bdr = " + bdr);
        System.out.println("   ROUND_UNNECESSARY bdr = " + bdr.setScale(3, BigDecimal.ROUND_UNNECESSARY));

        System.out.println("\nПример деления с округленим");
        BigDecimal bd01 = new BigDecimal("1");
        BigDecimal bd03 = new BigDecimal("3");
        // BigDecimal bd1d3 = bd01.divide(bd03); // вызовет ошибку ArithmeticException
        BigDecimal bd1d3 = bd01.divide(bd03, 5, BigDecimal.ROUND_HALF_UP);
        System.out.println("bd1d3 = " + bd1d3);

        System.out.println("\nПримеры сравнения");
        BigDecimal a = new BigDecimal("2.00");
        BigDecimal b = new BigDecimal("2.0");
        System.out.println("a = " + a + "  b = " + b);
        System.out.println("a.equals(b) = " + a.equals(b)); // ложь

        // возвращает (-1 если a < b), (0 если a == b), (1 если a > b)
        System.out.println("a.compareTo(b) = " + a.compareTo(b));
        // возвращает (-1 если a < 0), (0 если a == 0), (1 если a > 0)
        System.out.println("a.signum() = " + a.signum());

        // убираем незначащие нули в конце BigDecimal
        System.out.println("\nУбираем незначащие нули в конце BigDecimal");
        BigDecimal bd_1 = new BigDecimal("1.55");
        BigDecimal bd_2 = new BigDecimal("3.15");
        BigDecimal bd_3 = bd_1.add(bd_2);
        System.out.println("bd_3 = " + bd_3);
        System.out.println("bd_3 = " + bd_3.stripTrailingZeros());

    }

}
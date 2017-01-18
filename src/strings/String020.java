package strings;

/**
 * Created by WERT on 09.01.2017.
 */

import static util.Numbers.randomInRange;

public class String020 {

    public static void main(String[] args) {
        // примеры форматирования строк

        double[][] db = new double[10][10];

        // заполнение случайными числами и вывод неформатированных значений
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < 10; ++j) {
                db[i][j] = randomInRange(1.0, 999.0);
                System.out.print(" " + db[i][j]);

            }
            System.out.println();
        }

        System.out.println();
        // вывод форматированных значений
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < 10; ++j) {
                System.out.printf("%7.2f", db[i][j]);

            }
            System.out.println();
        }

    }

}
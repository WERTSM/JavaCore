package strings;

/**
 * Created by WERT on 09.01.2017.
 */
public class String012 {

    private static final int SIZE_OF_STRING = 10_000;
    private static long time;

    public static void main(String[] args) {
        // примеры конкатенации строк

        String sl = "";
        String so = new String();
        StringBuilder sb = new StringBuilder();

        System.out.print("\nНа создание строки sl ушло ");
        startBenchmark();
        for (int i = 0; i < SIZE_OF_STRING; ++i)
            sl += "1";
        stopBenchmark();

        System.out.print("\nНа создание строки so ушло ");
        startBenchmark();
        for (int i = 0; i < SIZE_OF_STRING; ++i)
            so += "1";
        stopBenchmark();

        System.out.print("\nНа создание строки sb ушло ");
        startBenchmark();
        for (int i = 0; i < SIZE_OF_STRING; ++i)
            sb.append("1");
        stopBenchmark();

        System.out.println("\nsb.length() = " + sb.length());
    }

    private static void startBenchmark() {
        time = System.currentTimeMillis();
    }

    private static void stopBenchmark() {
        time = System.currentTimeMillis() - time;
        System.out.println(time + "мс");
    }

}
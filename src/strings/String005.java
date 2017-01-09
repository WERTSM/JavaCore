package strings;

/**
 * Created by WERT on 09.01.2017.
 */
public class String005 {

    public static void main(String[] args) {
        // пример работы с кодовыми точками и строками в Java

        // суррогатная пара математического символа Z
        char cz1 = '\uD835';
        char cz2 = '\uDD6B';

        System.out.println("cz1 = " + cz1);
        System.out.println("cz2 = " + cz2);

        // создали массив из одной кодовой точки
        int[] codePoint = {Character.toCodePoint(cz1, cz2)};
        System.out.println("\ncodePoint[0] = " + codePoint[0]);
        // преобразовали кодовую точку в символьную строку
        String zs = new String(codePoint, 0, 1);
        System.out.println("zs = " + zs);

        // создаем массив кодовых точек с кодами символов планет
        int[] planets = new int[9];
        for (int ip = 9791, i = 0; i < 9; ++i, ++ip)
            planets[i] = ip;

        // преобразовали массив кодовых точек планет в строку
        String sPlanets = new String(planets, 0, 9);
        System.out.println("\nsPlanets = " + sPlanets);

    }

}
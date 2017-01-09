package strings;

/**
 * Created by WERT on 09.01.2017.
 */
public class String014 {

    public static void main(String[] args) {
        // примеры сравнения строк

        String s1 = "Hello"; // Строковый литерал
        String s2 = "World"; // Строковый литерал
        String s3 = s1; // одинаковые ссылки
        String s4 = new String("Hello"); // Строковый объект
        String s5 = new String("Hello"); // Строковый объект
        String s6 = new String("World"); // Строковый объект
        String s7 = s5; // одинаковые ссылки

        System.out.println("s1==s2 это " + (s1 == s2) + " разные ссылки");
        System.out.println("s1==s3 это " + (s1 == s3) + " одинаковые ссылки");
        System.out.println("s7==s5 это " + (s7 == s5) + " одинаковые ссылки");
        System.out.println("s1==s4 это " + (s1 == s4) + " разные ссылки");
        System.out.println("s2==s6 это " + (s2 == s6) + " разные ссылки");
        System.out.println("\ns4 = " + s4 + "   s5 = " + s5);
        System.out.println("s4==s5 это " + (s4 == s5) + " разные ссылки");
        System.out.println("s4.equals(s5) это " + s4.equals(s5) + " одинаковое содержимое");
        System.out.println("s4.equals(s1) это " + s4.equals(s1) + " одинаковое содержимое");
        System.out.println("s2.equals(s6) это " + s2.equals(s6) + " одинаковое содержимое");

    }

}
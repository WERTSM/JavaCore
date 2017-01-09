package strings;

/**
 * Created by WERT on 09.01.2017.
 */
public class String004 {

    public static void main(String[] args) {
        // примеры работы со строками в Java

        char[] c = {'C', 'и', 'м', 'в', 'о', 'л', 'ь', 'н', 'ы', 'й'};

        String s1 = new String(c);
        String s2 = new String(c, 3, 7);

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

    }

}
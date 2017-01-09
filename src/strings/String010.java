package strings;

/**
 * Created by WERT on 09.01.2017.
 */
public class String010 {

    public static void main(String[] args) {
        // примеры создания строк класса StringBuilder

        StringBuilder strBld1 = new StringBuilder("Это большая строка");
        String str1 = "не";
        strBld1.insert(4, str1);
        System.out.println("strBld1 = " + strBld1);
        str1 = null;
        strBld1.insert(strBld1.length(), " ");
        strBld1.insert(strBld1.length(), str1);
        System.out.println("strBld1 = " + strBld1);
        String009 str009 = new String009("!!! ");
        strBld1.insert(0, str009);
        System.out.println("strBld1 = " + strBld1);

        strBld1.delete(25, 108);
        System.out.println("strBld1 = " + strBld1);
        strBld1.deleteCharAt(0);
        System.out.println("strBld1 = " + strBld1);

        strBld1.replace(0, 2, "**");
        System.out.println("strBld1 = " + strBld1);

        System.out.println("reverse = " + strBld1.reverse());

        System.out.println("index ** = " + strBld1.indexOf("**"));
        System.out.println("index !! = " + strBld1.indexOf("!!"));
    }
}
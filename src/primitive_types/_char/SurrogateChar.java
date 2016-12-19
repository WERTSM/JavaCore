package primitive_types._char;

/**
 * Created by WERT on 14.12.2016.
 */
public class SurrogateChar {

    public static void main(String[] args) {
        // примеры работы с суррогатной парой
        char ch1 = 0xd83d;
        char ch2 = 0xde80;

        if (Character.isSurrogatePair(ch1, ch2)) {

            System.out.println("c1 и ch1 являются корректной суррогатной парой");

            // присвоение кодовой точки суррогатной пары ch1 и ch2 переменной
            // типа int
            int codePoint = Character.toCodePoint(ch1, ch2);
            System.out.println("Кодовая точка ch1 и ch2 равна " + codePoint);

            char ch[]; // объявили символьный массив
            ch = Character.toChars(codePoint);
            for (int i = 0; i < ch.length; i++) {
                // выводим символ определенный суррогатной парой
                System.out.print(ch[i]);
            }

        } else {

            System.out.println("c1 и ch1 не являются корректной суррогатной парой");

        }
    }

}

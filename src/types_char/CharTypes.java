package types_char;

/**
 * Created by WERT on 14.12.2016.
 */
public class CharTypes {
    public static void main(String[] args) {
        char om = '\u0950'; //символ омкары
        char tab1 = '\t'; //символ табуляции
        char tab2 = 9; //символ табуляции
        char tab3 = '\u0009'; //символ табуляции

        System.out.print(tab1);
        System.out.println(om);

        char ё = 'ё';

        System.out.print(tab2);
        System.out.print(ё);
        System.out.print(tab3);
        ё = 1105; //десятичный код ё
        System.out.print(ё);
        System.out.print(tab1);
        ё = '\u0451'; //шестнадцатиричный код ё
        System.out.println(ё);
        System.out.print('\t');

        System.out.println("\"Hello\n\t\t World!\"");

        ++ё;

        System.out.print('\t');
        System.out.println(ё);

        ё = 50805;
        System.out.print('\t');
        System.out.println(ё);

        //ё=ё+500;              //Разные типы
    }
}
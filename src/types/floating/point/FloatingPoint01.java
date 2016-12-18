package types.floating.point;

/**
 * Created by WORK_WERT on 18.12.2016.
 */

public class FloatingPoint01 {

    public static void main(String[] args) {
        // Примеры вещественных типов в Java
        //нижняя строчка не скомпилируется
        //так как вещественыне литералы по умолчанию double
        //float fl=3.14;
        double inf = 1.0/0.0; // Бесконечность
        double neginf = -1.0/0.0; // Отрицательная бесконечность
        double negzero = -1.0/inf; // Отрицательный нуль
        double plszero = 1.0/inf; // Положительный нуль
        double NaN1 = 0.0/0.0; // Не числовое значение
        double NaN2 = 0.0*inf; // Не числовое значение
        System.out.println("inf = "+inf);
        System.out.println("neginf = "+neginf);
        System.out.println("inf == neginf is "+(inf == neginf));
        System.out.println("\nnegzero = "+negzero);
        System.out.println("plszero = "+plszero);
        System.out.println("negzero == plszero is "+(negzero == plszero));
        System.out.println("\nNaN1 = "+NaN1);
        System.out.println("NaN2 = "+NaN2);
        System.out.println("NaN1 == NaN2 is "+(NaN1 == NaN2));
        System.out.println("NaN1 != NaN2 is "+(NaN1 != NaN2));
        double de = 0.125e4; //0.125*10^4=1250.0
        System.out.println("\nde = "+de);
        double he = 0xFp2; //15*2^2=60.0
        System.out.println("he = "+he);
        double a=5.0;
        double b=3.0;
        System.out.println("\na = "+a+"    b = "+b);
        System.out.println("a / b = "+(a/b));
        System.out.println("a % b = "+(a%b));
        System.out.println("a = ((long)(a/b))*b+(a%b) = "+(((long)(a/b))*b+(a%b)));
        double sqrt=Math.sqrt(a);
        System.out.println("\nКвадратный корень из "+a+" равен "+sqrt);
    }
}

package types_int;

/**
 * Created by WERT on 15.12.2016.
 */
public class TypesInt {
    // примеры операций с целочисленными типами
    public static void main(String[] args) {
        //long iLong = 2147483648;  // Ошибка
        long iLong = 2147483648L; // а здесь уже все нормально
        System.out.println("iLong=" + iLong);
        byte a, b;
        a = 5;
        b = 3;
        System.out.println("a=" + a + "   b=" + b);
        System.out.println("a+b=" + (a + b));
        System.out.println("a-b=" + (a - b));
        System.out.println("a*b=" + (a * b));
        System.out.println("a/b=" + (a / b));
        System.out.print("a%b=" + (a % b));
        System.out.println(" тоже самое что a-(a/b)*b=" + (a - (a / b) * b));
        System.out.println();
        System.out.println("a=" + a + "   b=" + b);
        System.out.println("Постфиксный инкремент a++. Сейчас a=" + a++);
        System.out.println("И только сейчас a=" + a);
        System.out.println("Постфиксный декремент a--. Сейчас a=" + a--);
        System.out.println("И только сейчас a=" + a);
        System.out.println("Префиксный инкремент ++a. Сейчас a=" + (++a));
        System.out.println("Префиксный декремент --a. Сейчас a=" + (--a));
        a += b; // равнозначно a=a+b
        System.out.println("После операции a+=b  a=" + a);
        a -= b; // равнозначно a=a-b
        System.out.println("После операции a-=b  a=" + a);
        byte c = 117;
        c=(byte)(c+241);
        //++c; // по существу
        //++c; // это все равно что 127+2=129
        System.out.println("Демонстрация переполнения c=" + c);
    }
}

package types_conversions;

public class TypeConv01 {

    public static void main(String[] args) {
        // Примеры не явного преорбазования примитивных типов Java
        int i1 = 1;
        byte b = 127;
        long лонг = 12145232132131l;
        //byte b4 = i1; ошибка хоть и умещается
        byte b4 = 123;//всё хорошо потому что литерерал
        //byte b1 = лонг; ошибка и не умещается
        byte b1 = (byte) лонг; //очень не точно преобразуем
        System.out.println("b1 = " + b1);

        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;
        System.out.println("b=" + b + " s=" + s + " i=" + i + " l=" + l + " f=" + f + " d=" + d);
        char c = 0x401;
        i = c;
        l = c;
        f = c;
        d = c;
        System.out.println("c=" + c + " i=" + i + " l=" + l + " f=" + f + " d=" + d);
        System.out.println("\nПреобразование с потерей точности");
        i = 0b11_1111_1111_1111_1111_1111_1111;
        f = i;
        System.out.println("i=" + i);
        System.out.println("f=" + f);
    }
}

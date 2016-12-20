package types_conversions;
import static primitive_types._byte_short_int_long.PrintByte.*;

public class TypeConv02 {

	public static void main(String[] args) {
		// Примеры явного преорбазования примитивных типов Java
		double d = 123.321;
		byte b = (byte) d; // просто отбросили дробную часть
		System.out.println("d = " + d);
		System.out.println("b = " + b);
		System.out.println("-------------");
		d = 454.874;
		b = (byte) d; // в результате b = -58
		System.out.println("d = " + d);
		System.out.println("b = " + b);
		System.out.println("-------------");
		System.out.println("454 % 256 = " + (454 % 256));
		System.out.print("454 в двоичном виде = ");
		printlnInt(454);
		System.out.print("198 в двоичном виде = ");
		printlnInt((454 % 256));
		b = (byte) (454 % 256);
		System.out.print("b десятичное = " + b + "   b двоичное = ");
		printlnByte(b);
		System.out.println("-------------");
		float bFloat = 10_000_000_000f;
		System.out.println("bFloat = " + bFloat);
		int bInt = (int) bFloat;
		System.out.println("bInt=  " + bInt); //Максимальное значение
		bFloat = -10_000_000_000f;
		bInt = (int) bFloat;
		System.out.println("bFloat = " + bFloat);
		System.out.println("bInt = " + bInt); //Минимальное значение
		System.out.println("-------------");
		byte b2 = 50;
		// b2 = b2 * 2; // не скомпилируется
		b2 *= 2; // скомпилируется, хотя и равнозначна b2 = b2 * 2
		System.out.println("b2 = " + b2);
		System.out.println("-------------");
		int i3 = 0;
		// 1_000_000_000_000L литерал больше допустимого значения int
		i3 += 1_000_000_000_000L; // но это скомпилируется
		System.out.println("i3 десятичное = " + i3);
		System.out.print("i3 двоичное = ");
		printlnInt(i3);
		System.out.println("-------------");
		Byte myB; // объект класса Byte
		myB = b2;
		System.out.println("myB = " + (myB++));
		b2 = myB;
		System.out.println("b2 = " + b2);
		i3 = myB;
		System.out.println("i3 = " + i3);
	}

}

import static pro.java.util.Print.*;

public class TypeConv02 {

	public static void main(String[] args) {
		// Примеры явного преорбазования примитивных типов Java
		double d = 123.321;
		byte b = (byte) d; // просто отбросили дробную часть
		println("d = " + d);
		println("b = " + b);
		println("-------------");
		d = 454.874;
		b = (byte) d; // в результате b = -58
		println("d = " + d);
		println("b = " + b);
		println("-------------");
		println("454 % 256 = " + (454 % 256));
		print("454 в двоичном виде = ");
		printlnInt(454);
		print("198 в двоичном виде = ");
		printlnInt((454 % 256));
		b = (byte) (454 % 256);
		print("b десятичное = " + b + "   b довичное = ");
		printlnByte(b);
		println("-------------");
		float bFloat = 10_000_000_000f;
		println("bFloat = " + bFloat);
		int bInt = (int) bFloat;
		println("bInt=  " + bInt);
		bFloat = -10_000_000_000f;
		bInt = (int) bFloat;
		println("bFloat = " + bFloat);
		println("bInt = " + bInt);
		println("-------------");
		byte b2 = 50;
		// b2 = b2 * 2; // не скомпилируется
		b2 *= 2; // скомпилируется, хотя и равнозначна b2 = b2 * 2
		println("b2 = " + b2);
		println("-------------");
		int i3 = 0;
		// 1_000_000_000_000L литерал больше допустимого значения int
		i3 += 1_000_000_000_000L; // но это скомпилируется
		println("i3 десятичное = " + i3);
		print("i3 довичное = ");
		printlnInt(i3);
		println("-------------");
		Byte myB; // объект класса Byte
		myB = b2;
		println("myB = " + (myB++));
		b2 = myB;
		println("b2 = " + b2);
		i3 = myB;
		println("i3 = " + i3);
	}

}

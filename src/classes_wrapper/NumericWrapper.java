package classes_wrapper;
import static primitive_types._byte_short_int_long.PrintByte.*;
/**
 * Created by WERT on 22.12.2016.
 */
public class NumericWrapper {

	public static void main(String[] args) {
		// примеры классов-оберток для числовых типов

		System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
		System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

		String sNum = "55"; // это строка а не число
		int a = Integer.parseInt(sNum);
		System.out.println("a = " + a);
		System.out.print(a+" в двоичном виде: ");
		printInt(a);
		System.out.println("\nbitCount in a is: "+Integer.bitCount(a));
	}
}
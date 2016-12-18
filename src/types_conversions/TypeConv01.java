package types_conversions;

public class TypeConv01 {

	public static void main(String[] args) {
		// Примеры не явного преорбазования примитивных типов Java
		byte b=127;
		short s=b;
		int i=s;
		long l=i;
		float f=l;
		double d=f;
		System.out.println("b="+b+" s="+s+" i="+i+" l="+l+" f="+f+" d="+d);
		char c=0x401;
		i=c;
		l=c;
		f=c;
		d=c;
		System.out.println("c="+c+" i="+i+" l="+l+" f="+f+" d="+d);
		System.out.println("\nПреобразование с потерей точности");
		i=0b11_1111_1111_1111_1111_1111_1111;
		f=i;
		System.out.println("i="+i);
		System.out.println("f="+f);
	}
}

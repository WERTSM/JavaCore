package classesIntro;

/**
 * Created by WERT on 13.01.2017.
 */
public class Classes015 {
	
	static int multiply(int a){ return a*a; }
	static int multiply(int a, int b){ return a*b; }
	static double multiply (double a) { return a*a; }

	public static void main(String[] args) {
		int a = multiply(5);
		System.out.println("a = " + a);
		a = multiply(a,a);
		System.out.println("a = " + a);
		double d = multiply(a);
		System.out.println("d = " + d);
	}

}
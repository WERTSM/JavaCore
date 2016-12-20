
package primitive_types._float_double;
public class FloatingPoint03 {

	public static void main(String[] args) {
		
		double dd = 3.33;
		float ff = (float)dd;
		System.out.println("dd = " + dd);
		System.out.println("ff = " + ff);
		System.out.println("ff == dd is " + (ff==dd));
		System.out.println("-------");
		dd = ff;
		System.out.println("dd = " + dd);
		System.out.println("ff = " + ff);
		System.out.println("ff == dd is " + (ff==dd));

	}

}

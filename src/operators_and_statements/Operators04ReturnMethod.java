package operators_and_statements;

public class Operators04ReturnMethod {

	public static void vReturn(int i) {
		if (i > 5)
			return;
		System.out.println("Сейчас в методе vReturn. i=" + i);
	}

	public static String strReturn(int i) {

		if (i >= 5)
			return i + ">=5";
		return i + "<5";
	}
}
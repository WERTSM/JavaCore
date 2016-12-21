package classes_wrapper;
/**
 * Created by WERT on 22.12.2016.
 */
public class BooleanWrapper {

	public static void main(String[] args) {
		// пример класса-обертки Boolean

		Boolean wBoolean = false;

		if (args.length > 0)
			wBoolean = Boolean.parseBoolean(args[0]);

		System.out.println("wBoolean is " + wBoolean.toString());
	}
}
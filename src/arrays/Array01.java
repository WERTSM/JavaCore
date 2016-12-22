package arrays;

/**
 * Created by WERT on 22.12.2016.
 */
public class Array01 {

	public static void main(String[] args) {
		// пример использования массива нулевой длины

		System.out.println("args.length = " + args.length + '\n');

		// классика жанра
		for (int i = 0; i < args.length; ++i) {
			System.out.println("args[" + i + "] = " + args[i]);
		}

		System.out.println();

		// извращение, но делает то же, что и классика
		for (int i = args.length; args.length > (args.length - i);System.out.println("После декремента i = " + i)) {

			System.out.println("args[" + (args.length - i) + "] = "
					+ args[args.length - i--]);
		}
	}
}
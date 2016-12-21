package classes_wrapper;
/**
 * Created by WERT on 22.12.2016.
 */
public class CharacterWrapper {

	public static void main(String[] args) {
		// пример класса-обертки Character

		if (args.length > 0) {
			for (char w : args[0].toCharArray()) {
				if (Character.isDigit(w)) {
					System.out.print(w+" - это число\n");
					continue;
				}
				System.out.print(w+" - это символ\n");
			}
		}
	}
}
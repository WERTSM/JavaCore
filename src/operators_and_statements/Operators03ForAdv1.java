package operators_and_statements;

public class Operators03ForAdv1 {

	public static void main(String[] args) {
		// пример продвинутого оператора for

		for (int i = 0; (args.length > 0 && args.length > i); System.out.println("Итерация "
				+ i + " завершена")) {
			System.out.println("\nПривет " + args[i++]);
		}
	}
}
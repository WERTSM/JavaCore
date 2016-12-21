package operators_and_statements;

public class Operators03DoWhile {

	public static void main(String[] args) {
		// Пример оператора do while
		int i = args.length;
		do {
			if (i == 0) break; // если нет аргументов то выходим из цикла
			--i;
			System.out.println("Привет " + args[i]);

		} while (i > 0);

		int n = 10;
		do {
			System.out.println("--> " + n);
		} while (--n > 0);

	}
}
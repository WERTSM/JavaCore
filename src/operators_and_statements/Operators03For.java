package operators_and_statements;

public class Operators03For {

	public static void main(String[] args) {
		// примеры оператора for
		int i; // i объявили вне цикла
		for (i = 0; i < args.length; ++i) {
			System.out.println("Сейчас i = " + i);
			System.out.println("Привет " + args[i]);
		}
		System.out.println("i = " + i); // i доступна вне цикла

		// j объявлена в цикле
		for (int j = 0; j < args.length; ++j) {
			System.out.println("Сейчас j = " + j);
			System.out.println("Hello " + args[j]);
		}
		int j=8;//Могу создать с таким же именем
		// println("j = " + j); // j не доступна вне цикла

		int a, b;
		for (a = 1, b = 4; a < b; a++, b--) {
			System.out.println("\nНачало итерации");
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("Завершение итерации");
		}
	}
}
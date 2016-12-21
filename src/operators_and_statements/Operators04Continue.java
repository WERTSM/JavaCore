package operators_and_statements;

public class Operators04Continue {

	public static void main(String[] args) {
		// пример оператора continue

		for (int i = 1; i < 11; i++) {
			if (i % 2 != 0) continue;
			System.out.println("Число " + i + " четное");
		}
		
		System.out.println();

		outer: for (int i = 0; i < 50; i++) {
			for (int j = 0; j < 50; j++) {
				if (j > i) {
					System.out.println();
					continue outer;
				}
				System.out.print("*");
			}
		}
	}
}
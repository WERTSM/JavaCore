package operators_and_statements;

public class Operators04Break01 {

	public static void main(String[] args) {
		// примеры оператора break

		for (int i = 0; i < 100; i++) {
			if (i == 3)
				break; // выход из цикла если i равно 3
			System.out.println("i: " + i);
		}
		System.out.println("Цикл завершен.");

		for (int i = 1; i < 4; ++i) {
			System.out.print("\nВнешний цикл. Итерация " + i + "\nВнутренний цикл:");
			for (int j = 1; j < 100; ++j) {
				if (j > 4) break;
				System.out.print(" " + j);
			}
		}

		extloop: for (int i = 1; i < 4; ++i) {
			System.out.print("\n\nВнешний extloop цикл. Итерация " + i + "\nВнутренний цикл:");
			for (int j = 1; j < 100; ++j) {
				if (j > 8) break extloop;
				System.out.print(" " + j);
			}
		}
	}
}

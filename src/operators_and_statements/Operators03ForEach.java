package operators_and_statements;

public class Operators03ForEach {

	public static void main(String[] args) {
		// пример оператора foreach

		if (args.length > 0)
			for (String str : args) {
				System.out.println("Привет " + str);
			}
		System.out.println();

		int nums[] = { 1, 2, 3, 4, 5 };
		int sum = 0, i = 0;
		// использование foreach для отображения и суммирования значений
		for (int x : nums) {
			System.out.println("Значение num[" + (i++) + "] равно: " + x);
			sum += x;
			x *= x; // ни как не влияет на значения массива nums
			if (i == 3)
				break; // прекращение цикла после 3 итераций
		}
		System.out.println("Сумма равна: " + sum);

		System.out.println();

		for (char c : "Привет МИР!".toCharArray()) {
			System.out.print(c);
		}
	}
}

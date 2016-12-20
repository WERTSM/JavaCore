package operators_and_statements;

public class Operators03While {

	public static void main(String[] args) {
		// Пример оператора while

		int i = args.length;

		while (i > 0) {
			--i;
			System.out.println("Привет " + args[i]);

		}

		int l, m;
		l = 100;
		m = 200;
		// вычисление среднего значения i и j
		while (++l < --m)
			; // в этом цикле тело цикла отсутствует
		System.out.println("Среднее значение равно " + l);

	}

}

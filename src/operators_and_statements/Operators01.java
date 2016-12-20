package operators_and_statements;

public class Operators01 {

	public static void main(String[] args) {
		// Простые примеры использования некоторых операторов

		System.out.println("Total: " + 3 + 4); // Отображает "Total: 34", не 7!

		// Отображает "Quotient: 2.3333333"
		System.out.println("Quotient: " + 7 / 3.0f);

		String sYes="присутствуют.";
		String sNo="отсутствуют.";
		String isArgs = ( args.length > 0) ? sYes : sNo;
		System.out.println("Аргументы в командной строке "+isArgs);

		System.out.println("Передано аргументов в командной строке: " + args.length);
		String sArgs = null;
		sArgs = (args.length != 0) ? args[0] : "unknown";
		System.out.println("name = " + sArgs);
	}
}

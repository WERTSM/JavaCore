package operators_and_statements;

public class Operators02IfElse {

	public static void main(String[] args) {
		// Примеры оператора if/else

		if (args.length == 0)
			System.out.println("Нет аргументов в командной строке");

		if (args.length > 0)
			System.out.println("В командной строке есть аргументы");
		else
			System.out.println("В командной строке нет аргументов");

		if (args.length == 1)
			System.out.println("В командной строке 1 аргумент");
		else if (args.length == 2)
			System.out.println("В командной строке 2 аргумента");
		else if (args.length == 3)
			System.out.println("В командной строке 3 аргумента");
		else if (args.length > 3)
			System.out.println("В командной строке больше 3 аргументов");
	}
}

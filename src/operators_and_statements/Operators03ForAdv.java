package operators_and_statements;

public class Operators03ForAdv {

	public static void main(String[] args) {
		// пример продвинутого оператора for

		int i = 0;
		for (boolean b = args.length > 0; b; System.out.println("Итерация " + i	+ " завершена")) //нельзя разные типы инииализировать - for(int v =6, short =3;;)//error
		{
			System.out.println("\nПривет " + args[i]);
			b = args.length > ++i;
		}

		// пример пустых частей оператора for
		boolean done = false;
		System.out.println();
		for (; !done;) {
			System.out.println("i равно " + i);
			if (i == 3)
				done = true;
			i++;
		}
	}
}
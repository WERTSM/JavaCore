package operators_and_statements;

public class Operators04Break02 {

	public static void main(String[] args) {
		// пример оператора break

		System.out.println("Начало программы");

		блок01: {
			System.out.println("Начало блока 01");
			блок02: {
				System.out.println("Начало блока 02");
				блок03: {
					System.out.println("Начало блока 03");

					switch (args.length) {
					case 0:
						break;
					case 1:
						break блок01;
					case 2:
						break блок02;
					case 3:
						break блок03;
					}
					System.out.println("Конец блока 03");
				}
				System.out.println("Конец блока 02");
			}
			System.out.println("Конец блока 01");
		}
		System.out.println("Конец программы");
	}
}

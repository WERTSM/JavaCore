package operators_and_statements;

public class Operators04ReturnMain {

	public static void main(String[] args) {
		// пример оператора return

		System.out.println("Вызываем vReturn(3)");
		Operators04ReturnMethod.vReturn(3);
		System.out.println("Вызываем vReturn(7)");
		Operators04ReturnMethod.vReturn(7);
		System.out.println();
		
		System.out.println("Вызываем strReturn(7)  "+Operators04ReturnMethod.strReturn(7));
		System.out.println("Вызываем strReturn(3)  "+Operators04ReturnMethod.strReturn(3));
		System.out.println("Вызываем strReturn(5)  "+Operators04ReturnMethod.strReturn(5));
		
	}
}
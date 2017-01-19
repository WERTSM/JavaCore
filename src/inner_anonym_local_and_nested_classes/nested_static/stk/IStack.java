package inner_anonym_local_and_nested_classes.nested_static.stk;

/**  * Created by WORK_WERT on 19.01.2017.  */

public interface IStack {

	void push(Object obj); // помещаем в стек
	Object pop(); // извлекаем из стека
	void printStack(); // печатем стек

	class FixedStack implements IStack {

		private static Object[] stk;
		private static int tos;

		// создание стека указанного размера
		public FixedStack(int size) {
			stk = new Object[size];
			tos = -1;
		}

		public void push(Object obj) {
			if (tos == stk.length - 1)
				System.out.println("Стек полон!");
			else
				stk[++tos] = obj;
		}

		public Object pop() {
			if (tos < 0)
				return null;
			else
				return stk[tos--];
		}

		public void printStack() {
			if (tos < 0) {
				System.out.println("Стек пуст!");
				return;
			}
			for (int i = tos; i > -1; --i) {
				System.out.println("Stack [" + i + "] = " + stk[i]);
			}
		}

		static class DynStack extends FixedStack {

			public DynStack(int size) {
				super(size);
			}

			@Override
			public void push(Object obj) {

				if (tos == stk.length - 1) {
					Object temp[] = new Object[stk.length * 2];
					for (int i = 0; i < stk.length; i++)
						temp[i] = stk[i];
					stk = temp;
					System.out.println("Размер стека увеличился");
					stk[++tos] = obj;
				} else
					stk[++tos] = obj;
			}
		}
	}
}

package inner_anonym_local_and_nested_classes.inner_nonstatic.inner01;

/**  * Created by WORK_WERT on 19.01.2017.  */

public class Main {

	public static void main(String[] args) {
		// Пример использования inner классов
		OuterClass outClass = new OuterClass();
		OuterClass.InnerClass ic1 = outClass.getInnerClass(1);
		OuterClass.InnerClass ic2 = outClass.getInnerClass(2);
		System.out.println("ic1.getInnerInt = " + ic1.getInnerInt());
		System.out.println("ic2.getInnerInt = " + ic2.getInnerInt());
		System.out.println("ic1.getOutInt = " + ic1.getOutInt());
		System.out.println("ic2.getOutInt = " + ic2.getOutInt());
		

	}

}

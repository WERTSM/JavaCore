package inner_anonym_local_and_nested_classes.anonymous.anonym04;

/**  * Created by WORK_WERT on 19.01.2017.  */

public class Base {
	private String str = "Base";
	Base(String str) {
		System.out.println("Base constructor, str= " + str);
		System.out.println("Base constructor, this.str= " + this.str);
	};
	Object getThis() { return this; }
	String getStr() { return str; }
	Base getAnonBase(String str) {
		return new Base(str) {
			{
				System.out.println("Инициализатор анонимного класса");
				System.out.println("str = " + str);
				System.out.println("Base.this.str = " + Base.this.str + '\n');
			}
		};
	}
}

class External extends Base {
	External () { this("Default External");};
	External(String str) { super(str); }
	private String str = "External";
	Base getAnonBase(String str) {
		return new Base(str) {
			{
				System.out.println("Инициализатор анонимного класса");
				System.out.println("str = " + str);
				System.out.println("External.this.str = " + External.this.str);
				System.out.println("getStr() = " + getStr() + '\n');
			}
		};
	}
}

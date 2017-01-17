package classesAdv.construct;
/**
 * Created by WERT on 17.01.2017.
 */
public class A {

	String a;
	{
		System.out.println("Инициализационный блок класса А");
	}
	
	A (){
		a = "Класс A";
		System.out.println(a + " Конструктор");
	}

}
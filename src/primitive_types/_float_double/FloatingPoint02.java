package primitive_types._float_double;
public class FloatingPoint02 {

	public static void main(String[] args) {

		double d = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
		float f = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;

		System.out.println("d= " + d);
		System.out.println("f= " + f);
		System.out.println("---------");
		System.out.println("0.35+0.33 = " + (0.35 + 0.33));
		System.out.println("---------");
		double d01 = 0.1;
		double d00 = 0;
		for (int i = 0; i < 10; i++) {
			d00 += d01;
			System.out.println("Итерация " + (i + 1) + "   " + d00);
		}
		System.out.println("---------");
		double d1 = .1;
		double d2 = .2;
		double d3 = .3;
		System.out.println("d1 = " + d1 + "  d2= " + d2 + "  d3= " + d3);
		System.out.println("Прямое сравнение");
		System.out.println("d1 + d2 = d3 " + ((d1 + d2) == d3));
		System.out.println("Проверка на допустимую погрешность – 0.0001");
		System.out.println("d1 + d2 = d3 " + (Math.abs(d1 + d2 - d3) < 1E-4));
		
		double dOne = 1.0;
		int count = 0;
		System.out.println("Пример когда d+x == d");
		for (double dd = 0; dd <= 4.9E-323; dd = Math.nextUp(dd)){
			if ((dOne + dd)== dOne ){ // вот это интересно :)
				System.out.println("dd = " + dd);
				count++;
			}
		}
		System.out.println("Итого в заданном промежутке есть " + count + " чисел");
		System.out.println("при суммировании с которыми dOne будет равно dOne :)");
		
		double dPlus = 4.9E-324;
		System.out.println("Например dPlus = " + dPlus + "  dOne = " + dOne);
		System.out.println("dOne + dPlus = " + (dPlus + dOne));
		dOne = dOne + dPlus;
		System.out.println("dOne = dOne + dPlus и после этого dOne == " + dOne);

	}

}

package arrays;

import java.util.Arrays;
/**
 * Created by WERT on 22.12.2016.
 */
public class Array13 {

	public static void main(String[] args) {
		// Примеры работы с массивами
		
		int myMaxOld=max_old(new int[]{5,8,9,7});
		System.out.println("myMaxOld = "+myMaxOld);
		
		//использум в вызове синтаксис Varargs
		int myMaxNew=max_new(5,8,3,7);
		System.out.println("myMaxNew = "+myMaxNew);
	}
	
	private static int max_old(int[] numbers){
		if (numbers.length==0) return 0;
		Arrays.sort(numbers);
		return numbers[numbers.length-1];
	}
	
	//использум в объявлении синтаксис Varargs
	private static int max_new(int... numbers){
		if (numbers.length==0) return 0;
		Arrays.sort(numbers);
		return numbers[numbers.length-1];
	}
}

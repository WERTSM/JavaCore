package classesIntro;

/**
 * Created by WERT on 13.01.2017.
 */
public class Dim {

	String[] strArray;

	Dim(String... strings) {
		strArray = strings;
	}

	void setIndex(int a, String str) {
		strArray[a] = str;
	}
	
	void printIndex(int a){
		System.out.print(strArray[a]);
	}
	
	String[] getStrArray(){
		return strArray;
	}

}

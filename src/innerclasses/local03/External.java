package innerclasses.local03;

/**  * Created by WORK_WERT on 19.01.2017.  */

interface GetLocalClass {
	String getLocalStr();
	String getStr();
}

class Ext {	String str = "Ext"; }

public class External {
	String str = "External";

	GetLocalClass getLocal(final String argstr) {

		class Local extends Ext implements GetLocalClass {
			String str = "Local";

			public String getLocalStr() { return argstr; }

			public String getStr() {
				return str + " " 
						+ External.this.str 
						+ " " + super.str;
			}
		}

		System.out.println("Метод getLocal() отработал.");
		return new Local();
	}

}

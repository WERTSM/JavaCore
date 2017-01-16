package classesAdv.packeges.pkg002;
import static util.Print.*;
import static classesAdv.packeges.pkg003.PubMod.*;

public class Mod02 {

	public static void main(String[] args) {
		// использование членов класса DefMod
		println("DefMod.defInt = " + DefMod.defInt);
		DefMod.defPrtLine();
		
		// использование членов класса ProMod
		println("ProMod.proInt = " + ProMod.proInt);
		ProMod.proPrtLine();
		
		// использование членов класса PrvMod
		PrvMod pm1 = new PrvMod();
		println("pm1.getPrvInt = " + pm1.getPrvInt());
		PrvMod pm2 = new PrvMod();
		pm2.setPrvInt(108);
		println("pm1.getPrvInt = " + pm1.getPrvInt());
		
		// использование членов класса PubMod
		classesAdv.packeges.pkg003.PubMod.pubPrtLine();
		pubPrtLine();
		println("pubInt = " + pubInt);
		pubInt = 64;
		println("pubInt = " + pubInt);

	}

}

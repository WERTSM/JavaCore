package classesAdv.packeges.pkg002;
/**
 * Created by WERT on 16.01.2017.
 */

import static classesAdv.packeges.pkg003.PubMod.pubInt;
import static classesAdv.packeges.pkg003.PubMod.pubPrtLine;

public class Mod02 {

    public static void main(String[] args) {
        // использование членов класса DefMod
        System.out.println("DefMod.defInt = " + DefMod.defInt);
        DefMod.defPrtLine();

        // использование членов класса ProMod
        System.out.println("ProMod.proInt = " + ProMod.proInt);
        ProMod.proPrtLine();

        // использование членов класса PrvMod
        PrvMod pm1 = new PrvMod();
        System.out.println("pm1.getPrvInt = " + pm1.getPrvInt());
        PrvMod pm2 = new PrvMod();
        pm2.setPrvInt(108);
        System.out.println("pm1.getPrvInt = " + pm1.getPrvInt());

        // использование членов класса PubMod
        classesAdv.packeges.pkg003.PubMod.pubPrtLine();
        pubPrtLine();
        System.out.println("pubInt = " + pubInt);
        pubInt = 64;
        System.out.println("pubInt = " + pubInt);

    }

}
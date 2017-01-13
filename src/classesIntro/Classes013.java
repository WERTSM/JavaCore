package classesIntro;

/**
 * Created by WERT on 13.01.2017.
 */
public class Classes013 {

    public static void main(String[] args) {
        System.out.println("------- str1 & str2 --------");
        Str str1 = new Str("Str1");
        str1.printStrHash();
        String str2 = "Str1";
        System.out.println("хэш объекта  str2 = " + System.identityHashCode(str2) + "  строка = " + str2);

        System.out.println("\n------- str3 & str4 --------");
        Str str3 = new Str(new String("Str1"));
        str3.printStrHash();
        String str4 = str3.getStr();
        System.out.println("хэш объекта  str4 = " + System.identityHashCode(str4) + "  строка = " + str4);

        System.out.println("\n------- str4 --------");
        str4 = str4.intern();
        System.out.println("хэш объекта  str4 = " + System.identityHashCode(str4) + "  строка = " + str4);

        System.out.println("\n------- Arrays --------");
        Dim dim1 = new Dim("один", "два", "три");
        System.out.print("Массив в классе Dim: ");
        for (String str : dim1.getStrArray()) {
            System.out.print(" " + str);
        }
        System.out.println();
        String[] strArray = dim1.getStrArray();
        for (int i = 0; i < strArray.length; ++i) {
            strArray[i] = String.valueOf(i + 1);
        }
        System.out.print("Массив в классе Dim: ");
        for (String str : dim1.getStrArray()) {
            System.out.print(" " + str);
        }

        dim1.setIndex(0, "one");
        dim1.setIndex(1, "two");
        dim1.setIndex(2, "three");
        System.out.println();
        System.out.print("Массив в классе strArray: ");
        for (String str : strArray) {
            System.out.print(" " + str);
        }

    }

}
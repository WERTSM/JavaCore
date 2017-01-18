package classesAdv.polymorphism;

/**
 * Created by WERT on 18.01.2017.
 */
class Super {
    String str = "ClassSuper";

    String getStr() {
        return str;
    }
}

class Sub extends Super {
    String str = "ClassSub";

    String getStr() {
        return str;
    }

    String getSuperStr() {
        return super.str;
    }
}

public class Supersub {

    public static void main(String[] args) {
        // Полиморфизм. Прямое обращение к полю.
        Super sup = new Sub();
        System.out.println("sup.str = " + sup.str + "  sup.getStr() = " + sup.getStr());
        System.out.println();
        Sub sub = new Sub();
        System.out.println("sub.str = " + sub.str + "  sub.getStr() = " + sub.getStr() + "  \nsub.getSuperStr() = " + sub.getSuperStr());
    }
}
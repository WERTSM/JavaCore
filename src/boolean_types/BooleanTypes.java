package boolean_types;
/**
 * Created by WERT on 13.12.2016.
 */
public class BooleanTypes {
    public static void main(String[] args) {
        // примеры работы с примитивным типом boolean
        boolean a=true;
        boolean b=false;

        System.out.println("a&&b="+(a&&b));
        System.out.println("a&&b="+(b&&a));
        System.out.println("a&&a="+(a&&a));
        System.out.println("b&&b="+(b&&b));
        System.out.println();

        System.out.println("a&b="+(a&b));
        System.out.println("b&a="+(b&a));
        System.out.println("a&a="+(a&a));
        System.out.println("b&b="+(b&b));
        System.out.println();

        System.out.println("a||b="+(a||b));
        System.out.println("b||a="+(b||a));
        System.out.println("a||a="+(a||a));
        System.out.println("b||b="+(b||b));
        System.out.println();

        System.out.println("a|b="+(a|b));
        System.out.println("b|a="+(b|a));
        System.out.println("a|a="+(a|a));
        System.out.println("b|b="+(b|b));
        System.out.println();

        System.out.println("a^b="+(a^b));
        System.out.println("b^a="+(b^a));
        System.out.println("a^a="+(a^a));
        System.out.println("b^b="+(b^b));
        System.out.println();
        System.out.println("-------------------------------------------------------------------");
        System.out.println();

        System.out.println("a="+a+"   b="+b);
        System.out.println("!a="+!a+"   !b="+!b);

        System.out.println("now a="+a+"   b="+b);
        System.out.println("after b|=a b="+(b|=a)); //b=b|a

        System.out.println("now a="+a+"   b="+b);
        System.out.println("after a^=b a="+(a^=b)); //a=a^b

        System.out.println("now a="+a+"   b="+b);
        System.out.println("after b&=a b="+(b&=a)); //b=b&a

        System.out.println("now a="+a+"   b="+b);

        int x=5;
        int y=3;
        int z=5;

        System.out.println();
        System.out.println("x="+x+"   y="+y+"   z="+z);
        System.out.println("x>y "+(x>y));
        System.out.println("x<y "+(x<y));
        System.out.println("x!=z "+(x!=z));
        System.out.println("x==z "+(x==z));
        System.out.println("x>=z "+(x>=z));
        System.out.println("y<=x "+(y<=x));

    }
}

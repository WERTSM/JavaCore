package innerclasses.nested;

/**
 * Created by WORK_WERT on 19.01.2017.
 */

import innerclasses.nested.Outer.IGetNames.GetNames;

public class Main {

    public static void main(String[] args) {
        // Пример использования nested классов

        // создали экземпляр вложенного класса
        // без создания экземпляра внешнего класса
        Outer.Nested nst = new Outer.Nested("MyNested");
        System.out.println(nst.getName());
        System.out.println(nst.getOuterName());
        System.out.println(Outer.out);
        System.out.println(Outer.Nested.nst);
        System.out.println("-------");

        // создали экземпляр внешнего класса
        Outer outer = new Outer();
        System.out.println(outer.getName());
        System.out.println(outer.getStnst());
        System.out.println("-------");

        // создали экземпляр вложеннго класса GetNames
        GetNames gn = new GetNames();
        System.out.println(gn.getOuterName());
        System.out.println(gn.getNestedStnst());
        System.out.println(gn.getNestedName(nst));

    }

}
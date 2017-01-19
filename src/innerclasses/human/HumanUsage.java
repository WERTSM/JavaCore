package innerclasses.human;

/**
 * Created by WORK_WERT on 19.01.2017.
 */

public class HumanUsage {

    public static void main(String[] args) {

        // создали объект вложенного класса Relations
        Human.Relations hr = new Human.Relations("married");

        // создали объект внешненго класса Human
        Human h = new Human();

        // присвоили объект hr полю relations обекта h
        h.relations = hr;

        System.out.println(h.relations.getRelatons());

    }

}
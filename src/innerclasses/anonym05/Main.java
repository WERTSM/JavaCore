package innerclasses.anonym05;

/**
 * Created by WORK_WERT on 19.01.2017.
 */

public class Main {

    public static void main(String[] args) {

        Account father = new Account("16108-1108", "BIG FATHER");
        System.out.println("father.owener -> " + father.getOwner());
        System.out.println("father.number -> " + father.getNumber());
        System.out.println("father.amount -> " + father.getAmount());
        Account.Card mother = father.new Card("mother108", "BIG MOTHER");
        System.out.println("mother.onwner -> " + mother.getOwner());
        System.out.println("mother.number -> " + mother.getNumber());
        System.out.println("mother.amount -> " + mother.getAmount());
        System.out.println("mother.withdrow " + mother.withdraw(18));
        System.out.println("mother.amount -> " + mother.getAmount());
        System.out.println("father.amount -> " + father.getAmount());
        mother.toDeposit(8);
        System.out.println("mother toDeposit(8)");
        System.out.println("mother.amount -> " + mother.getAmount());
        System.out.println("father.amount -> " + father.getAmount());
        father.toDeposit(10);
        System.out.println("father toDeposit(10)");
        System.out.println("mother.amount -> " + mother.getAmount());
        System.out.println("father.amount -> " + father.getAmount());

    }

}
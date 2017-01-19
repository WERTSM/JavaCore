package innerclasses.stk;

/**
 * Created by WORK_WERT on 19.01.2017.
 */

import static util.Print.printLnLineLn;

public class Main {

    public static void main(String[] args) {

        IStack fix = new IStack.FixedStack(3);
        fix.printStack();
        fix.push(1);
        printLnLineLn();
        fix.printStack();
        fix.push("строка");
        printLnLineLn();
        fix.printStack();
        fix.push(55.55);
        printLnLineLn();
        fix.printStack();
        fix.push(null);
        printLnLineLn();
        fix.printStack();
        fix.pop();
        printLnLineLn();
        fix.printStack();

        IStack dyn = new IStack.FixedStack.DynStack(2);
        System.out.println("******");
        dyn.printStack();
        dyn.push(10);
        printLnLineLn();
        dyn.printStack();
        dyn.push("другая строка");
        printLnLineLn();
        dyn.printStack();
        dyn.push(77.77);
        printLnLineLn();
        dyn.printStack();
        dyn.pop();
        printLnLineLn();
        dyn.printStack();

    }

}
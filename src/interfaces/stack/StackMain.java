package interfaces.stack;

/**
 * Created by WORK_WERT on 19.01.2017.
 */
public class StackMain {

    public static void main(String[] args) {

        IntStack fs = new FixedStack(3);
        fs.push(5);
        fs.printStack();
        System.out.println();
        fs.push(9);
        fs.printStack();
        fs.push(7);
        fs.push(3); // это не поместится в стек
        System.out.println();
        fs.printStack();

        System.out.println("Извлекли из стека " + fs.рор());
        fs.printStack();

        IntStack ds = new DynStack(2);
        ds.push(33);
        System.out.println();
        ds.printStack();
        ds.push(55);
        ds.push(77);
        ds.printStack();
        System.out.println("Извлекли из стека " + ds.рор());
        ds.printStack();

    }

}
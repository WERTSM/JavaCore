package interfaces.stack;

/**
 * Created by WORK_WERT on 19.01.2017.
 */
// Реализация IntStack, 
// использующая область хранения фиксированного размера
public class FixedStack implements IntStack {

    private int stck[];
    private int tos;

    // резервирование и инициализация стека
    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // помещение элемента в стеке
    @Override
    public void push(int item) {
        if (tos == stck.length - 1)
            System.out.println("Стек полон.");
        else
            stck[++tos] = item;
    }

    // извлечение эелемента из стека
    @Override
    public int рор() {
        if (tos < 0) {
            System.out.println("Стек пуст.");
            return 0;
        } else
            return stck[tos--];
    }

    // печать стека
    public void printStack() {

        if (tos < 0) {
            System.out.println("Стек пуст.");
            return;
        }

        for (int i = tos; i > -1; --i) {
            System.out.println("Fixed_stck[" + i + "] = " + stck[i]);
        }
    }

}
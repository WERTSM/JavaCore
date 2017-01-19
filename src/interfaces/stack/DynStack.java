package interfaces.stack;

/**
 * Created by WORK_WERT on 19.01.2017.
 */
//Реализация IntStack, 
//использующая область хранения увеличевающегося размера
public class DynStack implements IntStack {

    private int stck[];
    private int tos;

    // резервирование и инициализация стека
    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    @Override
    public void push(int item) {
        // если стек полон, резервирование стека большего размера
        if (tos == stck.length - 1) {
            int temp[] = new int[stck.length * 2]; // удвоение размера
            for (int i = 0; i < stck.length; i++)
                temp[i] = stck[i];
            stck = temp;
            System.out.println("Размер стека увеличился");
            stck[++tos] = item;
        } else
            stck[++tos] = item;

    }

    @Override
    public int рор() {
        if (tos < 0) {
            System.out.println("Стек пуст.");
            return 0;
        } else
            return stck[tos--];
    }

    @Override
    public void printStack() {
        if (tos < 0) {
            System.out.println("Стек пуст.");
            return;
        }

        for (int i = tos; i > -1; --i) {
            System.out.println("Dyn_stck[" + i + "] = " + stck[i]);
        }
    }

}
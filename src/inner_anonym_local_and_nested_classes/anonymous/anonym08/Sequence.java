package inner_anonym_local_and_nested_classes.anonymous.anonym08;

/**
 * Created by WORK_WERT on 19.01.2017.
 */
interface ISelector {
    boolean end();

    Object current();

    void next();
}

public class Sequence {
    private Object[] items;
    private int next = 0;

    Sequence(int size) {
        items = new Object[size];
    }

    void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    ISelector selector() {
        return new ISelector() {
            private int i = 0;

            public boolean end() {
                return i == items.length;
            }

            public Object current() {
                return items[i];
            }

            public void next() {
                if (i < items.length) i++;
            }
        };
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) sequence.add(i);
        ISelector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
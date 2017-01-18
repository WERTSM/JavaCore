package interfaces.smile1;

/**
 * Created by WORK_WERT on 19.01.2017.
 */
class Replacer {

    private final IReader reader;
    private final IPrinter printer;

    // конструктор класса Replacer
    // получает любые имплементации интерфейсов
    // IReader и IPrinter
    Replacer(IReader reader, IPrinter printer) {
        this.reader = reader;
        this.printer = printer;
    }

    // метод замены смайликов
    void replace() {
        // получаем строку для замены
        String text = reader.read();
        // заменяем смайлики
        String replacedText = text.replace(":)", "=)");
        // выводим измененую строку на консоль
        printer.print(replacedText);
    }

    public static void main(String[] args) {

        IReader reader = new PredefinedReader(":) --- :)");
        IPrinter printer = new ConsolePrinter();
        IPrinter advPrinter = new AdvConsolePrinter();
        Replacer replacer = new Replacer(reader, printer);
        Replacer advReplacer = new Replacer(reader, advPrinter);
        replacer.replace();
        advReplacer.replace();

    }

}
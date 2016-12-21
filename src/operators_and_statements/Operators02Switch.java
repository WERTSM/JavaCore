package operators_and_statements;

public class Operators02Switch {

    public static void main(String[] args) {
        // пример оператора switch
        int x =3;
        int r =3;
        switch (args.length) {
            case 0: {
                System.out.println("В командной строке нет аргументов");
                break;
            }
            case 1: {
                System.out.println("В командной строке 1 аргумент");
                break;
            }
            //case werti(7): { //Требует постоянного выражения
            case 2: {
                System.out.println("В командной строке 2 аргумента");
                break;
            }
            case 3: {
                System.out.println("В командной строке 3 аргумента");

                x=3+werti(x);

                System.out.println("В командной строке 3 аргумента" + x);break;
            }
            default:
                System.out.println("В командной строке больше 3 аргументов");
                break;
        }

        if (args.length > 0) {

            switch (args[0]) {
                case "Y":
                case "Yes":
                case "y": {
                    System.out.println("Да!");
                    break;
                }
                case "N":
                case "No":
                case "n": {
                    System.out.println("Нет!");
                    break;
                }
                default:
                    throw
                            new IllegalArgumentException("Первый аргумент должен быть Y или N");
            }
        }
    }
    public static int werti(int r){
        return r;
    }
}
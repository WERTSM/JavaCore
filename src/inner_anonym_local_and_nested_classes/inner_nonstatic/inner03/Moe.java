package inner_anonym_local_and_nested_classes.inner_nonstatic.inner03;

/**
 * Created by WERT on 20.01.2017.
 */
public class Moe {

    //private int m = 10;
    int m = 10;

    class MoeInner extends Moe {
        void mm() {
            System.out.println(m);
        }


        class MoeInner2 extends MoeInner {
            void mm() {
                System.out.println(m);
            }
        }

    }

    static class Test {
        public static void main(String[] args) {
            Moe.MoeInner mmm = new Moe().new MoeInner();
            Moe.MoeInner.MoeInner2 mmmmm = new Moe().new MoeInner().new MoeInner2();
            mmmmm.mm();
        }
    }
}

/*
class N extends Moe.MoeInner.MoeInner2 {                            //Чтобы создать объект наследника (анешнего)
                                                                    //внутреннего класса надо в нем вызвать конструктор внешнего
    public N() {
        this(new Moe().new MoeInner().new MoeInner2());
    }

    public N(MoeInner2 o) {
        o.super();
    }
    void t() {
        System.out.println(m);                  //Приват не видет
    }
}
*/
class NeMoe {

    private int n = 15;
}

/*
Если внутренний класс наследуется обычным образом,
то он теряет доступ к private членам своего внешнего класса, в котором он был объявлен.

Но доступ к членам protected, public  и пакетного доступа сохраняется.

Все то же самое справедливо при наследовании класса любой глубины вложенности.

Это означает что любой внутренний класс любой глубины вложенности имеет доступ ко всем членам внешних классов
без дополнительного уточнения в именах этих членов.

Наследник внутреннего класса (который наследуется обычным образом),
так же может обращаться к этим членам без дополнительного уточнения их имени.

Исключение составляют только члены внешних классов объявленные как private.
 */
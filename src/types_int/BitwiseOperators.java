package types_int;
import static types_int.PrintByte.*;
/**
 * Created by WERT on 15.12.2016.
 */
public class BitwiseOperators {

        public static void main(String[] args) {
            // Пример простых побитовых операций в Java
            System.out.println("Пример побитового НЕ (~)");
            byte b1 = 0b0000_1100;
            // если раскомментировать строку ниже, то компилятор выдаст ошибку
            // приведения типов
            // byte b2=~b1;
            byte b2 = (byte) ~b1; // а вот с приведением к типу byte уже все хорошо

            System.out.println("b1 как десятичное = " + b1);
            System.out.println("b2 как десятичное = " + b2);
            System.out.println("b1 как двоичное = ");
            printlnByte(b1);
            System.out.println("b2 как двоичное = ");
            printlnByte(b2);
            System.out.println("\nПример побитового И (&)");
            b1 = 10;
            b2 = 7;
            System.out.println("b1 как десятичное = " + b1);
            System.out.println("b2 как десятичное = " + b2);
            System.out.println("b1 как двоичное = ");
            printlnByte(b1);
            System.out.println("b2 как двоичное = ");
            printlnByte(b2);
            byte b3 =(byte)(b1&b2);
            System.out.println("b3 как двоичное = ");
            printlnByte(b3);
            System.out.println("b3 как десятичное = " + b3);
            System.out.println("\nПример побитового ИЛИ (|)");
            System.out.println("b1 как десятичное = " + b1);
            System.out.println("b2 как десятичное = " + b2);
            System.out.println("b1 как двоичное = ");
            printlnByte(b1);
            System.out.println("b2 как двоичное = ");
            printlnByte(b2);
            b3 =(byte)(b1|b2);
            System.out.println("b3 как двоичное = ");
            printlnByte(b3);
            System.out.println("b3 как десятичное = " + b3);
            System.out.println("\nПример побитового исключающего ИЛИ (^)");
            System.out.println("b1 как десятичное = " + b1);
            System.out.println("b2 как десятичное = " + b2);
            System.out.println("b1 как двоичное = ");
            printlnByte(b1);
            System.out.println("b2 как двоичное = ");
            printlnByte(b2);
            b3 =(byte)(b1^b2);
            System.out.println("b3 как двоичное = ");
            printlnByte(b3);
            System.out.println("b3 как десятичное = " + b3);
            System.out.println("\nПример побитового сдвига влево (<<)");
            b1=7;
            b2=3;
            System.out.println("b1 как десятичное = " + b1);
            System.out.println("b2 сдвигает на " + b2+ " позиции влево");
            System.out.println("b1 как двоичное = ");
            printlnByte(b1);
            b3 =(byte)(b1<<b2);
            System.out.println("b3 как двоичное = ");
            printlnByte(b3);
            System.out.println("b3 как десятичное = " + b3);
            System.out.println("\nПример побитового сдвига вправо со знаком (>>)");
            b1=27;
            System.out.println("b1 как десятичное = " + b1);
            System.out.println("b2 сдвигает на " + b2+ " позиции вправо");
            System.out.println("b1 как двоичное = ");
            printlnByte(b1);
            b3 =(byte)(b1>>b2);
            System.out.println("b3 как двоичное = ");
            printlnByte(b3);
            System.out.println("b3 как десятичное = " + b3);
            System.out.println();
            b1=-50;
            b2=2;
            System.out.println("b1 как десятичное = " + b1);
            System.out.println("b2 сдвигает на " + b2+ " позиции вправо");
            System.out.println("b1 как двоичное = ");
            printlnByte(b1);
            b3 =(byte)(b1>>b2);
            System.out.println("b3 как двоичное = ");
            printlnByte(b3);
            System.out.println("b3 как десятичное = " + b3);
        }
    }

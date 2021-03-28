import java.util.Scanner;

import static java.lang.System.out;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        //sout
        out.println("Orange");
        out.println("Banana");
        out.println("Apple");
    }

    public static void checkSumSign() {
        Scanner in = new Scanner(System.in);
        int a = 3;
        int b = 7;
        int sum = a + b;
        out.println(sum);
        if (sum >= 0) {
            out.println("Сумма положительная");
            if (sum < 0) {
                out.println("Сумма отрицательная");
            }
        }
    }

    public static void printColor() {
        int value = 125;

        if (value <= 0) {
            out.println("Красный");
        } else {
            if (value > 0 && value <= 100) {
                out.println("Желтый");
            } else {
                if (value > 100) {
                    out.println("Зеленый");
                }
            }
        }
     }

     public static  void compareNumbers() {
        int a = 20;
        int b =40;

        if (a >= b) {
            out.println("a>=b");
        }else {
            if (a < b) {
                out.println("a < b");
            }
        }
     }
}

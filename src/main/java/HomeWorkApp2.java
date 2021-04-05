import java.util.Scanner;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        positivelyNegative();
    }

    public static boolean WholeNumbers(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void positivelyNegative() {
        Scanner in = new Scanner(System.in);
        int a = 6;
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean parameterPassing(int a) {
        if (a < 0) {
            return true;
        }
        if (a >= 0) {
            return false;
        }
    }

    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i <times; i++) {
            System.out.println(word);
        }
    }

}


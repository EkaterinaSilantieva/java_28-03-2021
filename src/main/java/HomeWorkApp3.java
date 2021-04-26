import javax.swing.*;
import java.util.ArrayList;

public class HomeWorkApp3 {

    public static void main(String[] args) {
        integerArray();
        emptyIntegerArray();
        circularArray();
        dimensionalArray();
           }

    public static void integerArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void emptyIntegerArray() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
        }

    }

    public static void circularArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
                System.out.println(arr[i]);
            }
        }

    }

    public static void dimensionalArray() {
       int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int receivingMethod(int len,int initialValue) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = len;
            len = initialValue * 10;
            return arr[i];
        }
    }
    }

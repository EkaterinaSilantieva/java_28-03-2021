import java.util.Scanner;
import java.util.Random;

class GameXO {

    private static final int SIZE = 3;
    private static final char DEFAULT = '•';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';
    private static char[][] map = new char [SIZE][SIZE];
    private static Random rand = new Random();

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DEFAULT;
            }
        }
    }

    private static void printMap() {
       for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isCellValid(int x, int y) {
        boolean isInMap = x > 0 && x <= SIZE && y > 0 && y <= SIZE;
        return isInMap && map[x - 1][y - 1] == DEFAULT;
         }

    private static void makeStep(int x, int y, char value) {
        map[x-1][y-1] = value;
    }

    private static void moveAI() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
         map[x-1][y-1] = DOT_O;
       }


    private static boolean isWin(char symb) {
        if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return
                true;
        if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return
                true;
        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return
                true;
        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return
                true;
        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return
                true;
        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return
                true;
        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return
                true;
        if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return
                true;
        return false;
    }

      private static  void startGame() {
      initMap();
        System.out.println("Игра крестики и нолики начинается.");
        System.out.println("Для победы нужно собрать три крестика подрят.");
        System.out.println("Для того, чтобы сделать ход, введите\n2 целых числа от 1 до 3 - номер строки и номер столбца...");
        printMap();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Делайте ваш ход:");
           String[] values = in.nextLine().split(" ");
            if (values.length != 2) {
                System.out.println("Вы ввели некорректные данные.\nВведите ровно два числа от 1 до 3!");
                continue;
            }
            try {
                int x = Integer.parseInt(values[0]);
                int y = Integer.parseInt(values[1]);
                if (isCellValid(x, y)) {
                    makeStep(x, y, DOT_X);
                    if (isWin(DOT_X)) {
                       System.out.println("Вы победили");
                        showEndGameDialog(in);
                        break;
                    }
                    if (isMapFull()) {
                        System.out.println("Ничья");
                        break;
                    }
                    printMap();
                    System.out.println("Ход компьютера:");
                    moveAI();
                    if (isWin(DOT_O)) {
                        System.out.println("Вы проиграли");
                        showEndGameDialog(in);
                        break;
                    }
                    if (isMapFull()) {
                        System.out.println("Ничья");
                        break;
                    }
                   printMap();
                } else {
                    System.out.println("Невозможно сделать такой ход! Введите другие значения");
                }
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели некорректные данные.\nДанные должны быть числами от 1 до 3");
            }
        }
   }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DEFAULT) return false;
            }
        } return true;
    }

    private static void showEndGameDialog(Scanner in) {
    System.out.println("1. Начать новую игру");
    System.out.println("Для выхода введите любую другую клавишу");

    System.out.println("введите команду...");
    String command = in.next();
    if (command.equals("1")) {
        startGame();
        return;
    }
    System.out.println("Игра завершена!");
}

    public static void main(String[] args) {
        startGame();
       }

  }
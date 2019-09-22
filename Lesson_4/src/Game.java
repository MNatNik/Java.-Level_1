import java.util.Random;
import java.util.Scanner;

public class Game {
    static final int SIZE = 5;
    static final int WIN_SIZE = 4;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';

    static char[][] map;

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Вы победили! Поздравляем!");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья!");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Компьютер победил! ");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья!");
                break;
            }
        }

    }

    static void initMap() { //Инициализация карты
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    static void printMap() { //Печать карты
        System.out.print("_|");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print("_" + i + "_|");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + "|" + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " |" + " ");
            }

            System.out.println();
        }
    }

    static void humanTurn() {//Ход человека
        int x, y;
        do {
            System.out.println("Введите коорд в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y, x));
        map[y][x] = DOT_X;
    }

    static boolean isCellValid(int y, int x) {//Валидная ячейка
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY; //Проверка ячейки на пустоту
    }

    static void aiTurn() {//Ход компьютера
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(y, x));
        map[y][x] = DOT_O;
    }

    static boolean isFull() {//Ничья
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean checkWin(char c) {
        int a = 0;
        int b = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        for (int i = 0; i < SIZE; i++) {
            int h = 0;
            int v = 0;
            for (int j = 0; j < SIZE; j++) {
                //горизонтальная проверка
                if (map[i][j] == c) {
                    h++;
                    if (h == WIN_SIZE) return true;
                }
                //вертикальная проверка
                if (map[j][i] == c) {
                    v++;
                    if (v == WIN_SIZE) return true;
                }
            }   //Проверка по диагонали
            if (map[i][i] == c) {
                a++;
                if (a == WIN_SIZE) return true;
            } else a = 0;

            if (i != WIN_SIZE && map[i + 1][i] == c) {
                f++;
                if (f == WIN_SIZE) return true;
            } else f = 0;

            if (i != WIN_SIZE && map[i][i + 1] == c) {
                g++;
                if (g == WIN_SIZE) return true;
            } else g = 0;

            if (map[SIZE - i - 1][i] == c) {
                b++;
                if (b == WIN_SIZE) return true;
            } else b = 0;

            if (i != WIN_SIZE && (map[SIZE - i - 2][i] == c)) {
                d++;
                if (d == WIN_SIZE) return true;
            } else d = 0;

            if (i != WIN_SIZE && map[SIZE - i - 1][i + 1] == c) {
                e++;
                if (e == WIN_SIZE) return true;
            } else e = 0;
        }
        return false;
    }
}

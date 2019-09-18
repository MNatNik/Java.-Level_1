import java.util.Scanner;
public class Lesson3 {

    public static void main(String[] args) {
            guessNumber();
        }
    private static void guessNumber() {
        Scanner sc = new Scanner(System.in);
        do {
            int a = (int) ( Math.random() * 10 );
            System.out.println("Угадайте число от 0 до 9. У Вас всего 3 попытки");
            for (int i = 0; i < 3; i++ ) {
                int b = sc.nextInt();
                if (b > a) {
                    System.out.println("Введенное число больше загаданного.");
                } else if (b < a) {
                    System.out.println("Введенное число меньше загаданного.");
                } else if (b == a) {
                    System.out.println("Вы угадали!");
                    break;
                }
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
        } while(sc.nextInt() == 1);
    }
}

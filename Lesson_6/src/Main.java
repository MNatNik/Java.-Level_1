import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cat cat = new Cat (200, 2, 0);
        Dog dog = new Dog (500, 0.5, 10);

        double distRun;
            do {
                System.out.println("Введите дистанцию для бега. Введите число больше нуля!");
                distRun = scanner.nextDouble();
            } while (distRun <= 0);

            System.out.println("Кот пытается пробежать " + distRun + " м. Результат: " + cat.run(distRun));
            System.out.println("Собака пытается пробежать " + distRun + " м. Результат: " + dog.run(distRun));
            System.out.println("\n----------------------------------------------\n");

        double distJump;
            do {
                System.out.println("Введите высоту препятствия. Введите число больше нуля!");
                distJump = scanner.nextDouble();
            } while (distJump <= 0);

            System.out.println("Кот пытается перепругнуть " + distJump + " м. Результат: " + cat.jump(distJump));
            System.out.println("Собака пытается перепрыгнуть " + distJump + " м. Результат: " + dog.jump(distJump));
            System.out.println("\n----------------------------------------------\n");

        double  distSwim;
            do {
                System.out.println("Введите дистанцию для плавания. Введите число больше нуля!");
                distSwim = scanner.nextDouble();
            } while (distSwim <= 0);

            System.out.println("Кот не умеет плавать! " + distSwim + " м. Результат: " + cat.swim(distSwim));
            System.out.println("Собака пытается проплыть " + distSwim + " м. Результат: " + dog.swim(distSwim));
    }
}

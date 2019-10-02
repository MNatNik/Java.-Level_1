public class Main {

    public static void main(String[] args) {
        System.out.println("Список голодных котов:");
        Cat[] x = {new Cat("Барсик", 7), new Cat("Мурзик", 90), new Cat("Гав", 15)};
        Plate plate = new Plate(100);
        for (Cat c : x) {
            System.out.println("\n" + c);
        }
        System.out.println("\n" + plate);
        System.out.println("---------------------------------------------------------");
        System.out.println("Котики покушили и теперь они не голодные:");
        for (Cat c : x) {
            c.eat(plate);
            System.out.println("\n" + c);
            System.out.println(plate);
        }

    }
}
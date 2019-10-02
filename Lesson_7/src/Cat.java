import java.util.Scanner;
public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }

    @Override
    public String toString() {
        return "Котик: " + name + "  Аппетит: " + appetite + " Сытость: " + isFull;
    }

    void eat(Plate plate) {
        int value;
        Scanner scanner = new Scanner(System.in);

        if (plate.getFood() > appetite) {
            plate.decreaseFood(appetite);
            isFull = true;
        } else {
            do {
                System.out.println("\nКотику по имени " + name + " не хватило еды. Ему потребутся " + appetite +" " + plate);
                 System.out.println("Надо добавить еды в тарелку!");
                 do {
                    System.out.println("Значение кол-ва еды должно быть больше нуля:");
                    value = scanner.nextInt();
                } while (value <= 0);
                plate.increaseFood(value);
                System.out.println("Теперь у нас в тарелке больше еды. " + plate);
            } while (plate.getFood() < appetite);
            plate.decreaseFood(appetite);
            isFull = true;
            }
        }
    }
public class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Количество еды в тарелке: " + food;
    }

    void decreaseFood(int appetite) {
        if (food >= appetite) {
            food -= appetite;
        }
    }

    int getFood() {
        return food;
    }

    void increaseFood(int amount) {
        food += amount;
    }

}

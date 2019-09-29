public class Animal {
     double dRun, dJump, dSwim;

    public Animal(double dRun, double dJump, double dSwim) {
        this.dRun = dRun;
        this.dJump = dJump;
        this.dSwim = dSwim;
    }

    public boolean run(double value) {
        return dRun >= value;
    }

    public boolean jump(double value) {
        return dJump >= value;
    }

    public boolean swim(double value) {
        return dSwim >= value;
    }
}


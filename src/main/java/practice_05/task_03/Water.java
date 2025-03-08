package practice_05.task_03;

public class Water extends RestoraunFood {
    private final static String NAME = "Вода";
    private double amount;

    Water(double amount) {
        super(NAME);
        this.amount = amount;
    }

    private double getAmount() {
        return this.amount;
    }

    @Override
    void showFood() {
        System.out.println(NAME + " объем " + getAmount());
    }
}

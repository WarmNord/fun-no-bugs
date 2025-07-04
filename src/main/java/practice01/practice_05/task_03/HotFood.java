package practice01.practice_05.task_03;

public class HotFood extends RestoraunFood {
    private final static String NAME = "Гречка";
    private double temperature;

    HotFood(double temperature) {
        super(NAME);
        this.temperature = temperature;
    }

    private double getTemperature() {
        return this.temperature;
    }

    @Override
    void showFood() {
        System.out.println(NAME + " температура " + getTemperature());
    }
}

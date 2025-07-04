package practice02.practice02.structural.speed;

public class MileSystem implements Speed {
    private double speed;

    public MileSystem(double speed) {
        this.speed = speed;
    }

    double getSpeed() {
        return this.speed;
    }

    @Override
    public void print() {
        System.out.println("Mile System");
    }
}

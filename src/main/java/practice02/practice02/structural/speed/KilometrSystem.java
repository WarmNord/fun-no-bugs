package practice02.practice02.structural.speed;

public class KilometrSystem implements Speed {
    private double speed;

    public KilometrSystem(double speed) {
        this.speed = speed;
    }

    double getSpeed() {
        return this.speed;
    }

    @Override
    public void print() {
        System.out.println("Kilometr System");
    }
}

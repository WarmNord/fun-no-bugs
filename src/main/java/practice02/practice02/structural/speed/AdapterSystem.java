package practice02.practice02.structural.speed;

public class AdapterSystem {

    static double mileToKilometers(MileSystem mileSystem) {
        return mileSystem.getSpeed() * 1.609;
    }

    static double kilometersToMile(KilometrSystem kilometrSystem) {
        return kilometrSystem.getSpeed() * 0.6214;
    }
}

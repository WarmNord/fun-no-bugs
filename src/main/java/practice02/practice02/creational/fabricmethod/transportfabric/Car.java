package practice02.practice02.creational.fabricmethod.transportfabric;

public class Car extends Transport{
    @Override
    void create() {
        System.out.println("Создана машина");
    }
}

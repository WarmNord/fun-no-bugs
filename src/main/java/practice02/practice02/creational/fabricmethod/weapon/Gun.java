package practice02.practice02.creational.fabricmethod.weapon;

public class Gun implements Weaponable {
    @Override
    public void doDamage() {
        System.out.println("Выстрел");
    }
}

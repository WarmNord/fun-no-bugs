package practice02.practice02.creational.fabricmethod.weapon;

public class BowFactory implements WeaponFactory {
    @Override
    public Weaponable createWeapon() {
        return new Bow();
    }
}

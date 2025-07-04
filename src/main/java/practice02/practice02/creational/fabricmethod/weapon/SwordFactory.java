package practice02.practice02.creational.fabricmethod.weapon;

public class SwordFactory implements WeaponFactory {
    @Override
    public Weaponable createWeapon() {
        return new Sword();
    }
}

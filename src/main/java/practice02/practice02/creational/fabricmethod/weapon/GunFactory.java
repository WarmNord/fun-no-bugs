package practice02.practice02.creational.fabricmethod.weapon;

public class GunFactory implements WeaponFactory{
    @Override
    public Weaponable createWeapon() {
        return new Gun();
    }
}

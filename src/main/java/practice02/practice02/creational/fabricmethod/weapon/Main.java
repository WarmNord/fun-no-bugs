package practice02.practice02.creational.fabricmethod.weapon;

/*
* Реализовать фабричный метод оружия (Меч, Лук, Пистолет)
Описание
В этой задаче нам нужно создать систему для создания различных видов оружия в игре (например, мечи, луки и пистолеты).
* Все оружие будет иметь общий интерфейс, но конкретные реализации оружия будут различаться.
* Мы будем использовать фабричный метод, чтобы централизованно создавать объекты оружия.
* */
public class Main {
    public static void main(String[] args) {
        WeaponFactory weaponFactory = new BowFactory();

        weaponFactory.createWeapon().doDamage();
        weaponFactory = new GunFactory();
        weaponFactory.createWeapon().doDamage();
        weaponFactory = new SwordFactory();
        weaponFactory.createWeapon().doDamage();

    }
}

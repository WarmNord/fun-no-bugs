package practice02.practice02.creational.builder.npc;

/*Описание
В игре игрок создает персонажа, задавая его параметры, такие как здоровье, урон, броня и магия.
Паттерн Builder поможет организовать создание персонажа, позволяя задавать его параметры поэтапно и не перегружать конструктор класса Character.*/

public class Main {
    public static void main(String[] args) {
        Character character = new Character.Builder()
                .setMagic(100)
                .setArmor(50)
                .setHealth(150)
                .setDamage(200)
                .build();

        character.print();
    }
}

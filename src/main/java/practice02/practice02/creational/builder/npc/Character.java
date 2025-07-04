package practice02.practice02.creational.builder.npc;

public class Character {
    private int health;
    private int damage;
    private int armor;
    private int magic;

    public Character(Builder builder) {
        this.health = builder.health;
        this.damage = builder.damage;
        this.armor = builder.armor;
        this.magic = builder.magic;
    }

    void print() {
        System.out.println(health + " " + damage + " "+armor + " " + magic + " ");
    }

    static class Builder {
        private int health;
        private int damage;
        private int armor;
        private int magic;

        public Builder setHealth(int health) {
            this.health = health;
            return this;
        }

        public Builder setDamage(int damage) {
            this.damage = damage;
            return this;
        }

        public Builder setArmor(int armor) {
            this.armor = armor;
            return this;
        }

        public Builder setMagic(int magic) {
            this.magic = magic;
            return this;
        }

        Character build() {
            return new Character(this);
        }
    }
}

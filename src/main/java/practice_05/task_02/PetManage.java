package practice_05.task_02;

import java.util.ArrayList;
import java.util.List;

public class PetManage {
    private static List<Pets> ourPets = new ArrayList<>();

    void addPets(Pets pet) {
         ourPets.add(pet);
    }

    void doAction(Pets pet) {
        ourPets.get(ourPets.indexOf(pet)).doActionWithPet();

    }

    public static void main(String[] args) {
        PetManage manage = new PetManage();

        Cat cat = new Cat();
        Dog dog = new Dog();

        manage.addPets(cat);
        manage.addPets(dog);

        manage.doAction(cat);
        manage.doAction(dog);

    }
}

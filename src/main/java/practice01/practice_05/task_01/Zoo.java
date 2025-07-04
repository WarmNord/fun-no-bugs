package practice01.practice_05.task_01;

import java.util.ArrayList;

public class Zoo {

    /*1. Зоопарк
В зоопарке есть разные животные, каждое из которых издаёт уникальные звуки и передвигается своим способом.
Например, слон трубит и ходит, а птица чирикает и летает.
Нужно спроектировать систему, которая может работать с любыми животными, добавлять их в зоопарк, а затем показывать, как они издают звуки и передвигаются.*/

    private ArrayList<Animals> animals = new ArrayList<>();

    Animals addAnimal(Animals animal) {
        System.out.println("Добавлено новое животное " + animal.getName());
        animals.add(animal);
        return animal;
    }

    void showVoiceAndGo(Animals animal) {
        animal.makeNoize();
        animal.go();
    }

    public static void main(String[] args) {

        Manager manager = new Manager();
        Animals puma = new Puma();
        Animals colibri = new Colibri();

        manager.addAnimal(puma);
        manager.showVoiceAndGo(puma);

        manager.addAnimal(colibri);
        manager.showVoiceAndGo(colibri);

    }
}

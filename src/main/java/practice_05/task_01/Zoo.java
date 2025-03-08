package practice_05.task_01;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    /*1. Зоопарк
В зоопарке есть разные животные, каждое из которых издаёт уникальные звуки и передвигается своим способом.
Например, слон трубит и ходит, а птица чирикает и летает.
Нужно спроектировать систему, которая может работать с любыми животными, добавлять их в зоопарк, а затем показывать, как они издают звуки и передвигаются.*/

    Animals addAnimal(Animals animal) {
        System.out.println("Добавлено новое животное " + animal.getName());
        return animal;
    }

    void showVoiceAndGo(Animals animal) {
        animal.makeNoize();
        animal.go();
    }

    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        Animals puma = new Puma();
        Animals colibri = new Colibri();

        zoo.addAnimal(puma);
        zoo.showVoiceAndGo(puma);

        zoo.addAnimal(colibri);
        zoo.showVoiceAndGo(colibri);

    }
}

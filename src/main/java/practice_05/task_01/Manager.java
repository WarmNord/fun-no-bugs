package practice_05.task_01;

public class Manager {
    Zoo zoo = new Zoo();

    void addAnimal(Animals animal) {
        zoo.addAnimal(animal);
    }

    void showVoiceAndGo(Animals animal) {
        zoo.showVoiceAndGo(animal);
    }
}

package practice01.practice_05.task_01;

public class Colibri extends Animals {
    static private final String NAME_ANIMAL = "Колибри";

    Colibri() {
        super(NAME_ANIMAL);
    }

    @Override
    void makeNoize() {
        System.out.println("Чирик чирик");
    }

    @Override
    void go() {
        System.out.println("Летает");
    }
}

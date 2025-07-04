package practice01.practice_05.task_01;

public class Puma extends Animals {
    static private final String NAME_ANIMAL = "Пума";

    Puma() {
        super(NAME_ANIMAL);
    }

    @Override
    void makeNoize() {
        System.out.println("РРРР");
    }

    @Override
    void go() {
        System.out.println("Ходит лапками");
    }
}

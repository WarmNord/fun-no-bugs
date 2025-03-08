package practice_05.task_01;

public abstract class Animals {
    String name;

    public String getName() {
        return name;
    }

    Animals(String name) {
        this.name = name;
    }
    abstract void makeNoize();
    abstract void go();
}

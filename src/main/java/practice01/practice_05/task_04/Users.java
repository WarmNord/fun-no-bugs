package practice01.practice_05.task_04;

public abstract class Users {
    private String name;

    Users(String name) {
    this.name = name;
    }

    protected String getName() {
        return this.name;
    }
}

package practice_07.task_02;

public class Storage<T> {
    private T value;

    T getValue() {
        return this.value;
    }

    void setValue(T value) {
        this.value = value;
    }
}

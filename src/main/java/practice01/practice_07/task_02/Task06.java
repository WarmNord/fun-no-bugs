package practice01.practice_07.task_02;

public class Task06<T> implements Container {
    private T value;

    @Override
    public void add(Object item) {
        value = (T) item;
    }

    @Override
    public Object get() {
        return value;
    }

    public static void main(String[] args) {
        Task06<String> value = new Task06<>();
        value.add("sadasd");

        System.out.println(value.get());
    }
}

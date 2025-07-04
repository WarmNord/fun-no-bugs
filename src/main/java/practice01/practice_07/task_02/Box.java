package practice01.practice_07.task_02;

public class Box<T extends Comparable<T>> implements Comparable<Box<T>>  {

    /*
    * Сортировка с Comparable<T>: Напишите класс Box<T extends Comparable<T>>, который хранит объект и умеет сравнивать его с другим.
    *
    * */

    private T value;

    Box(T value) {
        this.value = value;
    }

    T getValue() {
        return this.value;
    }

    @Override
    public int compareTo(Box<T> box) {
        return this.value.compareTo(box.getValue());
    }

    public static void main(String[] args) {
        Box<String> box= new Box<>("q");
        Box<String> box1 = new Box<>("q");

        System.out.println(box.compareTo(box1));
    }

}

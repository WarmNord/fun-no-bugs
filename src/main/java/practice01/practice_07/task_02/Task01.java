package practice01.practice_07.task_02;

public class Task01 {

    /*
    *
    * Обобщённый класс: Создайте класс Storage<T>, который хранит элемент и возвращает его.
    * */

    public static void main(String[] args) {
        Storage<String> stringStorage = new Storage<>();
        stringStorage.setValue("Hello");
        System.out.println(stringStorage.getValue());
    }
}


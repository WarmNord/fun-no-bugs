package practice_07.task_02;

import java.util.ArrayList;
import java.util.List;

public class Task02 {

    /*
    * Обобщённый метод: Реализуйте метод printList(List<?>), который принимает список любого типа и выводит его элементы.
    * */

    static <T> void printList(List<T> list) {
        list.forEach(
                l -> System.out.println(l)
        );
    }

    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("hello");
        stringArrayList.add("bye");

        Task02.printList(stringArrayList);
    }
}

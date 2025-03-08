package practice_06.task01;

import java.util.LinkedHashMap;

public class Task07 {

    /*
    * LinkedHashMap
Создайте LinkedHashMap и добавьте в него 5 элементов. Выведите их в порядке добавления.
Реализуйте телефонную книгу с LinkedHashMap. Добавьте, найдите, удалите контакт.
Создайте LinkedHashMap, который хранит историю просмотров пользователя (максимум 10 элементов).
    * */

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> names = new LinkedHashMap<>();
        names.put("маша", 18);
        names.put("катя", 45);
        names.put("коля", 23);
        names.put("саша", 11);
        names.put("юля", 77);

        names.forEach(
                (name, age) -> {
                    System.out.println(name + " " + age);
                }
        );
        System.out.println("____");
        System.out.println(names);

    }
}

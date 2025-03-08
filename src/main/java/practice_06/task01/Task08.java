package practice_06.task01;

import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;

public class Task08 {

    /*
    * TreeMap
Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы). Выведите отсортированные данные.
Найдите минимальный и максимальный ключ в TreeMap.
Реализуйте TreeMap, который хранит сотрудников и их ID, с возможностью поиска ближайшего большего ID.
    * */

    static void findMaxKey(TreeMap<String, Integer> treeMap) {
        AtomicReference<String> maxSize = new AtomicReference<>("");
        treeMap.forEach(
                (name, number) -> {
                    if (name.length() > maxSize.get().length()) {
                        maxSize.set(name);
                    }
                    ;
                }
        );
        System.out.println("Максимальный ключ: " + maxSize.get());
    }

    static void findMinKey(TreeMap<String, Integer> treeMap) {
        AtomicReference<String> minSize = new AtomicReference<>(treeMap.firstKey());
        treeMap.forEach(
                (name, number) -> {
                    if (name.length() < minSize.get().length()) {
                        minSize.set(name);
                    }
                    ;
                }
        );
        System.out.println("Максимальный ключ: " + minSize.get());
    }

    public static void main(String[] args) {
        TreeMap<String, Integer> results = new TreeMap<>();
        results.put("иван", 10);
        results.put("юля", 15);
        results.put("саша222", 25);
        results.put("м", 5);
        results.put("коля", 23);
        results.forEach(
                (name, number) -> {
                    System.out.println("Имя: " + name + " Баллы:" + number);
                }
        );

        findMaxKey(results);
        findMinKey(results);
    }
}

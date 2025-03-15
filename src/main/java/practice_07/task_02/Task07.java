package practice_07.task_02;

import java.util.HashMap;
import java.util.Map;

public class Task07 {

    /*
    *
    * Коллекция с обобщёнными типами: Создайте Map<K, V> и реализуйте метод, который принимает обобщённые ключи и значения, а затем выводит их
    * */

    public class MyMap {
        static <K, V> void getAndPrint(K key, V value, Map<K, V> kvMap) {
            kvMap.put(key, value);
            System.out.println("Ключ: " + key + " Значение: " + value);
        }
    }


    public static void main(String[] args) {

        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        MyMap.getAndPrint("Привет", 10, stringIntegerHashMap);
    }

}


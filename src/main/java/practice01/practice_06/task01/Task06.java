package practice01.practice_06.task01;

import java.util.HashMap;

public class Task06 {

    /*
    * HashMap
Создайте HashMap<String, Integer>, добавьте 5 пар (имя – возраст) и выведите все записи.
Проверьте, есть ли определённое имя в HashMap.
Реализуйте метод, который удаляет из HashMap всех пользователей младше 18 лет.

    * */

    static HashMap<String, Integer> deleteYoung(HashMap<String, Integer> hashMap) {
/*        HashMap<String, Integer> result = new HashMap<>();
        hashMap.forEach(
                (name, age) -> {
                     if (age >= 18) {
                         result.put(name, age);
                     }
                }
        );*/
        hashMap.values().removeIf(age -> age < 18);

       return hashMap;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> names = new HashMap<>();
        names.put("маша", 18);
        names.put("петя", 10);
        names.put("даша", 35);
        names.put("коля", 56);
        names.put("юля", 44);
        names.forEach(
                (name, age) -> {
                    System.out.println("Имя: " + name + ", возраст: " + age);
                }
        );

        System.out.println(names.containsKey("юля"));

        HashMap<String, Integer> old = deleteYoung(names);
        old.forEach(
                (name, age) -> {
                    System.out.println("Имя: " + name + ", возраст: " + age);
                }
        );
    }
}

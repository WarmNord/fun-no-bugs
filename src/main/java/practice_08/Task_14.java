package practice_08;

import java.util.Arrays;
import java.util.List;

public class Task_14 {
    /*Задача 4: Поиск первого элемента, начинающегося на "Б"
Подсказка:
Нужно найти первую строку, начинающуюся с определённой буквы. Для этого создаём поток, фильтруем элементы по условию (startsWith("Б")), а затем берём первый подходящий с помощью findFirst(). Результат будет в Optional.
Методы:
stream()
filter(s -> s.startsWith("Б"))
findFirst()*/
    public static void main(String[] args) {
        List<String> s = Arrays.asList("Бровь", "Бобер", "Весна");
        System.out.println(s.stream().filter(i -> i.startsWith("Б")).findFirst());
    }
}

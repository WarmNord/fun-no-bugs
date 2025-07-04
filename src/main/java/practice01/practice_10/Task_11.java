package practice01.practice_10;

import java.util.List;
import java.util.stream.Collectors;

public class Task_11 {
    /*
    * Метод:
public List<Integer> filterEvenNumbers(List<Integer> numbers) {
    return numbers.stream()
        .filter(n -> n % 2 == 0)
        .collect(Collectors.toList());
}

Тесты:
Обычный список ([1, 2, 3, 4, 5, 6] → [2, 4, 6])
Список без чётных чисел
Пустой список*/

    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }
}

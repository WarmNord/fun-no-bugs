package practice01.practice_10;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task_12 {
    /*
Метод:
public List<String> sortByLength(List<String> words) {
    return words.stream()
        .sorted(Comparator.comparingInt(String::length))
        .collect(Collectors.toList());
}

Тесты:
[ "Java", "C", "Python" ] → [ "C", "Java", "Python" ]
Одинаковые длины ([ "aa", "bb", "cc" ])
Пустой список*/
    public static List<String> sortByLength(List<String> words) {
        return words.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
    }
}

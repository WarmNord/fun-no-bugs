package practice_10;

import java.util.List;
import java.util.stream.Collectors;

public class Task_15 {
    public static List<Integer> mapToLengths(List<String> words) {
        return words.stream().map(String::length).collect(Collectors.toList());
    }
}

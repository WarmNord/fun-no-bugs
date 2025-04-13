package practice_11;

//Код должен удалять элементы списка, но выбрасывает ConcurrentModificationException.

import java.util.*;
import java.util.stream.Collectors;

public class DebugTask10 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        names.removeIf(name -> name.startsWith("A"));
        System.out.println(names);
    }
}


package practice01.practice_10;

import java.util.Arrays;

public class Task_20 {
    public static boolean hasDuplicates(int[] numbers) {
        return Arrays.stream(numbers).distinct().count() != numbers.length;
    }
}

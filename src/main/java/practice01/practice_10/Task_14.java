package practice01.practice_10;

import java.util.Arrays;

public class Task_14 {
    public static double findAverage(int[] numbers) {
        return Arrays.stream(numbers).average().orElseThrow();
    }

}

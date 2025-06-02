package practice_06;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Offtop {

/*    Задание №2: Написать функцию, которая вернет матрицу 3x3, заполненную уникальными случайными числами от 1 до N.

    Сигнатура: func getMatrix() [][]int {} Пример матрицы, если N=20:
            [
            [4, 7, 13],
            [14, 3, 6],
            [1, 18, 10]
            ]

    Код:

   */


    int [][] getMatrix(int number) {
        Set<Integer> uniqNumbers = new HashSet<>(9);
        // создать сет из 9 элементов от 1 до N
        Random random = new Random();

        while(uniqNumbers.size() < 10) {
            int n = random.nextInt();
            if ( n < number && n >= 1) {
                uniqNumbers.add(random.nextInt());
            }
        }

        return null;
    }
}

package practice01.practice_07.task_01;

public class Task04 {
    /*
    * Массив и выход за границы: Напишите программу, которая запрашивает у пользователя индекс массива и обрабатывает ArrayIndexOutOfBoundsException.
    * */
    static void chekIndex(int[] massive, int index) {
        if (index > massive.length) {
            throw new ArrayIndexOutOfBoundsException("Выход за пределы массива, длина массива " + massive.length);
        }
    }

    public static void main(String[] args) {
        int [] m = {1,2,3,4};
        Task04.chekIndex(m, 4);
    }
}

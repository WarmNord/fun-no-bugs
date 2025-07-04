package practice01.practice_07.task_01;

public class Task10 {

    /*
    * Контрольный finally: Напишите метод с try-catch-finally, в котором finally выполняется даже при наличии return внутри try.
    * */

    static int returnFinalResult(int n, int n1) {
        try {
            return n / n1;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally выполняется даже при наличии return внутри try");
        }

        return n / n1;
    }

    public static void main(String[] args) {
        Task10.returnFinalResult(1,1);

    }
}

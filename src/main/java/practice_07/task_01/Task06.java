package practice_07.task_01;

public class Task06 {

    /*
    * Работа с несколькими catch: Напишите метод, который вызывает несколько
    * исключений (NullPointerException, ArithmeticException, NumberFormatException) и обрабатывает их разными catch.
    *
    * */

    static void checkSum(int number, int number1) {
        int result = 0;
        try {
             result = number / number1;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        int i = Integer.parseInt(null);
        Task06.checkSum(1, i);
    }
}

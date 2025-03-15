package practice_07.task_01;

public class Task07 {

    /*
    *
    * Попытка преобразования строки в число: Реализуйте метод, который принимает строку и преобразует её в число, обрабатывая NumberFormatException.
    * */

    static void castStingToInt(String line) {
        try {
            System.out.println(Integer.parseInt(line));
        } catch (NumberFormatException e) {
            System.out.println("Ошибка формата " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Task07.castStingToInt(new String("asdasd"));
    }
}

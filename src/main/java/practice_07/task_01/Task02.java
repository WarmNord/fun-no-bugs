package practice_07.task_01;

public class Task02 {

    /*
     * Проверка ввода: Создайте собственное исключение InvalidInputException, которое выбрасывается при вводе некорректного значения (например, отрицательного числа).
     * */

    static void checkInput(int input) throws InvalidInputException {
        if (input < 0) {
            throw new InvalidInputException("Значение < 0");
        } else if (input == 4) {
            throw new InvalidInputException("Значение равно 4");
        }

    }

    public static void main(String[] args) throws InvalidInputException {
        Task02.checkInput(-4);
    }

}


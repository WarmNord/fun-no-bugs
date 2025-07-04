package practice01.practice_10;

public class Task_06 {
    /*
    * Напишите тесты для метода, который проверяет, является ли строка валидным email:

public boolean isValidEmail(String email) {
    return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
}

Тесты должны проверять:
Корректные и некорректные email ("test@example.com", "bad@.com", "no-at-symbol")
null*/
    public static boolean isValidEmail(String email) {
        return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
    }
}

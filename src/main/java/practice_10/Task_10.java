package practice_10;

public class Task_10 {
    /*10. Проверка валидности номера телефона

Напишите тесты для метода, который проверяет валидность телефонного номера:

public boolean isValidPhoneNumber(String phone) {
    return phone.matches("\\+\\d{1,3} \\d{10}");
}

Тесты должны проверять:
Корректные номера ("+1 1234567890")
Некорректные номера ("12345", "invalid")

    * */

    public static boolean isValidPhoneNumber(String phone) {
        return phone.matches("\\+\\d{1,3} \\d{10}");
    }

}

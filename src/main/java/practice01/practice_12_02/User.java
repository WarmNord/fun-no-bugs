package practice01.practice_12_02;
/*Разработайте систему валидации для модели данных пользователя, которая проверяет корректность имени, возраста и электронной почты. Валидация должна управляться через глобальный флаг validationEnabled, который может быть включен или выключен. Если данные не проходят валидацию, должно выбрасываться специализированное исключение InvalidUserException.

Модель данных:
User: Класс пользователя с атрибутами для имени, возраста и электронной почты.
Класс валидатора:
UserValidator: Сервис, который предоставляет методы для проверки объектов User на соответствие определенным правилам.
Функциональные требования:
Проверка имени: Имя должно быть не пустым и начинаться с заглавной буквы.
Проверка возраста: Возраст должен быть в пределах от 18 до 100 лет.
Проверка email: Email должен соответствовать стандартному формату электронной почты.
Управление валидацией: Валидация данных должна происходить только если флаг validationEnabled установлен в true.
Исключения: При обнаружении невалидных данных необходимо выбрасывать InvalidUserException.*/

import java.util.regex.Pattern;

public class User {
    private String name;
    private int age;
    private String email;

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class UserValidator {

    //Проверка имени: Имя должно быть не пустым и начинаться с заглавной буквы.
    private void validateName(String name) throws InvalidUserException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidUserException("Имя пустое");
        }
        if (!Character.isUpperCase(name.charAt(0))) {
            throw new InvalidUserException("Имя начинается не с заглавной буквы");
        }
    }
   // Проверка возраста: Возраст должен быть в пределах от 18 до 100 лет.
    private void validateAge(int age) throws InvalidUserException {
        if (age < 18 || age > 100) {
            throw new InvalidUserException("Возраст должен быть в пределах от 18 до 100 лет");
        }
    }
    //Проверка email: Email должен соответствовать стандартному формату электронной почты.
    private void validateEmail(String email) throws InvalidUserException {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);

        if (!pattern.matcher(email).matches()) {
            throw new InvalidUserException("Email невалидный");
        }
    }

    public void validateUser(User user, boolean validationEnabled) throws InvalidUserException {
        if (!validationEnabled) {
            return;
        }
        validateName(user.getName());
        validateAge(user.getAge());
        validateEmail(user.getEmail());
    }

    public static void main(String[] args) throws InvalidUserException {
        UserValidator validator = new UserValidator();

        User u = new User("Any", 20, "sads@gmail.com");
        User uName = new User("", 15, "sads@gmail.com");
        User uAge = new User("Any", 150, "sads@gmail.com");
        User uEmail = new User("Any", 15, "sadsgmail.com");

        validator.validateUser(u, true);
        validator.validateUser(uEmail, true);

    }

}

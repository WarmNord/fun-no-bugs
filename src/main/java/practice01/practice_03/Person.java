package practice01.practice_03;

public class Person {
    /*Поля:
private String firstName — имя.
private String lastName — фамилия.
private final String ssn — номер социального страхования.

Реализуйте:
Конструктор для инициализации всех полей.
Геттеры для всех полей.
Сеттеры для firstName и lastName (поле ssn менять нельзя).
Метод printPersonInfo(), который выводит:
"Имя: Иван, Фамилия: Иванов, SSN: 123-45-6789".

В методе main:
Создайте несколько объектов класса Person.
Измените имя и фамилию одного из них через сеттеры.
Выведите информацию о каждом человеке.*/

    private String firstName;
    private String lastName;
    private final String ssn;

    Person(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    String getFirstName() {
        return this.firstName;
    }

    String getLastName() {
        return this.lastName;
    }

    String getSsn() {
        return this.ssn;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void printPersonInfo() {
        System.out.println("Имя: " + getFirstName() + ", Фамилия: " + getLastName() + ", SSN: " + getSsn());
    }

    public static void main(String[] args) {
        Person person = new Person("Ivan", "Ivanov", "123-123-123");
        Person person1 = new Person("Vasilii", "Vasiiev", "123-1234");
        person1.setFirstName("Maria");
        person1.setLastName("St");
        person.printPersonInfo();
        person1.printPersonInfo();

    }
}

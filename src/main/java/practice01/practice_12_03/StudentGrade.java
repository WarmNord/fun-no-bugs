package practice01.practice_12_03;

/*Класс StudentGrade<T>:
Поля для имени студента, предмета и оценки.
Оценка должна быть типа T, который расширяет класс Number.
Конструктор для инициализации всех полей.
Геттеры для доступа к полям.*/
public class StudentGrade<T extends Number> {
    private String name;
    private String subject;
    private T grage;

    public StudentGrade(String name, String subject, T grage) {
        this.name = name;
        this.subject = subject;
        this.grage = grage;
    }

    String getName() {
        return this.name;
    }

    String getSubject() {
        return this.subject;
    }

    T getGrage() {
        return this.grage;
    }

}

package practice_03;

public class University {
/*
    Поля:
    static String universityName — название университета (общее для всех студентов).
    final int studentID — уникальный идентификатор студента.
    String studentName — имя студента.

    Реализуйте:
    Конструктор для инициализации studentID и studentName.
    Статический метод changeUniversityName(String newName) для изменения названия университета.
    Геттер для studentName и метод printStudentInfo(), который выводит информацию о студенте и университете.

    В методе main:
    Создайте 3 объекта студентов.
    Измените название университета через статический метод.
    Выведите информацию о каждом студенте.
*/
    static String universityName;

    final int studentID;
    String studentName;

    University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    static void changeUniversityName(String newName) {
        universityName = newName;
    }

    String getStudentName() {
        return this.studentName;
    }

    void printStudentInfo() {
        System.out.println("Университет: " + universityName + ", Имя: " + getStudentName());
    }

    public static void main(String[] args) {

        University student01 = new University(01,"Yan");
        University student02 = new University(02, "Masha");
        University student03 = new University(03, "Tan");
        student01.printStudentInfo();

        University.universityName = "New name";

        student01.printStudentInfo();
        student02.printStudentInfo();
        student03.printStudentInfo();
    }
}

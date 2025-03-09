package practice_05.task_04;

import java.util.ArrayList;
import java.util.List;

public class EducationPlatform {

    private ProgressBook progressBook;
    private static List<Course> courses = new ArrayList<>();
    private static List<Teacher> teachers = new ArrayList<>();


    void addUsersToCourse(Teacher teacher) {
        courses.getFirst().addTeacher(teacher);
        System.out.println("Преподователь " + teacher.getName() + " добавлен на курс");
    }

    void addUsersToCourse(Student student) {
        courses.getFirst().addStudent(student);
        System.out.println("Студент " + student.getName() + " добавлен на курс");
    }

    void teach(int indexStudent) {
        Student student = courses.getFirst().getStudent(indexStudent);
        System.out.print(" " + courses.getFirst().getNameCourse());
        System.out.println();
    }

    void checkHomework(Course course, HomeWork homeWork, Student student) {
        courses.getFirst().getTeacher(0).checkHomeWork(course, homeWork, student);
    }

    void sendHomeWork(Course course, HomeWork homeWork, Student student) {
        //course.sendHomeWork(homeWork, student);
        courses.getFirst().sendHomeWork(homeWork, student);
    }

    void showProgress(Course course, ProgressBook progressBook, Student student) {
        //course.showProgress(progressBook, student);
        courses.getFirst().showProgress(progressBook, student);
    }
    /*
    *  Образовательная платформа
На образовательной платформе есть курсы, студенты и преподаватели. Студенты могут учиться на курсах, а преподаватели проверяют их задания. Нужно спроектировать систему, которая добавляет студентов и преподавателей на курс, позволяет студентам учиться и фиксировать их прогресс, а преподаватели могут проверять задания студентов.

    *
    * */


    public static void main(String[] args) {
        EducationPlatform educationPlatform = new EducationPlatform();
        Course oop = new OopCourse();
        courses.add(oop);

        Student s1 = new Student("Иван");
        Student s2 = new Student("Маша");

        ProgressBook progressBook1s1 = new ProgressBook(s1);
        ProgressBook progressBook1s2 = new ProgressBook(s2);


        educationPlatform.addUsersToCourse(s1);
        educationPlatform.addUsersToCourse(s2);

        Teacher t1 = new Teacher("Валентин Иванович");

        HomeWork hwS1 = new HomeWork(new Task("Задание 1"), progressBook1s1);
        HomeWork hwS2 = new HomeWork(new Task("Задание 1"), progressBook1s2);


        educationPlatform.addUsersToCourse(t1);

        educationPlatform.sendHomeWork(oop, hwS1, s1);
        educationPlatform.sendHomeWork(oop, hwS2, s2);


        educationPlatform.checkHomework(oop,hwS1,s1);
        educationPlatform.checkHomework(oop,hwS2,s2);


        educationPlatform.showProgress(oop,progressBook1s1,s1);
        educationPlatform.showProgress(oop,progressBook1s2,s2);


    }
}

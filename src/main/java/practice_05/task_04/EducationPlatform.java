package practice_05.task_04;

import java.util.ArrayList;
import java.util.List;

public class EducationPlatform {

    private static List<Courses> courses = new ArrayList<>();


    void addUsersToCourse(Teacher teacher) {
        courses.getFirst().addTeacher(teacher);
        System.out.println("Студент " + teacher.getName() + " добавлен на курс");
    }
    void addUsersToCourse(Student student) {
        courses.getFirst().addStudent(student);
        System.out.println("Преподаватель " + student.getName() + " добавлен на курс");
    }

    void teach(int indexStudent) {
        Student student = courses.getFirst().getStudent(indexStudent);
        student.teach();
        System.out.print(" " + courses.getFirst().getNameCourse());
        student.showProgress();
    }

    void checkHomework(int indexStudent) {
        Student student = courses.getFirst().getStudent(indexStudent);
        courses.getFirst().getTeacher(0).checkHomeWork(student);
    }
    /*
    *  Образовательная платформа
На образовательной платформе есть курсы, студенты и преподаватели. Студенты могут учиться на курсах, а преподаватели проверяют их задания. Нужно спроектировать систему, которая добавляет студентов и преподавателей на курс, позволяет студентам учиться и фиксировать их прогресс, а преподаватели могут проверять задания студентов.

    *
    * */


    public static void main(String[] args) {
        EducationPlatform educationPlatform = new EducationPlatform();
        Courses oop = new OopCourse();
        courses.add(oop);

        Student s1 = new Student("Иван");
        Student s2 = new Student("Маша");

        educationPlatform.addUsersToCourse(s1);
        educationPlatform.addUsersToCourse(s2);

        Teacher t1 = new Teacher("Валентин Иванович");

        educationPlatform.addUsersToCourse(t1);

        educationPlatform.teach(0);
        educationPlatform.teach(0);
        educationPlatform.teach(1);

        educationPlatform.checkHomework(0);
        educationPlatform.checkHomework(1);

    }
}

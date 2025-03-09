package practice_05.task_04;

import java.util.ArrayList;
import java.util.List;

public class OopCourse extends Course {
    private static final String NAME = "Java OOP";
    private static List<Teacher> teachers = new ArrayList<>();
    private static List<Student> students = new ArrayList<>();


    OopCourse() {
        super(NAME);
    }

    @Override
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public Teacher getTeacher(int index) {
        return teachers.get(index);
    }

    @Override
    public Student getStudent(int index) {
        return students.get(index);
    }

    @Override
    public void sendHomeWork(HomeWork homeWork, Student student) {
        homeWork.addProgress();
        System.out.println("Сдана работа " + homeWork.getTask() + " студент " + student.getName());
    }

    @Override
    public void showProgress(ProgressBook progressBook, Student student) {
        System.out.println("Прогресс " + progressBook.getProgressCourse() + " студент " + student.getName());
    }

}

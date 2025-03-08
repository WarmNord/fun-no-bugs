package practice_05.task_04;

import java.util.ArrayList;
import java.util.List;

public class OopCourse extends Courses {
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

}

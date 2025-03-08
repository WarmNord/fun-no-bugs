package practice_05.task_04;

public abstract class Courses {
    private String nameCourse;

    Courses(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    String getNameCourse() {
        return this.nameCourse;
    }

    public abstract void addTeacher(Teacher teacher);
    public abstract void addStudent(Student student);

    public abstract Teacher getTeacher(int index);
    public abstract Student getStudent(int index);

}

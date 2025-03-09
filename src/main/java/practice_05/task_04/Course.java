package practice_05.task_04;

public abstract class Course {
    private String nameCourse;

    Course(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    String getNameCourse() {
        return this.nameCourse;
    }

    public abstract void addTeacher(Teacher teacher);
    public abstract void addStudent(Student student);

    public abstract Teacher getTeacher(int index);
    public abstract Student getStudent(int index);

    public abstract void sendHomeWork(HomeWork homeWork, Student student);

    public abstract void showProgress(ProgressBook progressBook, Student student);
}

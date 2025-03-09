package practice_05.task_04;

public class ProgressBook {

    private int progressCourse;
    private Student student;

    ProgressBook(Student student) {
        this.student = student;
    }

     int getProgressCourse() {
        return this.progressCourse;
    }

    void addProgress() {
        progressCourse++;
    }
}

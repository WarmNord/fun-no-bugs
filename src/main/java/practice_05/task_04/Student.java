package practice_05.task_04;

public class Student extends Users implements Study {
    private int progressCourse;
    private String name;

    Student(String name) {
        super(name);
    }

    private int getProgressCourse() {
        return this.progressCourse;
    }

    @Override
    public void teach() {
        System.out.print("Учусь на курсе");
        this.progressCourse++;
    }

    void showProgress() {
        System.out.println("\nПрогресс " + getProgressCourse());
    }

}

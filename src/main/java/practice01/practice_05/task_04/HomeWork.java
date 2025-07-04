package practice01.practice_05.task_04;

public class HomeWork {
    private String status;
    private Task task;
    private ProgressBook progressBook;

    HomeWork(Task task, ProgressBook progressBook) {
        this.task = task;
        this.progressBook = progressBook;
    }

    String getTask() {
        return task.getTask();
    }

    void addProgress() {
        progressBook.addProgress();
    }
}

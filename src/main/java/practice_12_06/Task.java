package practice_12_06;

import java.util.Date;

/*Task<T>: Класс, представляющий задачу. Должен содержать поля для ID, статуса, приоритета и даты.
 */
public class Task<T> {
    private final T id;
    private String status;
    private int priority;
    private Date date;

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public T getId() {
        return id;
    }

    public int getPriority() {
        return priority;
    }

    public Date getDate() {
        return date;
    }


    public Task(T id, String status, int priority, Date date) {
        this.id = id;
        this.status = status;
        this.priority = priority;
        this.date = date;
    }


}

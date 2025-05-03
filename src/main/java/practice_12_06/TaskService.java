package practice_12_06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*TaskService<T>: Сервис для управления задачами, включающий методы для добавления, удаления и поиска задач.
*
* Управление задачами:
Добавление задачи: Метод для добавления новой задачи в список.
Удаление задачи: Метод для удаления задачи по ID. Метод должен быть синхронизирован для предотвращения конкурентного доступа.
Поиск задач: Методы для фильтрации задач по статусу и приоритету, а также сортировка задач по дате.
Обработка данных:
Использование Stream API для фильтрации и сортировки задач.
Лямбда-выражения для сортировки задач по дате.*/
public class TaskService<T> {

    private List<Task> taskList = new ArrayList<>();

    public synchronized void addTask(Task task) {
        taskList.add(task);
    }

    public synchronized void deleteTaskById(T id) {
        taskList.removeIf(t -> t.getId() == id);
    }

    public List<Task> getTaskListSortedByStatusAndPriority(String status, int priority) {
        return taskList.stream()
                .filter(
                        t -> t.getStatus().equals(status) && t.getPriority() == priority
                )
                .toList();
    }

    public List<Task> getTaskListSortedByDate() {
        return taskList.stream()
                .sorted(Comparator.comparing(Task::getDate, Comparator.naturalOrder())).toList();
    }

    public boolean containsTask(Task task) {
        return taskList.contains(task);
    }

}

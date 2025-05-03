package practice_12_06;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskServiceTest {

    static TaskService taskService;
    static Task task1;
    static Task task2;
    static Task task3;
    static Task task4;


    @BeforeAll
    static void setUp() {
        taskService = new TaskService();
        task1 = new Task<>(1,"inprogress",1, new Date(2025,05,01));
        task2 = new Task<>(2,"done",4, new Date(2023,05,01));
        task3 = new Task<>(3,"inprogress",6, new Date(2022,05,01));
        task4 = new Task<>(4,"done",3, new Date(2021,05,01));
    }

    @Test
    void addTask() {
        taskService.addTask(task1);
        assertTrue(taskService.containsTask(task1));
    }

    @Test
    void deleteTaskById() {
        taskService.addTask(task2);
        taskService.deleteTaskById(2);
        assertFalse(taskService.containsTask(task2));
    }

    @Test
    void getTaskListSortedByStatusAndPriority() {
        taskService.addTask(task2);
        taskService.addTask(task3);
        taskService.addTask(task4);

        List<Task> t = taskService.getTaskListSortedByStatusAndPriority("done",1);
        assertEquals(t, taskService.getTaskListSortedByStatusAndPriority("done",1));
    }

    @Test
    void getTaskListSortedByDate() {
        List<Task> t = taskService.getTaskListSortedByDate();
        assertEquals(t, taskService.getTaskListSortedByDate());
    }
}
package practice_07.task_01;

import java.io.*;

public class Task08 {

    /*
    *
    * Обязательное закрытие ресурсов: Напишите метод, который открывает файл и читает данные, используя try-with-resources, чтобы гарантированно закрывать ресурс.
    * */

    static void readFile(String path) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Task08.readFile("adsa");
    }
}

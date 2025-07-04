package practice01.practice_07.task_01;

import java.io.*;

public class Task01 {

    /*
    * Обработка файла: Напишите метод, который читает файл и обрабатывает FileNotFoundException и IOException.
    * */

    static void readFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден " + e.getMessage());
        } catch (IOException e){
            System.out.println("Ошибка ввода-вывода " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Task01.readFile("sad");
    }

}

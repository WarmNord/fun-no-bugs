package practice_07.task_01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystemAlreadyExistsException;

public class Task05 {

    /*
    * Цепочка исключений: Создайте метод, который выбрасывает одно исключение, но перехватывает его и выбрасывает другое (Exception Chaining).
    * */

    static void readFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        } catch (FileNotFoundException e) {
            throw new FileSystemAlreadyExistsException("Второе исключение FileSystemAlreadyExistsException");
            //System.out.println("Файл не найден " + e.getMessage());
        } catch (IOException e){
            System.out.println("Ошибка ввода-вывода " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Task05.readFile("saddas");
    }
}

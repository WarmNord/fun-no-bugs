package practice_06.task02;

import java.util.HashSet;
import java.util.Scanner;

public class Task20 {

    /*
    *
    * 20. Проверка дубликатов в потоке данных
Данные поступают в потоковом режиме, и нужно проверять, был ли данный элемент уже получен ранее.
*  данные пришли -Ю промерили множество и вывели информаци об этом
    * */

    static private HashSet<String> data = new HashSet<>();

    static void readData() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите данные (для завершения программы введите \'wq\') : ");
            String newData = scanner.nextLine();

            if (!data.contains(newData) && !newData.equals("wq")) {
                data.add(newData);
                System.out.println("Добавлены данные: " + newData);
            } else if (data.contains(newData)){
                System.out.println("Данные были получены ранее: " + newData);
            } else if (newData.equals("wq")) {
                System.out.println("Вы завершили работу программы");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Task20.readData();
    }

}

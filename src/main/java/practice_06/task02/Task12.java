package practice_06.task02;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task12 {
    /*\
    * 12. Проверка корректности скобочной последовательности
Пользователь вводит строку, содержащую скобки. Нужно определить, правильно ли расставлены скобки.
    *  ( )
    * */

    static private ArrayDeque<String> input = new ArrayDeque<>();

    static void checkInput() {
        // () [] {}
        if (input.getFirst().equals("(") && input.getLast().equals(")")) {
            System.out.println("Скобки () расставлены верно");
        } else if (input.getFirst().equals("[") && input.getLast().equals("]")) {
            System.out.println("Скобки [] расставлены верно");
        } else if (input.getFirst().equals("{") && input.getLast().equals("}")) {
            System.out.println("Скобки {} расставлены верно");
        } else {
            System.out.println("Скобки " + input.getFirst() + input.getLast() + " расставлены верно");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите скобочную последовательность (для выхода из ввода введите exit): ");
        String in = "";

        while (!in.equals("exit")) {
            in = scanner.nextLine();
            if (!in.equals("exit")) {
                input.add(in);
            }

        }

        Task12.checkInput();
    }
}

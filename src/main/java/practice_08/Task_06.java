package practice_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Task_06 {
    /*Фильтрация строк по длине больше 5
Подсказка:
Нужно оставить только те строки, длина которых больше 5 символов. Для этого сначала получаем поток из списка строк, затем применяем фильтрацию по условию length() > 5. После этого собираем результат в новый список.
Методы:
stream()
filter(s -> s.length() > 5)
collect(Collectors.toList())
*/

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hi","helloH","two");
        List<String> result = strings.stream().filter(s -> s.length() > 5).collect(Collectors.toList());
        System.out.println(result);
    }
}

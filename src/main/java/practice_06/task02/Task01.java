package practice_06.task02;


import java.util.TreeSet;

public class Task01 {

    /*Хранение уникальных идентификаторов пользователей
В системе есть список уникальных идентификаторов пользователей. Необходимо быстро проверять, присутствует ли пользователь с заданным идентификатором.*/

    private static TreeSet<Integer> id = new TreeSet<>();

    static void chekUserId(Integer userId) {
        if (id.contains(userId)) {
            System.out.println("Пользователь с " + userId + " есть");
        } else {
            System.out.println("Пользователь с " + userId + " отсуствует");
        }
    }

    public static void main(String[] args) {
        Task01.id.add(23);
        Task01.id.add(55);
        Task01.id.add(456);

        Task01.chekUserId(0);
        Task01.chekUserId(23);

    }
}

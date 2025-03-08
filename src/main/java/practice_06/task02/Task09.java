package practice_06.task02;


import java.util.Stack;

public class Task09 {
    /*
    * 9. История действий пользователя
Необходимо хранить список последних действий пользователя, чтобы можно было отменить или повторить действия.
    * */

    static private Stack<String> actions = new Stack<>();

    static void addAction(String action) {
        actions.push(action);
    }

    static void cancelAction() {
        System.out.println("Отменить последнее действие " + actions.pop());
    }

    static void repeatAction() {
        String lastAction = actions.peek();
        System.out.println("Повторить последнее действие " + lastAction);
        actions.push(lastAction);
    }

    public static void main(String[] args) {
        Task09.addAction("Идти");
        Task09.addAction("Лежать");
        Task09.addAction("Спать");
        Task09.addAction("Проснуться");

        System.out.println(actions);

        Task09.repeatAction();
        System.out.println(actions);

        Task09.cancelAction();
        System.out.println(actions);
        Task09.cancelAction();
        System.out.println(actions);
        Task09.cancelAction();
        System.out.println(actions);
        Task09.repeatAction();
        System.out.println(actions);

    }
}

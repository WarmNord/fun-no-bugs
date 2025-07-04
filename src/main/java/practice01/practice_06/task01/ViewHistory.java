package practice01.practice_06.task01;

import java.util.LinkedHashMap;

public class ViewHistory {

    /*
     * Создайте LinkedHashMap, который хранит историю просмотров пользователя (максимум 10 элементов).
     * */

    private LinkedHashMap<String, Integer> history;
    private final int HISTORY_MAX_SIZE = 10;

    ViewHistory() {
        this.history = new LinkedHashMap<>(HISTORY_MAX_SIZE);
    }

    void addView(String page, Integer numberPage) {
        if (history.size() >= HISTORY_MAX_SIZE) {
            history.sequencedKeySet().removeFirst();
            history.putLast(page, numberPage);
        } else {
            history.putLast(page, numberPage);
        }
    }

    void showViewHistory() {
        history.forEach(
                (page, numberPage) -> {
                    System.out.println("Страница " + page + " №" + numberPage);
                }
        );
        System.out.println("____");
    }

    public static void main(String[] args) {
        ViewHistory viewHistory = new ViewHistory();
        viewHistory.addView("P1", 1);
        viewHistory.addView("P2", 2);
        viewHistory.addView("P3", 3);
        viewHistory.addView("P4", 4);
        viewHistory.addView("P5", 5);
        viewHistory.addView("P6", 6);
        viewHistory.addView("P7", 7);
        viewHistory.addView("P8", 8);
        viewHistory.addView("P9", 9);
        viewHistory.addView("P10", 10);
        viewHistory.showViewHistory();
        viewHistory.addView("P11", 11);
        viewHistory.addView("P12", 12);
        viewHistory.showViewHistory();


    }
}

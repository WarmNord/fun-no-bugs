package practice_05.task_03;

import java.util.ArrayList;
import java.util.List;

public class ManageRestouraunt {

    static private List<RestoraunFood> menu = new ArrayList<>();

    /*
    * Управление рестораном
В ресторане есть разные блюда, каждое из которых имеет свои особенности. Например:
Горячее блюдо подаётся с указанием температуры.
Напиток подаётся с указанием объёма.
Нужно спроектировать систему, которая позволяет добавлять блюда в меню ресторана и выводить их описание с учётом специфичных характеристик (например, температура для горячих блюд или объём для напитков).
    * */

    void addFood(RestoraunFood food) {
        menu.add(food);
    }

    void showInfo(int index) {
        menu.get(index).showFood();
    }

    public static void main(String[] args) {
        ManageRestouraunt manageRestouraunt = new ManageRestouraunt();
        Water water = new Water(1);
        HotFood hotFood = new HotFood(35);

        manageRestouraunt.addFood(water);
        manageRestouraunt.addFood(hotFood);

        manageRestouraunt.showInfo(0);
        manageRestouraunt.showInfo(1);
    }
}

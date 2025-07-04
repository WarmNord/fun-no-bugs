package practice01.practice_05.task_03;

public class ManageRestouraunt {

     private Menu menu = new Menu();

    /*
    * Управление рестораном
В ресторане есть разные блюда, каждое из которых имеет свои особенности. Например:
Горячее блюдо подаётся с указанием температуры.
Напиток подаётся с указанием объёма.
Нужно спроектировать систему, которая позволяет добавлять блюда в меню ресторана и выводить их описание с учётом специфичных характеристик (например, температура для горячих блюд или объём для напитков).
    * */

    void addFood(RestoraunFood food) {
        menu.addFood(food);
    }

    void showInfo(RestoraunFood food) {
        menu.showInfo(food);
    }

    public static void main(String[] args) {
        ManageRestouraunt manageRestouraunt = new ManageRestouraunt();
        Water water = new Water(1);
        HotFood hotFood = new HotFood(35);

        manageRestouraunt.addFood(water);
        manageRestouraunt.addFood(hotFood);

        manageRestouraunt.showInfo(water);
        manageRestouraunt.showInfo(hotFood);
    }
}

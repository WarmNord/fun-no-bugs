package practice02.practice02.creational.abstractfabric.gui;

/*
*
* Реализовать абстрактную фабрику графических элементов (Кнопка, Окно, Меню в стиле Windows и MacOS)
Описание
Приложение должно работать одинаково на разных платформах (Windows и MacOS), но выглядеть по-разному, соответственно стилям каждой платформы.
* Мы будем использовать абстрактную фабрику для создания различных графических элементов (например, кнопок, окон и меню),
* которые будут выглядеть по-разному в зависимости от платформы.
* 1) Интерфейсы граф элементов
* 2) Фабрику главную Граф элементов - методы по созданию фабричные
* 3) Фабрику windows и macos имплементируют гланую фабрику граф элементов и создают элементы для конкретной системы
* 4)
* */
public class Main {
    public static void main(String[] args) {
        GUIFactory factory;
        String style = "Window";
        if ("Windows".equals(style)) {
            factory = new WindowsFactory();
        } else {
            factory = new MacOSFactory();
        }
        factory.createWindow().print();
        factory.createMenu().print();
        factory.createButton().print();
    }
}

package practice02.practice02.creational.abstractfabric.furniture;


/*
* Реализовать абстрактную фабрику мебели (Современная мебель, Классическая мебель)
Описание
В мебельном магазине предлагаются два стиля мебели: современный и классический.
* Клиент должен выбрать только стиль, а конкретные элементы мебели (например, стулья и столы) должны подбираться автоматически в зависимости от выбранного стиля. Мы будем использовать абстрактную фабрику, чтобы разделить создание современных и классических элементов мебели.
* */
public class Main {


    public static void main(String[] args) {
        MainFabricFurniture mainFabricFurniture;

        String style;
        style = "Classic";

        if (style.equals("Modern")) {
            mainFabricFurniture = new ModernFabricFurniture();
        } else {
            mainFabricFurniture = new ClassicFabricFurniture();
        }

        mainFabricFurniture.createChair().print();
        mainFabricFurniture.createTable().print();


    }
}

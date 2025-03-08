package practice_02;

public class Product {
/*
    Поля:
    String name (название товара),
    double price (цена).
    Реализуйте:
    Конструктор для задания имени и цены.
    Геттеры для получения данных.
    Сеттер для изменения цены.
    Метод applyDiscount(double discount) для уменьшения цены на discount процентов.
    Метод printInfo() для вывода:
            "Товар: Хлеб, Цена: 50.0 руб.".
    В методе main измените цену через сеттер, примените скидку и выведите новую цену.
*/

    String name;
    double price;

    Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }

    void setPrice(double price){
        this.price = price;
    }

    void applyDiscount(double discount) {
        this.price = getPrice() - discount;
    }

    void printInfo() {
        System.out.println("Товар: "+ getName() +", Цена: " + getPrice() + " руб.");
    }

    public static void main(String[] args) {
        Product product = new Product("Water", 50.0);
        product.setPrice(25.0);
        product.applyDiscount(10.0);
        product.printInfo();
    }
}

package practice_02;

public class Laptop {

/*    Поля:
    String brand (бренд),
    double price (цена).
    Реализуйте:
    Конструктор для задания бренда и цены.
    Геттеры и сеттеры для обоих полей.
    Метод printInfo() для вывода:
            "Ноутбук: Lenovo, Цена: 70000.0 руб.".
    В методе main измените цену через сеттер и выведите обновлённую информацию.*/

    String brand;
    double price;

    Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    String getBrand() {
        return this.brand;
    }

    double getPrice() {
        return this.price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    void printinfo() {
        System.out.println("Ноутбук: " + getBrand() + ", Цена: " + getPrice() + " руб.");
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop("Lenovo", 70000.0);
        laptop.setPrice(100000.0);
        laptop.printinfo();
    }
}

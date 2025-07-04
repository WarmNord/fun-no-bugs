package practice01.practice_02;

public class Car {
/*    Поля:
    String brand (марка машины),
    int year (год выпуска).

    Реализуйте:
    Конструктор, который принимает brand и year.
    Геттеры и сеттеры для обоих полей.
    Метод print(), который выводит информацию о машине в формате:
            "Марка: Toyota, Год выпуска: 2015".
    В методе main создайте объект класса Car, установите значения через конструктор, измените год через сеттер и выведите информацию.*/

    String brand;
    int year;

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    String getBrand() {
        return this.brand;
    }

    int getYear() {
        return this.year;
    }

    void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    void setYear(int newYear) {
        this.year = newYear;
    }

    void print() {
        System.out.println("Марка: " + getBrand()+", Год выпуска: "+ getYear());
    }


    public static void main(String[] args) {
        Car car1 = new Car("Nissan", 1995);
        car1.print();
        car1.setYear(2010);
        car1.print();
    }
}

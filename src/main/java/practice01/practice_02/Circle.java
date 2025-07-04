package practice01.practice_02;

public class Circle {
/*    Поля:
    double radius (радиус).
    Реализуйте:
    Конструктор для задания радиуса.
    Геттер для получения радиуса.
    Сеттер для изменения радиуса.
    Метод calculateArea(), который возвращает площадь (πr2\pi r^2).
    Метод calculateCircumference(), который возвращает длину окружности (2πr2 \pi r).
    В методе main создайте круг, измените радиус через сеттер и выведите площадь и длину окружности.*/

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return this.radius;
    }

    void setRadius(double radius){
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * getRadius() * getRadius();
    }

    double calculateCircumference() {
        return 2 * Math.PI *  getRadius() * getRadius();
    }

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        circle.setRadius(4);
        System.out.println("площадь: "+  circle.calculateArea() +",длинa окружности: " + circle.calculateCircumference());
    }
}

package practice_02;

public class Rectangle {

  /*  Rectangle
    Поля:
    int width (ширина),
    int height (высота).
    Реализуйте:
    Конструктор для задания ширины и высоты.
    Геттеры для получения значений ширины и высоты.
    Сеттер для изменения ширины.
    Метод calculateArea(), который возвращает площадь прямоугольника.
    В методе main создайте прямоугольник, измените ширину через сеттер и выведите его площадь.*/

    int width;
    int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int getWidth() {
        return this.width;
    }

    int getHeight() {
        return this.height;
    }

    void setWidth(int newWidth) {
        this.width = newWidth;
    }

    int calculateArea() {
        return getWidth() * getHeight();
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle(2,4);
        System.out.println(rec.calculateArea());
        rec.setWidth(1);
        System.out.println(rec.calculateArea());

    }
}

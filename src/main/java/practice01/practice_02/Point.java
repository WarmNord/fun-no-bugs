package practice01.practice_02;

public class Point {

/*    Поля:
    int x (координата x),
    int y (координата y).
    Реализуйте:
    Конструктор для задания координат.
    Геттеры для получения значений координат.
    Сеттер для изменения значения x.
            Метод print() для вывода координат в формате:
            "Координаты: x = 5, y = 10".
    В методе main измените координату x и выведите новые координаты.*/

    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return this.x;
    }

    int getY() {
        return this.y;
    }

    void setX(int x){
        this.x = x;
    }

    void print() {
        System.out.println("Координаты: x = "+ getX() +", y = " + getY());
    }

    public static void main(String[] args) {
        Point point = new Point(5, 10);
        point.setX(15);
        point.print();
    }
}

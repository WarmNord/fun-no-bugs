package practice01.practice_05;

abstract class Shape {

    abstract void draw();

}

class Circle extends Shape {

    @Override

    void draw() {

        System.out.println("Рисую круг.");

    }

}

public class Main {

    public static void main(String[] args) {

        Shape shape = new Circle();

        shape.draw();

    }

}

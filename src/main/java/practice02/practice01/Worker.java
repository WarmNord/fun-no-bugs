package practice02.practice01;

/*Нарушение ISP (Interface Segregation Principle) – слишком большой интерфейс
Исходный код:*/
interface Workeable {
    void work();
}

interface Eatable {
    void eat();
}
class Programmer implements Workeable, Eatable {
    @Override
    public void work() {
        System.out.println("Программист пишет код");
    }
    @Override
    public void eat() {
        throw new UnsupportedOperationException("Программист не ест на работе");
    }
}


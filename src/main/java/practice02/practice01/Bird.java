package practice02.practice01;

/*Нарушение LSP (Liskov Substitution Principle) – некорректное поведение подклассов
Исходный код:*/
class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Птица летит");
    }
}

class Penguin extends Bird {

}

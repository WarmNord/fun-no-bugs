package practice02.practice02.structural.facade.door;

/*
* Фасад для управления дверью (открыть, закрыть, заблокировать)
Описание
В нашей системе есть несколько операций для управления дверью:
Открытие двери.
Закрытие двери.
Блокировка двери.
Каждая операция реализована в своём классе.
* Задача — создать фасад, который будет объединять эти операции и предоставлять простой интерфейс для работы с дверью.
* */
public class Main {
    public static void main(String[] args) {

        FacadeDoor facadeDoor = new FacadeDoor(new Block(), new Close(), new Open());
        facadeDoor.openDoor();
        facadeDoor.blockDoor();
        facadeDoor.closeDoor();

    }
}

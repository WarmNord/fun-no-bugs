package practice02.practice02.creational.builder.market;

/*
* Реализовать строитель для создания заказов в интернет-магазине
Описание
В интернет-магазине клиент может оформить заказ, добавляя товары, указывая скидку и выбирая способ оплаты.
* Паттерн Builder поможет организовать процесс формирования заказа, не перегружая конструктор класса Order множеством параметров.
* Это позволяет строить объекты заказов поэтапно, добавляя товары, скидки и способы оплаты по мере необходимости.

* */
public class Main {
    public static void main(String[] args) {
        Order order = new Order.Builder()
                .setProduct("Fanta")
                .setPayment("Cash")
                .setDiscount(0)
                .build();

        order.print();
    }
}

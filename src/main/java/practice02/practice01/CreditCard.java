package practice02.practice01;

public class CreditCard extends Payment implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Оплата кредитной картой на сумму " + amount);
    }
}

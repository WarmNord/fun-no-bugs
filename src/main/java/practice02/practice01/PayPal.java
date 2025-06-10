package practice02.practice01;

public class PayPal extends Payment implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Оплата через PayPal на сумму " + amount);
    }
}

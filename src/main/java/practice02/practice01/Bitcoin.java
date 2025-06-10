package practice02.practice01;

public class Bitcoin extends Payment implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Оплата Bitcoin на сумму " + amount);
    }
}

package practice02.practice01;

/*5. Нарушение OCP (Open/Closed Principle) – закрытый для расширения код
Исходный код:*/
public interface PaymentProcessor {
    void processPayment(double amount);

}

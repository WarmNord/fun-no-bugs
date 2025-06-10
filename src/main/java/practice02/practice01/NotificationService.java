package practice02.practice01;

/*Нарушение DIP (Dependency Inversion Principle) – жесткая зависимость от конкретных классов
Исходный код:*/
public class NotificationService {
    private EmailSender emailSender;

    NotificationService(EmailSender emailSender) {
        emailSender = emailSender;
    }
    public void sendNotification(String message) {
        emailSender.sendEmail(message);
    }
}

class EmailSender {
    public void sendEmail(String message) {
        System.out.println("Отправка email: " + message);
    }
}

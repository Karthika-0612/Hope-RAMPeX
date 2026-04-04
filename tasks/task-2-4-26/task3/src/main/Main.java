package main;

import model.User;
import model.Notification;
import service.NotificationFactory;
import service.NotificationService;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("Karthika", "karthika@gmail.com", "9876543210");

        NotificationService service = new NotificationService();

        // EMAIL
        Notification email = NotificationFactory.createNotification(
                "email", user1, "Welcome to our platform!");
        service.sendNotification(email);

        // SMS
        Notification sms = NotificationFactory.createNotification(
                "sms", user1, "Your OTP is 1234");
        service.sendNotification(sms);

        // PUSH
        Notification push = NotificationFactory.createNotification(
                "push", user1, "New offer available!");
        service.sendNotification(push);

        // ERROR CASE
        Notification invalid = NotificationFactory.createNotification(
                "email", new User("Test", null, null), "Hello");
        service.sendNotification(invalid);
    }
}
package service;

import model.*;

public class NotificationFactory {

    public static Notification createNotification(String type, User user, String message) {

        switch (type.toLowerCase()) {
            case "email":
                return new EmailNotification(user, message);
            case "sms":
                return new SMSNotification(user, message);
            case "push":
                return new PushNotification(user, message);
            default:
                throw new IllegalArgumentException("Invalid notification type");
        }
    }
}
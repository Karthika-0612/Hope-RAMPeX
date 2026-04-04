package service;

import model.Notification;

public class NotificationService {

    public void sendNotification(Notification notification) {
        try {
            notification.send();
        } catch (Exception e) {
            System.out.println("Error sending notification: " + e.getMessage());
        }
    }
}
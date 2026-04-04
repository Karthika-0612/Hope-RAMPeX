package model;

public class PushNotification extends Notification {

    public PushNotification(User user, String message) {
        super(user, message);
    }

    @Override
    public void send() {
        System.out.println("Sending PUSH notification to " +
                user.getName() + ": " + message);
    }
}
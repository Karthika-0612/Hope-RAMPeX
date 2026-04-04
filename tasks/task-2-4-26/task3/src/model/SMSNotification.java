package model;

public class SMSNotification extends Notification {

    public SMSNotification(User user, String message) {
        super(user, message);
    }

    @Override
    public void send() {
        if (user.getPhone() == null) {
            throw new RuntimeException("Phone number not available");
        }
        System.out.println("Sending SMS to " + user.getPhone() +
                ": " + message);
    }
}
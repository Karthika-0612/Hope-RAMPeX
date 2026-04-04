package model;

public class EmailNotification extends Notification {

    public EmailNotification(User user, String message) {
        super(user, message);
    }

    @Override
    public void send() {
        if (user.getEmail() == null) {
            throw new RuntimeException("Email not available");
        }
        System.out.println("Sending EMAIL to " + user.getEmail() +
                ": " + message);
    }
}
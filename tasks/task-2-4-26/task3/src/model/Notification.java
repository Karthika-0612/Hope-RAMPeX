package model;
public abstract class Notification {
    protected User user;
    protected String message;

    public Notification(User user, String message) {
        if (message == null || message.isEmpty()) {
            throw new IllegalArgumentException("Message cannot be empty");
        }
        this.user = user;
        this.message = message;
    }

    public abstract void send();
}

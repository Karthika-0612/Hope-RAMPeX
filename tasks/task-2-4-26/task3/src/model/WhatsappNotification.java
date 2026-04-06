package model;
public class WhatsappNotification extends Notification {
    public WhatsappNotification(User user, String message) {
        super(user, message);
    }
    @Override
    public void send() {
        if (user.getPhone() == null) {
            throw new RuntimeException("Phone number required for WhatsApp");
        }
        System.out.println("Sending WhatsApp message to " +
                user.getPhone() + ": " + message);
    }
}


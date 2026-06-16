interface Notification {
    void send(String message);
}

class EmailNotification implements Notification {
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}

class SMSNotification implements Notification {
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}

class PushNotification implements Notification {
    public void send(String message) {
        System.out.println("Push: " + message);
    }
}

class NotificationFactory {

    public static Notification createNotification(String type) {

        if(type.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification();
        }

        if(type.equalsIgnoreCase("SMS")) {
            return new SMSNotification();
        }

        if(type.equalsIgnoreCase("PUSH")) {
            return new PushNotification();
        }

        return null;
    }
}

public class NotificationFactoryMethod {
    public static void main(String[] args) {

        Notification notification =
                NotificationFactory.createNotification("EMAIL");

        notification.send("Welcome Arjun");
    }
}

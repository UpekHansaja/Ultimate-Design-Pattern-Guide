interface NotificationChannel {
    void send(String message);
}

class Email implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}

class SMS implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class PushNotification implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("Sending Push Notification: " + message);
    }
}

abstract class Notification {

    protected NotificationChannel channel;

    public Notification(NotificationChannel channel){
        this.channel = channel;
    }

    public abstract void notifyUser(String message);
}

class EmailAlert extends Notification{
    public EmailAlert(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void notifyUser(String message) {
        channel.send("Email Alert: " + message);
    }
}

public class NotificationSystem {

    public static void main(String[] args) {
        
        Notification email = new EmailAlert(new Email());
        email.notifyUser("Hello, this is a test email!");

    }
    
}

class User{
    private String name;
    
    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message, User recipient) {
        System.out.println(this.name + " sends message: " + message + " to " + recipient.getName());
        // Here we would normally call a method on the ChatRoom to handle the message
    }
}

public class ChatRoom {

    public static void main(String[] args) {
        
        User user1 = new User("Upek");
        User user2 = new User("Rashi");

        user1.sendMessage("Hello, Rashi!", user2);
        user2.sendMessage("Hi, Upek! How are you?", user1);

    }
    
}

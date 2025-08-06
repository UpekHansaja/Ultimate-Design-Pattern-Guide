import java.util.List;
import java.util.ArrayList;

interface Mediator {
    void sendMessage(String message, User sender);
    void addUser(User user);
}

class ChatRoomMediator implements Mediator {

    private List<User> users;

    public ChatRoomMediator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            if (user != sender) {
                user.receive(message, sender.getName());
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

}

class User {
    private String name;
    private Mediator mediator;

    public User(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void send(String message) {
        mediator.sendMessage(message, this);
    }

    public void receive(String message, String senderName) {
        System.out.println(name + " received message from " + senderName + ": " + message);
    }
}

public class ChatRoom {

    public static void main(String[] args) {
        
        ChatRoomMediator chatRoom = new ChatRoomMediator();

        User user1 = new User("Upek", chatRoom);
        User user2 = new User("Rashi", chatRoom);
        User user3 = new User("Senu", chatRoom);

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.send("Hello everyone!");
        user2.send("Hi Upek!");
        user3.send("Good morning Upek and Rashi!");
        user1.send("Good morning Senu!");

    }
    
}

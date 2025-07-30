abstract class SupportHandler {
    protected SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String request);
}

class Level1 extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("basic")) {
            System.out.println("Level 1 support handling basic request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

class Level2 extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("intermediate")) {
            System.out.println("Level 2 support handling intermediate request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

class Level3 extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("complex")) {
            System.out.println("Level 3 support handling complex request.");
        } else {
            System.out.println("No handler available for this request.");
        }
    }
}

public class HelpDesk {

    public static void main(String[] args) {

        SupportHandler level1 = new Level1();
        SupportHandler level2 = new Level2();
        SupportHandler level3 = new Level3();

        level1.setNextHandler(level2);
        level2.setNextHandler(level3);

        level1.handleRequest("complex"); // Level 3 support handling complex request.

    }

}

interface Expression {
    void interpret(Context context);
}

class Context {

    public void turnOnDevice(String device) {
        System.out.println("Turning On " + device);
    }

    public void turnOffDevice(String device) {
        System.out.println("Turning Off " + device);
    }

    public void setTemperature(String device, int temperature) {
        System.out.println("Setting " + device + " temperature to " + temperature + " degrees");
    }

    public void increaseTemp(int amount) {
        System.out.println("Increasing temperature by " + amount + " degrees");
    }

    public void decreaseTemp(int amount) {
        System.out.println("Decreasing temperature by " + amount + " degrees");
    }

}

class DeviceCommand implements Expression {
    private String device;
    private String action;

    public DeviceCommand(String device, String action) {
        this.action = action;
        this.device = device;
    }

    @Override
    public void interpret(Context context) {
        switch (action.toLowerCase()) {
            case "on":
                context.turnOnDevice(device);
                break;
            case "off":
                context.turnOffDevice(device);
                break;
            case "set temperature":
                context.setTemperature(device, 22); // Default temperature for example
                break;
            case "increase temperature":
                context.increaseTemp(5); // Default increase for example
                break;
            case "decrease temperature":
                context.decreaseTemp(3); // Default decrease for example
                break;
            default:
                System.out.println("Unknown action: " + action);
                break;
        }
    }
}

class CommandParser {
    public static Expression parse(String command) {

        String[] tokens = command.split(" ");

        if (tokens[0].equalsIgnoreCase("turn")) {

            String action = tokens[1].toLowerCase();
            String device = "";

            for (int i = 2; i < tokens.length; i++) {
                device += tokens[i] + " ";
            }
            device = device.trim();

            return new DeviceCommand(device, action);

        } else if (tokens[0].equalsIgnoreCase("set") && tokens[1].equalsIgnoreCase("temperature")) {

            String device = tokens[2].toLowerCase();
            // int temperature = Integer.parseInt(tokens[4]);
            return new DeviceCommand(device, "set temperature");

        } else if (tokens[0].equalsIgnoreCase("increase") && tokens[1].equalsIgnoreCase("temperature")) {

            String device = tokens[2].toLowerCase();
            return new DeviceCommand(device, "increase temperature");

        }

        else if (tokens[0].equalsIgnoreCase("decrease") && tokens[1].equalsIgnoreCase("temperature")) {

            String device = tokens[2].toLowerCase();
            return new DeviceCommand(device, "decrease temperature");

        } else {
            System.out.println("Invalid command: " + command);
            return null;
        }

    }
}

public class SmartHome {

    public static void main(String[] args) {
        
        Context context = new Context();

        // Example commands
        String command1 = "turn on kitchen light";
        String command2 = "turn off bedroom heater";
        String command3 = "set temperature thermostat";
        String command4 = "increase temperature air conditioner";
        String command5 = "decrease temperature heater";

        // Parsing and executing commands
        Expression expression1 = CommandParser.parse(command1);
        if (expression1 != null) expression1.interpret(context);

        Expression expression2 = CommandParser.parse(command2);
        if (expression2 != null) expression2.interpret(context);

        Expression expression3 = CommandParser.parse(command3);
        if (expression3 != null) expression3.interpret(context);

        Expression expression4 = CommandParser.parse(command4);
        if (expression4 != null) expression4.interpret(context);

        Expression expression5 = CommandParser.parse(command5);
        if (expression5 != null) expression5.interpret(context);

        // Example of an invalid command
        String invalidCommand = "Abaracadabra";
        Expression invalidExpression = CommandParser.parse(invalidCommand);
        if (invalidExpression != null) invalidExpression.interpret(context);

    }

}

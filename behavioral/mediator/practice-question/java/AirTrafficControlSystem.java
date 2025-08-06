import java.util.ArrayList;
import java.util.List;

interface Mediator {
    void sendMessage(String message, Airplane sender);

    void addAirplane(Airplane airplane);
}

class AirTrafficControlSystemMediator implements Mediator {
    private List<Airplane> airplanes;

    public AirTrafficControlSystemMediator() {
        this.airplanes = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, Airplane sender) {
        for (Airplane airplane : airplanes) {

            if (airplane != sender) {
                airplane.receiveMessage(message, sender.getName());
            }
        }
    }

    @Override
    public void addAirplane(Airplane airplane) {
        airplanes.add(airplane);
    }
}

class Airplane {
    private String name;
    private Mediator mediator;

    public Airplane(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message, Airplane receiver) {
        mediator.sendMessage(message, receiver);
    }

    public void receiveMessage(String message, String sender) {
        System.out.println(name + " received message from " + sender + ": " + message);
    }

    
}

public class AirTrafficControlSystem {

    public static void main(String[] args) {

        AirTrafficControlSystemMediator atcMediator = new AirTrafficControlSystemMediator();

        Airplane airplane1 = new Airplane("Sri Lankan Airline", atcMediator);
        Airplane airplane2 = new Airplane("Emirates", atcMediator);
        Airplane airplane3 = new Airplane("Qatar Airways", atcMediator);
        Airplane airplane4 = new Airplane("Singapore Airlines", atcMediator);

        atcMediator.addAirplane(airplane1);
        atcMediator.addAirplane(airplane2);
        atcMediator.addAirplane(airplane3);
        atcMediator.addAirplane(airplane4);

        airplane1.sendMessage("Hello, Singapore Airlines! we are approaching your airspace.", airplane4);
        airplane4.sendMessage("Hello, Sri Lankan Airline! Please maintain altitude.", airplane1);
        airplane2.sendMessage("Emirates to Sri Lankan Airline, we are ready for takeoff.", airplane1);
        airplane3.sendMessage("Qatar Airways to Sri Lankan Airline, we are ready for landing.", airplane1);
        airplane4.sendMessage("Hello Emirates! We are currently on the runway.", airplane2);
    }

}

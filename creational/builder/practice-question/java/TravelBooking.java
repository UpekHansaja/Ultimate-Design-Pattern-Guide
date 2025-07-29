
class HolidayPackages {

    private final String flight_ticket;
    private final String hotel;
    private final boolean airport_pickup;
    private final boolean sightseeing_tour;
    private final boolean travel_insurance;

    public HolidayPackages(HolidayPackageBuilder builder) {
        this.flight_ticket = builder.getFlight_ticket();
        this.hotel = builder.getHotel();
        this.airport_pickup = builder.isAirport_pickup();
        this.sightseeing_tour = builder.isSightseeing_tour();
        this.travel_insurance = builder.isTravel_insurance();
    }

    public void showPackageDetails() {
        System.out.println("Package Includes:");
        System.out.println("Flight Ticket: " + flight_ticket);
        System.out.println("Hotel: " + hotel);
        System.out.println("Airport Pickup: " + airport_pickup);
        System.out.println("Sightseeing Tour: " + sightseeing_tour);
        System.out.println("Travel Insurance: " + travel_insurance);
    }

}

class HolidayPackageBuilder {

    private String flight_ticket;
    private String hotel;
    private boolean airport_pickup;
    private boolean sightseeing_tour;
    private boolean travel_insurance;

    public String getFlight_ticket() {
        return flight_ticket;
    }

    public HolidayPackageBuilder setFlight_ticket(String flight_ticket) {
        this.flight_ticket = flight_ticket;
        return this;
    }

    public String getHotel() {
        return hotel;
    }

    public HolidayPackageBuilder setHotel(String hotel) {
        this.hotel = hotel;
        return this;
    }

    public boolean isAirport_pickup() {
        return airport_pickup;
    }

    public HolidayPackageBuilder setAirport_pickup(boolean airport_pickup) {
        this.airport_pickup = airport_pickup;
        return this;
    }

    public boolean isSightseeing_tour() {
        return sightseeing_tour;
    }

    public HolidayPackageBuilder setSightseeing_tour(boolean sightseeing_tour) {
        this.sightseeing_tour = sightseeing_tour;
        return this;
    }

    public boolean isTravel_insurance() {
        return travel_insurance;
    }

    public HolidayPackageBuilder setTravel_insurance(boolean travel_insurance) {
        this.travel_insurance = travel_insurance;
        return this;
    }

    public HolidayPackages build() {
        return new HolidayPackages(this);
    }

}

public class TravelBooking {

    public static void main(String[] args) {

        HolidayPackages myPackage = new HolidayPackageBuilder()
        .setFlight_ticket("Colombo to Maldives")
        .setHotel("Maldives Beach Resport")
        .setAirport_pickup(true)
        .setSightseeing_tour(false)
        .setTravel_insurance(true)
        .build();

        myPackage.showPackageDetails();

    }

}

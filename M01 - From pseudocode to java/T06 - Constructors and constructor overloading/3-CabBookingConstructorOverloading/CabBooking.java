
class CabBooking {

    String name;
    String type;
    int distance;
    int fare;

    CabBooking(String name) {
        this.name = name;
        this.type = "Mini";
        this.distance = 5;
        this.fare = 75;

    }

    CabBooking(String name, String type, int distance) {
        this.name = name;
        this.type = type;
        this.distance = distance;
        this.fare = distance * 15;
    }

    void display() {
        System.out.println("Passenger: " + name);
        System.out.println("Cab Type: " + type);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: Rs." + fare);
    }
}

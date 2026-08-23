
class Ticket {

    String destination;
    double price;

    Ticket(String destination, double price) {
        this.destination = destination;
        this.price = price;
    }

    void displayTicket() {
        System.out.println("Destination: " + destination);
        System.out.println("Ticket price: " + price);
    }
}

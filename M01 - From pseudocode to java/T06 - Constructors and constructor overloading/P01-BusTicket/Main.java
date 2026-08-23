
class Main {

    public static void main(String[] args) {

        Conductor c = new Conductor();

        Money m = new Money(50);

        c.collect(m);

        Ticket t = c.give();

        if (t != null) {
            System.out.println("Ticket collected");
            t.displayTicket();
        }
    }
}

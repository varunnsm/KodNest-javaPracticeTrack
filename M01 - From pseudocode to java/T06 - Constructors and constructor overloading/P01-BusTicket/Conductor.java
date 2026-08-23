
class Conductor {

    void collect(Money m) {
        System.out.println("Money collected by Conductor");
        m.displayMoney();
    }

    Ticket give() {
        Ticket t = new Ticket("Calicut", 50);
        System.out.println("Ticket issued");
        return t;
    }
}


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create and fill the first ticket
        SupportTicket a1 = new SupportTicket();
        a1.id = scanner.nextInt();
        a1.priority = scanner.nextInt();
        a1.waitingMinutes = scanner.nextInt();

        // Create and fill the second ticket
        SupportTicket a2 = new SupportTicket();
        a2.id = scanner.nextInt();
        a2.priority = scanner.nextInt();
        a2.waitingMinutes = scanner.nextInt();

        // Create and fill the third ticket
        SupportTicket a3 = new SupportTicket();
        a3.id = scanner.nextInt();
        a3.priority = scanner.nextInt();
        a3.waitingMinutes = scanner.nextInt();

        // Initially select the first ticket
        SupportTicket selected = a1;

        // Compare the second ticket using the ordered rules
        if (a2.priority > selected.priority
                || (a2.priority == selected.priority && a2.waitingMinutes > selected.waitingMinutes)
                || (a2.priority == selected.priority && a2.waitingMinutes == selected.waitingMinutes && a2.id < selected.id)) {
            selected = a2;
        }

        // Compare the third ticket with the current selection
        if (a3.priority > selected.priority
                || (a3.priority == selected.priority && a3.waitingMinutes > selected.waitingMinutes)
                || (a3.priority == selected.priority && a3.waitingMinutes == selected.waitingMinutes && a3.id < selected.id)) {
            selected = a3;
        }

        // Print the selected object's fields
        System.out.println("Selected Ticket: " + selected.id);
        System.out.println("Priority: " + selected.priority);
        System.out.println("Waiting Minutes: " + selected.waitingMinutes);
    }
}

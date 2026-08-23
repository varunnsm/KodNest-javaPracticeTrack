
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create three different PracticeTask objects and read their IDs
        PracticeTask p1 = new PracticeTask();
        PracticeTask p2 = new PracticeTask();
        PracticeTask p3 = new PracticeTask();

        p1.id = scanner.nextInt();
        p2.id = scanner.nextInt();
        p3.id = scanner.nextInt();

        // Preserve the first ID as a primitive int
        int unreachable = p1.id;

        // Create relay and perform the five reference assignments in order
        PracticeTask relay = p1;
        p1 = p2;
        p2 = p3;
        relay = p2;
        p3 = p1;

        // Print the final IDs reached by all four references
        System.out.println("First Reference: " + p1.id);
        System.out.println("Second Reference: " + p2.id);
        System.out.println("Third Reference: " + p3.id);
        System.out.println("Relay Reference: " + relay.id);
        System.out.println("Unreachable Object: " + unreachable);
    }
}

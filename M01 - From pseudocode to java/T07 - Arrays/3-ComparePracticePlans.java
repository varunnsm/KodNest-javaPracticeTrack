
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();
        int[] planned = new int[days];
        int[] completed = new int[days];

        // Read the planned values
        for (int i = 0; i < days; i++) {
            planned[i] = scanner.nextInt();
        }

        // Read the completed values
        for (int i = 0; i < days; i++) {
            completed[i] = scanner.nextInt();
        }

        // Compare both arrays
        int count = 0;
        for (int i = 0; i < days; i++) {
            if (planned[i] <= completed[i]) {
                System.out.println("Day " + (i + 1) + ": Completed");
                count++;
            } else {
                System.out.println("Day " + (i + 1) + ": Pending");
            }
        }

        // Print each day's status and the completed-day count
        System.out.println("Completed days: " + count);
    }
}


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();
        int expressFee = scanner.nextInt();

        // Create one DeliveryCalculator object
        DeliveryCalculator a = new DeliveryCalculator();

        // Call the one-parameter overload
        int res = a.calculateCharge(distance);

        // Call the two-parameter overload
        int res1 = a.calculateCharge(res, expressFee);

        // Print both returned charges
        System.out.println("Standard Charge: " + res);
        System.out.println("Express Charge: " + res1);

    }
}

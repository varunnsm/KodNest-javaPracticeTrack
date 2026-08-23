
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int price = scanner.nextInt();
        int quantity = scanner.nextInt();
        int deliveryCharge = scanner.nextInt();

        // Create one OrderCalculator object
        OrderCalculator a = new OrderCalculator();

        // Call both methods
        int subtotal = a.calculateSubtotal(price, quantity);
        int finalTotal = a.calculateFinalTotal(subtotal, deliveryCharge);

        // Print the returned values
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Final Total: " + finalTotal);

    }
}

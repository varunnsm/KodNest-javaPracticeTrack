
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of days
        int numberOfDays = scanner.nextInt();

        // Create and populate the sales array
        double[] dailySales = new double[numberOfDays];
        for (int i = 0; i < dailySales.length; i++) {
            dailySales[i] = scanner.nextDouble();
        }

        // Create the SalesAnalyzer object
        SalesAnalyzer analyzer = new SalesAnalyzer(dailySales);

        // Display the report
        analyzer.displayReport();

        scanner.close();
    }
}

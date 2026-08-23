// Runtime Eligibility Check(Grouping && and ')

import java.util.Scanner;

public class runtimeEligibilityCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codingScore = scanner.nextInt();
        int attendance = scanner.nextInt();
        int projects = scanner.nextInt();

        // Build the correctly grouped eligibility condition.
        // Print Eligible or Not Eligible.
        if (codingScore >= 60 && attendance >= 75 || projects >= 2) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
        scanner.close();
    }

}


import java.util.Scanner;

public class DailyAttendanceTotals {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int classes = scanner.nextInt();
        int days = scanner.nextInt();
        int[][] attendance = new int[classes][days];

        // Read the matrix
        for (int i = 0; i < classes; i++) {
            for (int j = 0; j < days; j++) {
                attendance[i][j] = scanner.nextInt();
            }
        }

        // Calculate and display one total for every day
        for (int j = 0; j < days; j++) {
            int total = 0;
            for (int i = 0; i < classes; i++) {
                total = total + attendance[i][j];
            }
            System.out.println("Day " + (j + 1) + " total: " + total);
        }
    }
}

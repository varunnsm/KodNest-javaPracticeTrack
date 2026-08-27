
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];

        // Read the array
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Read target and replacement
        int target = scanner.nextInt();
        int replacement = scanner.nextInt();

        // Replace matches, count changes and display the result
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (numbers[i] == target) {
                numbers[i] = replacement;
                count++;
            }
        }

        System.out.println("Changes: " + count);
        System.out.print("Updated array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");

        }
    }
}

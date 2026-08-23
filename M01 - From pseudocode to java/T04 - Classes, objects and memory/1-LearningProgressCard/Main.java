
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create one StudentProgress object
        StudentProgress s1 = new StudentProgress();

        //Read and store name, completed lessons and total lessons
        s1.name = scanner.nextLine();
        s1.completedLessons = scanner.nextInt();
        s1.totalLessons = scanner.nextInt();

        // Calculate and store the completion percentage
        s1.percentage = s1.completedLessons * 100 / s1.totalLessons;

        // Print the progress card
        System.out.println("Student: " + s1.name);
        System.out.println("Progress: " + s1.completedLessons + "/" + s1.totalLessons);
        System.out.println("Completion: " + s1.percentage + "%");
    }
}

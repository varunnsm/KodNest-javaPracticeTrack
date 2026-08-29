
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = scanner.nextInt();
        int currentLevel = scanner.nextInt();
        int operationCount = scanner.nextInt();

        WaterTank tank = new WaterTank(capacity, currentLevel);

        for (int operation = 1; operation <= operationCount; operation++) {
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    int fillAmount = scanner.nextInt();
                    int added = tank.fillWater(fillAmount);
                    System.out.println("Operation " + operation + " - Filled: " + added);
                    break;

                case 2:
                    int drainAmount = scanner.nextInt();
                    int removed = tank.drainWater(drainAmount);
                    System.out.println("Operation " + operation + " - Drained: " + removed);
                    break;

                case 3:
                    System.out.println("Operation " + operation + " - Tank Status");
                    tank.displayTank();
                    break;

                default:
                    System.out.println("Operation " + operation + " - Invalid Choice");
            }
        }
        System.out.println("Final Tank Status");
        tank.displayTank();

        scanner.close();

    }
}

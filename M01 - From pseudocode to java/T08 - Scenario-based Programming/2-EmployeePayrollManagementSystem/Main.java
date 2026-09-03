
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first employee details
        int employeeId1 = scanner.nextInt();
        scanner.nextLine();
        String employeeName1 = scanner.nextLine();
        double basicSalary1 = scanner.nextDouble();
        double fixedBonus = scanner.nextDouble();

        // Create and update the first Employee object
        Employee employee1 = new Employee();
        employee1.setEmployeeDetails(employeeId1, employeeName1, basicSalary1);
        employee1.addBonus(fixedBonus);

        // Read the second employee details
        int employeeId2 = scanner.nextInt();
        scanner.nextLine();
        String employeeName2 = scanner.nextLine();
        double basicSalary2 = scanner.nextDouble();
        double initialBonus = scanner.nextDouble();
        double bonusPercentage = scanner.nextDouble();
        double extraReward = scanner.nextDouble();

        // Create and update the second Employee object
        Employee employee2 = new Employee(employeeId2, employeeName2, basicSalary2, initialBonus);
        employee2.addBonus(bonusPercentage, extraReward);

        // Display both employees
        System.out.println("Employee 1");
        employee1.displayEmployee();

        System.out.println();

        System.out.println("Employee 2");
        employee2.displayEmployee();
    }
}

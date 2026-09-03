
class Employee {

    // Declare instance variables
    int employeeId;
    String employeeName;
    double basicSalary;
    double bonus;

    // Write the zero-parameter constructor
    Employee() {
        this.employeeId = 0;
        this.employeeName = "";
        this.basicSalary = 0.0;
        this.bonus = 0.0;
    }

    // Write the parameterized constructor
    Employee(int employeeId, String employeeName, double basicSalary, double bonus) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    // Write setEmployeeDetails()
    void setEmployeeDetails(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.bonus = 0.0;
    }

    // Write the overloaded addBonus() methods
    void addBonus(double bonusAmount) {
        this.bonus = this.bonus + bonusAmount;
    }

    void addBonus(double bonusPercentage, double extraReward) {
        double percentageBonus = this.basicSalary * bonusPercentage / 100;

        double additionalBonus = percentageBonus + extraReward;

        this.bonus = this.bonus + additionalBonus;
    }

    // Write calculateTotalSalary()
    double calculateTotalSalary() {
        double totalSalary = this.basicSalary + this.bonus;
        return totalSalary;
    }

    // Write displayEmployee()
    void displayEmployee() {
        System.out.println("Employee ID: " + this.employeeId);
        System.out.println("Employee Name: " + this.employeeName);
        System.out.println("Basic Salary: " + this.basicSalary);
        System.out.println("Bonus: " + this.bonus);
        System.out.println("Total Salary: " + this.calculateTotalSalary());
    }
}

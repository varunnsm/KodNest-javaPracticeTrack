// Calculate And Displaya Practice Report

public class calculateAndDisplayaPracticeReport {

    public static void main(String[] args) {
        int solvedProblems = 47;
        int practiceDays = 5;
        double exactPercentage = 86.75;

        // Write your code here.
        double reportValue = solvedProblems;
        double averagePerDay = (double) solvedProblems / practiceDays;
        boolean dailyTargetReached = true;
        System.out.println("Report Value: " + reportValue);
        System.out.println("Whole Percentage: " + (int) exactPercentage);
        System.out.println("Average Per Day: " + averagePerDay);
        System.out.println("Daily Target Reached: " + dailyTargetReached);
    }
}

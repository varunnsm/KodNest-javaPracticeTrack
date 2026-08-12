// Placement Readiness Decision

public class placementReadinessDecision {

    public static void main(String[] args) {
        int marks = 72;
        int attendance = 80;
        boolean activeBacklog = false;
        boolean projectCompleted = true;
        int mockInterviewScore = 65;

        // Write the placement-readiness decision
        if (marks < 60 || attendance < 75 || activeBacklog) {
            System.out.println("Improve Academic Eligibility");
        } else if (!projectCompleted) {
            System.out.println("Completed the Project");
        } else if (mockInterviewScore < 70) {
            System.out.println("Improve Interview Skills");
        } else {
            System.out.println("Placement Ready");
        }
    }
}

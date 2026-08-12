// Weekly Practice Plan Builder

public class weeklyPracticePlanBuilder {

    public static void main(String[] args) {
        int practiceDays = 5;
        int sessionsPerDay = 2;
        int revisionDay = 3;
        int finalDaySessionLimit = 1;
        int targetSessions = 7;
        int completedSessions = 0;

        // Build the weekly practice report
        for (int day = 1; day <= practiceDays; day++) {
            while (day == revisionDay) {
                day++;
                continue;
            }

            for (int session = 1; session <= sessionsPerDay; session++) {
                if (day == 5 && session == 2) {
                    break;
                }
                System.out.println("Day " + day + " - Session " + session);
                completedSessions++;
            }
        }

        System.out.println("Completed Sessions: " + completedSessions);
        if (targetSessions == completedSessions) {
            System.out.println("Target Achieved");
        }

    }
}


class SalesAnalyzer {

    // Declare the dailySales array
    double[] dailySales;

    // Write the constructor
    SalesAnalyzer(double[] dailySales) {
        this.dailySales = dailySales;
    }

    // Write calculateTotal()
    double calculateTotal() {
        double total = 0.0;

        for (int i = 0; i < dailySales.length; i++) {
            total = total + dailySales[i];
        }
        return total;
    }

    // Write calculateAverage()
    double calculateAverage() {
        double total = calculateTotal();
        double average = total / dailySales.length;
        return average;
    }

    // Write findHighestSalesDay()
    int findHighestSalesDay() {
        int highestIndex = 0;

        for (int i = 1; i < dailySales.length; i++) {
            if (dailySales[i] > dailySales[highestIndex]) {
                highestIndex = i;
            }
        }
        return highestIndex + 1;
    }

    // Write findLowestSalesDay()
    int findLowestSalesDay() {
        int lowestIndex = 0;

        for (int i = 1; i < dailySales.length; i++) {
            if (dailySales[i] < dailySales[lowestIndex]) {
                lowestIndex = i;
            }
        }
        return lowestIndex + 1;
    }

    // Write countAboveAverageDays()
    int countAboveAverageDays() {
        double average = calculateAverage();
        int count = 0;

        for (int i = 0; i < dailySales.length; i++) {
            if (dailySales[i] > average) {
                count++;
            }
        }
        return count;
    }

    // Write displayReport()
    void displayReport() {
        int highestDay = findHighestSalesDay();
        int lowestDay = findLowestSalesDay();

        System.out.println("Number of Days: " + dailySales.length);
        System.out.println("Total Sales: " + calculateTotal());
        System.out.println("Average Sales: " + calculateAverage());
        System.out.println("Highest Sales Day: " + highestDay);
        System.out.println("Highest Sales: " + dailySales[highestDay - 1]);
        System.out.println("Lowest Sales Day: " + lowestDay);
        System.out.println("Lowest Sales: " + dailySales[lowestDay - 1]);
        System.out.println("Days Above Average: " + countAboveAverageDays());

    }
}

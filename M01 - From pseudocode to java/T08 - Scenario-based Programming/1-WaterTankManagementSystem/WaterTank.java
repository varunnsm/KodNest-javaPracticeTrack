
class WaterTank {

    int capacity;
    int currentLevel;

    WaterTank(int capacity, int currentLevel) {
        this.capacity = capacity;
        this.currentLevel = currentLevel;
    }

    int fillWater(int amount) {
        if (amount <= 0) {
            return 0;
        }

        int availableSpace = capacity - currentLevel;

        int addedAmount;

        if (amount > availableSpace) {
            addedAmount = availableSpace;
        } else {
            addedAmount = amount;
        }

        currentLevel = currentLevel + addedAmount;

        return addedAmount;
    }

    int drainWater(int amount) {
        if (amount <= 0) {
            return 0;
        }

        int removedAmount;

        if (amount > currentLevel) {
            removedAmount = currentLevel;
        } else {
            removedAmount = amount;
        }

        currentLevel = currentLevel - removedAmount;
        return removedAmount;
    }

    String getStatus() {
        if (currentLevel == 0) {
            return "Empty";
        }

        if (currentLevel == capacity) {
            return "Full";
        }

        double fillPercentage = currentLevel * 100.0 / capacity;

        if (fillPercentage <= 25) {
            return "Low";
        } else if (fillPercentage <= 75) {
            return "Medium";
        } else {
            return "High";
        }
    }

    void displayTank() {
        int availableSpace = capacity - currentLevel;

        System.out.println("Capacity: " + capacity);

        System.out.println("Current Level: " + currentLevel);

        System.out.println("Available Space: " + availableSpace);

        System.out.println("Status: " + getStatus());
    }
}


class TheatreBooking {

    // Declare the seats array and bookedCount
    int[] seats;
    int bookedCount;

    // Write the constructor
    TheatreBooking(int totalSeats) {
        this.seats = new int[totalSeats];
        this.bookedCount = 0;
    }

    // Write bookSeat()
    String bookSeat(int seatNumber) {
        if (seatNumber < 1 || seatNumber > seats.length) {
            return "Invalid Seat";
        }

        int seatIndex = seatNumber - 1;

        if (seats[seatIndex] == 1) {
            return "Already Booked";
        }

        seats[seatIndex] = 1;
        bookedCount++;

        return "Booked";
    }

    // Write getAvailableCount()
    int getAvailableCount() {
        int availableCount = seats.length - bookedCount;
        return availableCount;
    }

    // Write displaySeatStatus()
    void displaySeatStatus() {
        System.out.println("Seat Status");

        for (int i = 0; i < seats.length; i++) {
            String status;
            if (seats[i] == 1) {
                status = "Booked";
            } else {
                status = "Available";
            }
            System.out.println("Seat " + (i + 1) + ": " + status);
        }
    }
}

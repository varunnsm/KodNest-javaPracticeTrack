
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read total seats and number of booking requests
        int totalSeats = scanner.nextInt();
        int requestCount = scanner.nextInt();

        // Create the TheatreBooking object
        TheatreBooking theatre = new TheatreBooking(totalSeats);

        // Process every booking request
        for (int i = 1; i <= requestCount; i++) {
            int seatNumber = scanner.nextInt();

            String result = theatre.bookSeat(seatNumber);

            System.out.println("Request " + i + " - Seat " + seatNumber + ": " + result);
        }

        // Display seat status and the summary
        theatre.displaySeatStatus();
        System.out.println("Booked Seats: " + theatre.bookedCount);
        System.out.println("Available Seats: " + theatre.getAvailableCount());

        scanner.close();
    }
}

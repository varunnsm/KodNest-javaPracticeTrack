
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        if (choice == 1) {
            CabBooking obj = new CabBooking(name);
            obj.display();
        } else if (choice == 2) {
            String type = sc.nextLine();
            int distance = sc.nextInt();
            CabBooking obj1 = new CabBooking(name, type, distance);
            obj1.display();
        }
    }
}

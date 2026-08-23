
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        String name = sc.next();
        String dept = sc.next();

        Employee obj = new Employee(id, name, dept);

        obj.display();
    }
}

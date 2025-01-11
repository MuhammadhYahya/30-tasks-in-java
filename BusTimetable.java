import java.util.Scanner;

public class BusTimetable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] busNumbers = new String[5];
        String[] departureTimes = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the bus number for bus " + (i + 1) + ": ");
            busNumbers[i] = scan.next();

            System.out.print("Enter the departure time for bus " + busNumbers[i]);
            departureTimes[i] = scan.next();
        }
 //time  table
        System.out.println("\nSri Lankan Bus Timetable:");
        System.out.println("Bus Number\tDeparture Time");
        for (int i = 0; i < 5; i++) {
            System.out.println(busNumbers[i] + "\t\t" + departureTimes[i]);
        }

        // Step 4: Allow the user to search for a bus by its number
        System.out.print("\nEnter the bus number to search: ");
        String searchBusNumber =  scan.next();
        boolean found = false;

        for (int i = 0; i < 5; i++) {
            if (busNumbers[i].equalsIgnoreCase(searchBusNumber)) {
                System.out.println("Bus Number: " + busNumbers[i] + ", Departure Time: " + departureTimes[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Bus number " + searchBusNumber + " not found.");
        }
    }
}

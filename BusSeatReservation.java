import java.util.Scanner;

class BusSeatReservation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Step 1: Create an array for 50 seats
        int[] seats = new int[50];

        int bookedSeats = 0; 

        // Step 2: Loop until all seats are booked
        while (bookedSeats < 50) {
            System.out.println("\nAvailable Seats:");
            displayAvailableSeats(seats);

            System.out.print("Enter the seat number to book (1-50): ");
            int seatNumber = scan.nextInt();
            
            // Validate the seat number
            if (seatNumber < 1 || seatNumber > 50) {
                System.out.println("Invalid seat number. Please enter a number between 1 and 50.");
                continue;
            }

            // Check if the seat is already booked
            if (seats[seatNumber - 1] == 1) {
                System.out.println("Seat " + seatNumber + " is already booked. Please choose another seat.");
            } else {
                // Book the seat
                seats[seatNumber - 1] = 1;
                bookedSeats++;
                System.out.println("Seat " + seatNumber + " has been successfully booked.");
            }
             System.out.println("\nAll seats are now booked. Thank you!");
        }

    }

    // Step 4: Display available seats
    public static void displayAvailableSeats(int[] seats) {
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                System.out.print((i + 1) + " "); 
            }
        }
    }
}

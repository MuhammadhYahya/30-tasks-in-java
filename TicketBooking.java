import java.util.Scanner;

class TicketBooking{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		
		//1. Create an array with train destinations
		String[] destinations = {"Colombo", "Kandy", "Jaffna"};
		//2. Assign a fixed number of seats for each destination.
		int[] seatsAvailable = {10, 8, 5};
		
		boolean bookingActive = true;
		
		while(bookingActive){
			System.out.println("Available seats");
			for(int i = 0; i < destinations.length; i++){
				System.out.println(destinations[i]  + ":" + seatsAvailable[i]);
				}
				
			System.out.println("\nEnter the destination you'd like to book a ticket for");
			String userDestinations=scan.next();
			
			boolean validDestination=false;
			for (int i = 0; i < destinations.length; i++) {
				if(destinations[i].equalsIgnoreCase(userDestinations)){
					    validDestination = true;
                    if (seatsAvailable[i] > 0) {
                        seatsAvailable[i]--; // Step 4: Deduct the seat count
                        System.out.println("Ticket booked successfully for " + destinations[i] + "!");
                        System.out.println("available seats for " +destinations[i] + "is" + seatsAvailable[i]);
                    } else {
                        System.out.println("Sorry, no seats available for " + destinations[i] + ".");
                    }
					break;
					}
				}
				 if (!validDestination) {
                System.out.println("Invalid destination. Please try again.");
            }
			}
		}
	}

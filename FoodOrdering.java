import java.util.Scanner;

public class FoodOrdering {
    public static void main(String[] args) {
        // Step 1: Create an array of Sri Lankan dishes with prices
        String[] dishes = {"Kottu", "Hoppers", "String Hoppers"};
        double[] prices = {450.00, 100.00, 150.00};

        Scanner scan = new Scanner(System.in);
        boolean ordering = true;
        double totalBill = 0.0;

        while (ordering) {
            // Display menu
            for (int i = 0; i < dishes.length; i++) {
                System.out.println((i+1)+":"+  dishes [i] + ":"+prices[i]);
            }

            // Step 2: Allow user to select dishes by their number
            System.out.println("Enter the number of the dish you like to order (or 0 to finish): ");
            int choice = scan.nextInt();

            if (choice == 0) {
                ordering = false;
                break;
            } else if (choice > 0 && choice <= dishes.length) {
                totalBill += prices[choice - 1];
                System.out.println("Added " + dishes[choice - 1] + " to your order.");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        // Step 3: Calculate total bill with 10% service charge
        double serviceCharge = totalBill * 0.10;
        double finalBill = totalBill + serviceCharge;

        // Step 5: Display the final bill
        System.out.println("Order Summary:");
        System.out.println("Total: Rs. "+ totalBill);
        System.out.println("Service Charge (10%): Rs." + serviceCharge);
        System.out.println("Final Bill: Rs. "+ finalBill);

    }
}

import java.util.Scanner;

public class OnlineShoppingCart {
    // Array of products and their prices
    static String[] products = {"Rice Cooker", "Blender", "Toaster"};
    static double[] prices = {3500.0, 1500.0, 1200.0};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] quantities = new int[products.length]; //to store quantities for each product

        while (true) {
            // Display available products
            System.out.println("\nAvailable products:");
            for (int i = 0; i < products.length; i++) {
                System.out.println((i + 1) + ". " + products[i] + " - Rs. " + prices[i]);
            }

            // Ask user for product selection
            System.out.print("Enter the product number to add to your cart (or 0 to finish): ");
            int productNumber = scanner.nextInt();

            if (productNumber == 0) {
                break;
            }

            if (productNumber < 1 || productNumber > products.length) {
                System.out.println("Invalid product number. Please try again.");
                continue;
            }

            // Ask for quantity
            System.out.print("Enter quantity for " + products[productNumber - 1] + ": ");
            int quantity = scanner.nextInt();

            if (quantity <= 0) {
                System.out.println("Quantity must be greater than 0. Please try again.");
                continue;
            }

            // Add quantity to the cart
            quantities[productNumber - 1] += quantity;
            System.out.println(quantity + " " + products[productNumber - 1] + " added to your cart.");
        }

        // Display final bill
        displayBill(quantities);
    }

    public static void displayBill(int[] quantities) {
        System.out.println("\n--- Final Bill ---");
        double totalCost = 0.0;

        for (int i = 0; i < products.length; i++) {
            if (quantities[i] > 0) {
                double cost = quantities[i] * prices[i];
                System.out.println(products[i] + " x " + quantities[i] + " = Rs. " + cost);
                totalCost += cost;
            }
        }

        System.out.println("Total (before discount): Rs. " + totalCost);

        // Apply discount if applicable
        if (totalCost > 5000) {
            double discount = totalCost * 0.05;
            totalCost -= discount;
            System.out.println("Discount applied: Rs. " + discount);
        }

        System.out.println("Final Total: Rs. " + totalCost);
        System.out.println("Thank you for shopping with us!");
    }
}

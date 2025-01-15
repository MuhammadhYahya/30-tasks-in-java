import java.util.Scanner;

public class FloodReliefAllocation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Step 1: Initialize item names and stock
        String[] itemNames = {"Rice", "Water Bottles", "Medicine"};
        int[] stock = {100, 200, 50};

        displayStock(itemNames, stock);

        boolean isStockAvailable = true;

        // Loop to allocate stock
        while (isStockAvailable) {
            System.out.println("\nEnter the quantities needed by the village:");

            // Process each item
            for (int i = 0; i < itemNames.length; i++) {
                System.out.print("Enter the quantity of " + itemNames[i] + " (Available: " + stock[i] + "): ");
                int villageNeed = scan.nextInt();

                if (villageNeed > stock[i]) {
                    System.out.println("Sorry, not enough " + itemNames[i] + " in stock.");
                    isStockAvailable = false; 
                    continue;
                } else {
                    stock[i] -= villageNeed; 
                }
            }

            displayStock(itemNames, stock);
            
            if (isOutOfStock(stock)) {
                System.out.println("\nAllocation stopped: One or more items are out of stock.");
                isStockAvailable = false;
            }
        }

        scan.close();
    }

    public static void displayStock(String[] items, int[] stock) {
        System.out.println("\nCurrent Stock:");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + ": " + stock[i]);
        }
    }

    public static boolean isOutOfStock(int[] stock) {
        for (int s : stock) {
            if (s <= 0) {
                return true; 
            }
        }
        return false;
    }
}

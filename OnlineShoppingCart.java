import java.util.Scanner;

public class OnlineShoppingCart{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] products={"Rice Cooker", "Blender", "Toaster"};
        double[] prices={5000,12000,8400};
        
        for(int i=0; i<products.length; i++){
			System.out.println("\n"+(i+1)+". " + products[i] +"\t"+ prices[i] );
			}
        
        System.out.println("Select the product by number :");
        int productNumber = scan.nextInt();
        
        System.out.print("Enter quantity for " + products[productNumber - 1] + ": ");
        int quantity = scan.nextInt();
        
   
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
    }

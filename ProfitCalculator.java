import java.util.Scanner;

class ProfitCalculator{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the number of mangoes bought: ");
        int numberOfMangoes = scan.nextInt();

        System.out.print("Enter the buying price per mango: ");
        double buyingPrice = scan.nextDouble();

        System.out.print("Enter the selling price per mango: ");
        double sellingPrice = scan.nextDouble();

        // Calculate profit or loss using method
        double profitOrLoss = calculateProfitOrLoss(numberOfMangoes, buyingPrice, sellingPrice);

        if (profitOrLoss > 0) {
            System.out.println("You get a profit of Rs. " + profitOrLoss);
        } else if (profitOrLoss < 0) {
            System.out.println("You loss of Rs. " + (-profitOrLoss));
        } else {
            System.out.println("No profit, no loss.");
        }
    }

    public static double calculateProfitOrLoss(int qty, double buyingPrice, double sellingPrice) {
        double totalBuyingPrice = qty * buyingPrice;
        double totalSellingPrice = qty * sellingPrice;
        return totalSellingPrice - totalBuyingPrice;
    }
}

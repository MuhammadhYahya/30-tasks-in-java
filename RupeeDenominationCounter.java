import java.util.Scanner;

class RupeeDenominationCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the amount in RS: ");
        int userAmount = scan.nextInt();
      
        int[] denominations = {5000, 1000, 500, 100};
        
        calculateDenominations(userAmount, denominations);
    }

    public static void calculateDenominations(int amnt, int[] denominations) {
        for (int i = 0; i < denominations.length; i++) {
            if (amnt >= denominations[i]) { 
                int count = amnt / denominations[i];
                amnt %= denominations[i];
                System.out.println("Rs. " + denominations[i] + " notes: " + count);
            }
        }
        
        if (amnt > 0) {
            System.out.println("Remaining amount that cannot be converted: Rs. " + amnt);
        }
    }
}

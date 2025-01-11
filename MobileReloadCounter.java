import java.util.Scanner;

public class MobileReloadCounter{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number of reload amounts to record: ");
        int n = scan.nextInt();
        
        double[] reloadAmounts = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter reload amount " + (i + 1) + ": ");
            reloadAmounts[i] = scan.nextDouble();
        }
       double totalReloads = calcTotal(reloadAmounts);
        double largestReload = LargestReload(reloadAmounts);

        System.out.println("\nTotal Reload Amount: " + totalReloads);
        System.out.println("Largest Reload Amount: " + largestReload);  
  }
  public static double calcTotal(double[] reloadAmount){
	  double total=0;
	  for (double amount : reloadAmount) {
       total += amount;
        }
        return total;
	  }
	  
	public static double LargestReload(double[] amounts) {
        double largest = amounts[0];
        for (double amount : amounts) {
            if (amount > largest) {
                largest = amount;
            }
        }
        return largest;
    }
 }

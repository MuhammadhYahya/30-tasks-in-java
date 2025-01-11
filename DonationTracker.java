import java.util.Scanner;

class DonationTracker{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the donners count : ");
        int donorQty=scan.nextInt();
        
        String[] donerName=new String[donorQty];
        double[] donationAmounts = new double[donorQty];
        
        for(int i=0; i<donorQty; i++){
			System.out.print("Enter the name of donor "+ (i+1));
			donerName[i]=scan.next();
			
			System.out.print("Enter the donation of "+ donerName[i]);
			donationAmounts[i]=scan.nextDouble();
			}
        double total=TotalDonation(donationAmounts);
        System.out.println("total donation is = "+ total);
        
        int higherDonor=findHighestDonor(donationAmounts);
        System.out.println("highest donor is "+ donerName[higherDonor]);
        
        System.out.println("\nDonor Details:");
        for (int i = 0; i < donorQty; i++) {
            System.out.println(donerName[i] + " donated " + donationAmounts[i]);
        }
        }
        //totoal donatioon
        public static double TotalDonation(double[] donationAmounts){
			double total=0;
			for(int i=0; i<donationAmounts.length; i++){
				total+=donationAmounts[i];
				}
				return total;
			}
        //find highets doner
         public static int findHighestDonor(double[] donationAmounts){
			 int highestIndex=0;
			 for(int i=1; i<donationAmounts.length; i++){
				 if(donationAmounts[i]>donationAmounts[highestIndex]){
					 highestIndex=i;
					 }
				 }
				 return highestIndex;
			 }
  }

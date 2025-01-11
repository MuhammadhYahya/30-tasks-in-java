import java.util.Scanner;

class TukTukFare{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the distance traveled in kilometers: ");
        double distance = scan.nextDouble();

        System.out.print("Enter the waiting time in minutes: ");
        int waitingTime = scan.nextInt();

        double totalFare = calculateFare(distance, waitingTime);

        System.out.println("The total fare for your ride is: Rs."+ totalFare);
    }
       // Method to calculate the fare
    public static double calculateFare(double distance, int waitingTime) {
        double farePerKilometer = 50.0; 
        double farePerMinute = 2.0;
        return (distance * farePerKilometer) + (waitingTime * farePerMinute);
    }
}

import java.util.Scanner;

class CmbTempeAnalysis{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temperatures = new double[7];

        System.out.println("Enter the temperatures for the week (in Celsius):");
        for (int i = 0; i < temperatures.length; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            temperatures[i] = scan.nextDouble();
        }

        double average = calculateAverage(temperatures);
        double highest = findHighestTemperature(temperatures);
        double lowest = findLowestTemperature(temperatures);

        System.out.println("\nTemperature Analysis Results:");
        System.out.println("Average Temperature: "+ average);
        System.out.println("Highest Temperature: "+ highest);
        System.out.println("Lowest Temperature: "+ lowest);

    }
    //calc avg temp
    public static double calculateAverage(double[] temperatures) {
        double sum = 0;
		for (int i = 0; i < temperatures.length; i++) {
		sum += temperatures[i];
		}
        return sum / temperatures.length;
    }

    //find highest temp
    public static double findHighestTemperature(double[] temperatures) {
        double highest = temperatures[0];
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] > highest) {
                highest = temperatures[i] ;
            }
        }
        return highest;
    }
    
    //find lowest temp
    public static double findLowestTemperature(double[] temperatures) {
        double lowest = temperatures[0];
          for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] < lowest) {
                lowest = temperatures[i] ;
            }
        }
        return lowest;
    }
}

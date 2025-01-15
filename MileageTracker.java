import java.util.Scanner;
class MileageTracker{
	public static void main(String[] args){
		String[] vehicleTypes={"Car", "Van", "Lorry","Bike"};
		int[] mileages={25,15,8,50};
		double[] distances=new double[vehicleTypes.length];
		Scanner scan = new Scanner(System.in);
        
        for(int i=0; i<vehicleTypes.length; i++){
			System.out.print("Enter the  distance traveled by " +vehicleTypes[i]+" ");
			distances[i]=scan.nextDouble();
		}
			for (int i = 0; i < vehicleTypes.length; i++) {
            double fuelConsumed = calculateFuelConsumed(distances[i], mileages[i]);
            double fuelCost = calculateFuelCost(fuelConsumed);
            System.out.println( vehicleTypes[i]);
            System.out.println("Distance Traveled " + distances[i]);
            System.out.println("Fuel Consumed: "+ fuelConsumed);
            System.out.println("Fuel Cost: Rs. " +fuelCost);
        }
			
		}
		 public static double calculateFuelConsumed(double distance, double mileage) {
			return distance / mileage;
		}

		public static double calculateFuelCost(double fuelConsumed) {
		double CostPerLitter = 450.0;
        return fuelConsumed * CostPerLitter;
		}
		
	}

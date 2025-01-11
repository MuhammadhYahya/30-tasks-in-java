import java.util.Scanner;

public class TeaPlantationSalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] workerNames = new String[5];
        int[] teaLeavesPicked = new int[5];

        // Input data for 5 workers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the name of worker " + (i + 1) + ": ");
            workerNames[i] = scan.next();

            System.out.print("Enter the kilograms of tea leaves picked by " + workerNames[i] + ": ");
            teaLeavesPicked[i] = scan.nextInt();
        }

        // Display each worker's name and their salary
        System.out.println("\nWorker Salary Details:");
        for (int i = 0; i < 5; i++) {
            int salary = calculateSalary(teaLeavesPicked[i]);
            System.out.println(workerNames[i] + " earned Rs. " + salary);
        }
    }

    public static int calculateSalary(int kilograms) {
        return kilograms * 50;
    }
}


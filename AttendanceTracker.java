import java.util.Scanner;

public class AttendanceTracker {
 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the  amount of students : ");
        int stdAmount=scan.nextInt();
        
        String[] stdName = new String[stdAmount];
        int[] stdAttendance = new int[stdAmount];
        int totalDays = 0;
        
        //Input student names
        for (int i = 0; i < stdAmount; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            stdName[i] = scan.next();
        }
       
       char choice;
        do {
            totalDays++;
            System.out.println("\nMark attendance for day " + totalDays + ":");

            // Mark attendance for each student
            for (int i = 0; i < stdAmount; i++) {
                System.out.print("Is " + stdName[i] + " present? (1 for Yes, 0 for No): ");
                int isPresent = scan.nextInt();
                if (isPresent == 1) {
                    stdAttendance[i]++;
                }
            }

            // Ask if more days should be tracked
            System.out.print("\nDo you want to add attendance for another day? (y/n): ");
            choice = scan.next().toLowerCase().charAt(0);

        } while (choice == 'y');
        
        displayAttendancePercentage(stdName, stdAttendance, totalDays);
        identifyLowAttendanceStudents(stdName, stdAttendance, totalDays);

        scan.close();
        }
  //methods...
         public static void displayAttendancePercentage(String[] name,int[] attendace,int days){
			System.out.println("\nAttendance Percentage for Each Student:");
           for (int i = 0; i < name.length; i++) {
				double percentage = ((double) attendace[i] / days) * 100;
				System.out.println("percentage of "+name[i] + " is " +percentage );
			}
		 }
		 
		 public static void identifyLowAttendanceStudents(String[] name,int[] attendace,int days){
			 System.out.println("\nStudents with less than 75% attendance:");
			 boolean found=false;
			 for (int i = 0; i < name.length; i++) {
				double percentage = ((double) attendace[i] / days) * 100;
				if(percentage<75.0){
					System.out.println("percentage of "+name[i] + " is " +percentage );
					found=true;
					}
			}
			if (!found) {
				System.out.println("No students have less than 75% attendance.");
			}
			 
		}
}

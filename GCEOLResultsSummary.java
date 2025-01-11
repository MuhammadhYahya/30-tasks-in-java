import java.util.Scanner;

public class GCEOLResultsSummary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] subjectNames = new String[6];
        int[] marks = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Enter the name of subject " + (i + 1) + ": ");
            subjectNames[i] = scan.next();

            System.out.print("Enter the marks for " + subjectNames[i] + ": ");
            marks[i] = scan.nextInt();
        }

        int totalMarks = calculateTotalMarks(marks);
        double averageMarks = calculateAverageMarks(totalMarks, marks.length);

        boolean isPassed = determinePassStatus(marks);

        System.out.println("\nResults Summary:");
        for (int i = 0; i < 6; i++) {
            System.out.println(subjectNames[i] + ": " + marks[i] + " marks");
        }
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Result: " + (isPassed ? "Pass" : "Fail"));
    }
    
    public static int calculateTotalMarks(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public static double calculateAverageMarks(int total, int numberOfSubjects) {
        return (double) total / numberOfSubjects;
    }

    public static boolean determinePassStatus(int[] marks) {
        for (int mark : marks) {
            if (mark < 40) {
                return false;
            }
        }
        return true;
    }
}

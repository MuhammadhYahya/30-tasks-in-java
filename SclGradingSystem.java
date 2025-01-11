import java.util.Scanner;

class SclGradingSystem{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the students count");
		int stdCount=scan.nextInt();
		String[] stdNames=new String[stdCount];
		
		int[][] marks = new int[stdCount][5];
		
		for(int i=0; i<stdNames.length; i++) {
			System.out.print("enter the name of student " + (i+1) + ": ");
			stdNames[i]=scan.next();
			System.out.println("enter the marks of " + stdNames[i]);
			for(int x=0; x<5; x++){
				System.out.print("subject" + (x+1) +": ");
				marks[i][x]=scan.nextInt();
				}
			}
			
		//outputs
		System.out.println("\nStudent Results:");
		for(int i=0; i<stdCount; i++){
			int totalMarks= calculateTotal(marks[i]);
			 System.out.println("Student name is "+stdNames[i]);
			 System.out.println("Total Marks: " + totalMarks);
			 System.out.println("Average marks is: " + calculateAverage(totalMarks));
			 double average=calculateAverage(totalMarks);
			 char grade=determineGrade(average);
			 System.out.println("Grade is "+  grade);
			}
		
			
		}
		//////////////////////methods///////////////////////////
		//calc tot
		public static int calculateTotal(int[] marks){
			int total=0;
			for(int i=0; i<marks.length; i++){
				total+=marks[i];
				}
				return total;
			}
		//avg
		public static double calculateAverage(int total){
			return total/5.0;
			}
		//grading based on avg
		public static char determineGrade(double avg){
				if (avg >= 75) {
					return 'A';
				} else if (avg >= 65) {
					return 'B';
				} else if (avg >= 55) {
					return 'C';
				} else if(avg >=40){
					return 'S';
				}
				else {
					return 'F';
				}
			}
	}

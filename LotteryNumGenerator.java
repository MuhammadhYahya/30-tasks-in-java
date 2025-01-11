import java.util.Random;
import java.util.Scanner;

class LotteryNumGenerator{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(50) + 1;

        System.out.println("\nguess the number between 1 and 50 or 0 to quit.");

        while (true) {
            System.out.print("Enter your guess: ");

            int userGuess = scan.nextInt();

            if (userGuess == 0) {
                System.out.println("The winning number was: " + randomNumber + " try next time!");
                break;
            }

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("Too Low! Try again.");
            } else {
                System.out.println("Too High! Try again.");
            }
        }
    }
}

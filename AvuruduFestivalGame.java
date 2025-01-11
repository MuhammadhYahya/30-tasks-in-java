import java.util.Random;
import java.util.Scanner;

class AvuruduFestivalGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;
        int attempts = 0;
        boolean guessedCorrectly = false;

        System.out.println("Welcome to the Avurudu Festival Game!");
        System.out.println("I have chosen a number between 1 and 100. Try to guess it!");
        System.out.println("To exit the game, enter 0.");

        while (true) {
            System.out.print("Enter your guess (1-100) or 0 to exite: ");
            int guess = scan.nextInt();

            if (guess == 0) {
                System.out.println("Thanks for playing! The correct number is: " + randomNumber);
                break;
            }
            
            attempts++;
            
            if (guess == randomNumber) {
                System.out.println("You guessed the correct number: " + randomNumber);
                guessedCorrectly = true;
                break;
            } else if (guess < randomNumber) {
                System.out.println("Too Low! Try again.");
            } else {
                System.out.println("Too High! Try again.");
            }
        }

        if (guessedCorrectly) {
            System.out.println("You guessed the number in " + attempts + " attempts.");
        } else {
            System.out.println("You made " + attempts + " attempts. Better luck next time!");
        }
        
    }
}

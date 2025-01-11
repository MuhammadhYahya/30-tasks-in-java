import java.util.Random;
import java.util.Scanner;

class ZodiacGame{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        String[] zodiacAnimals = {"Lion", "Elephant", "Rabbit", "Horse", "Ox", "Tiger", "Goat", "Rooster", "Snake", "Monkey", "Dog", "Pig"};
        boolean playAgain;

        System.out.println("Welcome to the Sinhala and Tamil New Year Zodiac Game!");

        do {
            // Pick a random zodiac animal
            String randomZodiac = zodiacAnimals[random.nextInt(zodiacAnimals.length)];
            boolean guessedCorrectly = false;

            System.out.println("Guess the zodiac animal. (Type 'quit' to exit the game.)");

            while (!guessedCorrectly) {
                System.out.print("Your guess: ");
                String userGuess = scan.nextLine();

                if (userGuess.equalsIgnoreCase("quit")) {
                    System.out.println("You chose to exit the game. The zodiac was: " + randomZodiac);
                    break;
                }

                // Compare the user's guess with the random zodiac animal
                if (userGuess.equalsIgnoreCase(randomZodiac)) {
                    System.out.println("Congratulations! You guessed it right. The zodiac animal is: " + randomZodiac);
                    guessedCorrectly = true;
                } else {
                    System.out.println("Wrong guess! Try again.");
                }
            }

            // Ask if the user wants to play another round
            System.out.print("Do you want to play another round? (yes/no): ");
            playAgain = scan.next().equalsIgnoreCase("yes");

        } while (playAgain);

        System.out.println("Thank you for playing the Game!");
    }
}

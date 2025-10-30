import java.util.Scanner;

public class HiLoGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pick a random number between 1 and 20
        int number = (int)(Math.random()*20)+1;

        // Start the game
        System.out.print("Hello, dear user! I’m thinking of a number between 1 and 20. What’s your guess? ");
        int guess = input.nextInt();

        // First guess check
        if (guess == number) {
            System.out.println("You read my mind! The number was " + number + "!");
        } else {
            if (guess < number) {
                System.out.print("That’s too low, please guess again: ");
            } else {
                System.out.print("That’s too high, please guess again: ");
            }

            int secondGuess = input.nextInt();

            if (secondGuess == number) {
                System.out.println("You got it! The number was " + number + ".");
            } else {
                System.out.println("Too bad, the number was " + number + ". Better luck next time!");
            }
        }

        input.close();
    }
}

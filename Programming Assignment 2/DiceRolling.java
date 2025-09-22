import java.util.Random;

public class DiceRolling {
    public static void main(String[] args) {
        Random rand = new Random();

        for (int i = 1; i <= 20; i++) {
            int die1 = rand.nextInt(6) + 1; 
            int die2 = rand.nextInt(6) + 1; 
            System.out.println("Roll " + i + ": You rolled a " + die1 + " and a " + die2);
        }
    }
}

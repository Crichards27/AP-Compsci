import java.util.Scanner;

public class HiLo_V2{
 public static void main(String[] args){
    int num = (int)(Math.random()*100)+1;
    Scanner input = new Scanner(System.in);
    int count = 1;
      
    System.out.println("What is your guess? ");
    int userGuess = input.nextInt();
    
    while (userGuess != num){
        if ( userGuess < num){
            System.out.println("Too low, guess again ");
            userGuess = input.nextInt();
        }
        else{
            System.out.println("Too high, guess again ");
            userGuess = input.nextInt();
        }
        count++;
    }
    System.out.println("Congrats you got it, the number was " + num + " And it took you " +count + " tries!");
 }
}
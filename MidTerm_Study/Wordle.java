import java.util.Scanner;

public class Wordle{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        String word = "apple";
        while(true){
            
        System.out.println("Enter your guess: ");
        String guess = scanner.nextLine();
        
        if ( guess.length() != word.length()){
            System.out.println("Guess must be " + word.length() + " letters.");
            continue;
        }
        
        if(guess.equals(word)){
            System.out.println("You win");
            break;
        }
        
        String result = compareWords(word, guess);
        System.out.println(result);
        }
    }
    
    public static String compareWords(String word, String guess){
        StringBuilder output = new StringBuilder();
        
        for(int i = 0; i < word.length(); i++){
            char g = guess.charAt(i);
            
            if(g == word.charAt(i)){
                output.append(g);
            }
            else if(word.indexOf(g) != -1){
                output.append('*');
            }
            else{
                output.append('x');
            }
        }
        return output.toString();
    }
}
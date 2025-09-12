import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("How many minutes: ");  
        int userInput = scanner.nextInt();        

        int hours = userInput / 60;
        int minutes = userInput % 60;

        System.out.println(userInput + " minutes is " + hours + " hours and " + minutes + " minutes.");
        
        scanner.close(); 
    }
}

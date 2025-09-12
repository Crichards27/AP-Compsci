import java.util.Scanner;

public class TotalPennies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of quarters: ");
        int quarters = scanner.nextInt();
        System.out.print("Enter the number of dimes: ");
        int dimes = scanner.nextInt();
        System.out.print("Enter the number of nickels: ");
        int nickels = scanner.nextInt();
        System.out.print("Enter the number of pennies: ");
        int pennies = scanner.nextInt();

        int totalPennies = (quarters * 25) + (dimes * 10) + (nickels * 5) + pennies;

        System.out.println(quarters + " quarters, " + dimes + " dimes, " +
                           nickels + " nickels, and " + pennies +
                           " pennies is equivalent to " + totalPennies + " pennies.");

        scanner.close();
    }
}

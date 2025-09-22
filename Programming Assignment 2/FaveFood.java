import java.util.Scanner;

public class FaveFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter a positive integer: ");
        int targetNumber = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter your favorite food: ");
        String faveFood = scanner.nextLine();

        for (int i = 0; i < targetNumber; i++) {
            System.out.println(name + "’s favorite food is " + faveFood + ".");
        }

        scanner.close();
    }
}

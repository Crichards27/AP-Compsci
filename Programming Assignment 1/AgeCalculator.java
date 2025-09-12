import java.util.Scanner;
import java.time.Year;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the celebrity's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the celebrity's age: ");
        int age = scanner.nextInt();
        int currentYear = Year.now().getValue();
        int birthYear = currentYear - age;
        System.out.println("Hello, " + name + "It appears that you were born in " + birthYear + ".");

        scanner.close();
    }
}

import java.util.Scanner;

public class CashRegister {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0.0;
        String choice;

        do {
            System.out.print("Enter item price: ");
            double price = scanner.nextDouble();
            if (price < 0) {
                System.out.println("Invalid price. Try again.");
            } else {
                total += price;
            }

            System.out.print("Add another item? (y/n): ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("y"));

        System.out.printf("Total amount: $%.2f%n", total);

        System.out.print("Enter amount paid: ");
        double paid = scanner.nextDouble();

        if (paid < total) {
            System.out.printf("Insufficient payment. You still owe $%.2f%n", (total - paid));
        } else {
            double change = paid - total;
            System.out.printf("Change: $%.2f%n", change);
        }

        scanner.close();
    }
}

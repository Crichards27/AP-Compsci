import java.util.Scanner;

public class PizzaPizza {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prices for menu items
        double plainPizzaPrice = 3.00;      // Price per slice of plain pizza
        double pepperoniPizzaPrice = 4.00;  // Price per slice of pepperoni pizza
        double wingsPrice = 8.00;           // Price per order of buffalo wings

        // Display menu
        System.out.println("------------ WELCOME TO MARIO’S PIZZA! ------------");
        System.out.println("Menu:");
        System.out.println("Plain pizza .............. $" + plainPizzaPrice + " per slice");
        System.out.println("Pepperoni pizza .......... $" + pepperoniPizzaPrice + " per slice");
        System.out.println("Buffalo wings ............ $" + wingsPrice + " per order");
        System.out.println("---------------------------------------------------");

        // ---- Take the customer's order ----
        System.out.print("How many slices of plain pizza would you like? ");
        int plainSlices = input.nextInt();  // Number of plain pizza slices ordered

        System.out.print("How many slices of pepperoni pizza would you like? ");
        int pepperoniSlices = input.nextInt();  // Number of pepperoni pizza slices ordered

        System.out.print("How many orders of buffalo wings would you like? ");
        int wingOrders = input.nextInt();   // Number of buffalo wings orders

        // ---- Calculate subtotal ----
        double subtotal = (plainSlices * plainPizzaPrice) +
                          (pepperoniSlices * pepperoniPizzaPrice) +
                          (wingOrders * wingsPrice);

        // ---- Check for high school student discount ----
        System.out.print("Are you a high school student (Y/N)? ");
        String student = input.next();
        double discount = 0.0;

        // Apply 15% discount if student and subtotal >= $20
        if (student.equalsIgnoreCase("Y") && subtotal >= 20.0) {
            discount = subtotal * 0.15;
        }

        double totalAfterDiscount = subtotal - discount;

        // Display subtotal after discount
        System.out.printf("Your total is: $%.2f%n", totalAfterDiscount);

        // ---- Ask about tip ----
        System.out.print("Would you like to leave a tip (Y/N)? ");
        String tipResponse = input.next();

        double finalTotal = totalAfterDiscount;

        if (tipResponse.equalsIgnoreCase("Y")) {
            System.out.print("Thank you! What percent tip? ");
            double tipPercent = input.nextDouble();             // Get tip percentage
            double tipAmount = totalAfterDiscount * (tipPercent / 100); // Calculate tip
            finalTotal += tipAmount;                            // Add tip to final total
        }

        System.out.printf("Your total bill, including tip: $%.2f%n", finalTotal);

        input.close();
    }
}

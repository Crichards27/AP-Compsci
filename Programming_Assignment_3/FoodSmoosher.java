import java.util.Scanner;

public class FoodSmoosher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter one of your favorite foods: ");
        String foodOne = scan.nextLine();

        System.out.print("Please enter another favorite food: ");
        String foodTwo = scan.nextLine();

        System.out.println("If you like " + foodOne + " and " + foodTwo +
                ", you have to try " + foodOne + " " + foodTwo + "!");

        scan.close();
    }
}

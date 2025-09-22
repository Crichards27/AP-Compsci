import java.util.Scanner;

public class CalcSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter the last number: ");
        int last = scanner.nextInt();

        int sum = 0;
        for (int i = first; i <= last; i++) {
            sum += i;
        }

        System.out.println("The sum of the numbers from " + first + " to " + last + " is " + sum + ".");

        /*
         * If "first" is greater than "last", the loop never executes.
         * That’s why the sum stays 0 — because the condition (i <= last) fails immediately.
         */

        scanner.close();
    }
}

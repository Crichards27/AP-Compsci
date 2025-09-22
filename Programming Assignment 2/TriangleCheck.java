import java.util.Scanner;

public class TriangleCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side a: ");
        int a = scanner.nextInt();
        System.out.print("Enter side b: ");
        int b = scanner.nextInt();
        System.out.print("Enter side c: ");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            
            int a2 = a * a, b2 = b * b, c2 = c * c;
            if (a2 + b2 == c2 || a2 + c2 == b2 || b2 + c2 == a2) {
                System.out.println("Right-angled triangle");
            } else {
                System.out.println("Non-right triangle");
            }

        } else {
            System.out.println("Not a triangle");
        }

        scanner.close();
    }
}

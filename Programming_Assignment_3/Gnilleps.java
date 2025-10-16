import java.util.Scanner;

public class Gnilleps {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();

        System.out.print("“" + myStr + "” spelled backwards is “");
        for (int i = myStr.length() - 1; i >= 0; i--) {
            System.out.print(myStr.charAt(i));
        }
        System.out.println("”");
    }
}

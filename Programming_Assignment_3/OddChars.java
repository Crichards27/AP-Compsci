import java.util.Scanner;
public class OddChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String myWord = scan.nextLine();

        System.out.print("Here’s every other letter: ");
        for (int i = 1; i < myWord.length(); i += 2) { 
            System.out.print(myWord.charAt(i));
        }
        System.out.println();
    }
}

public class FaveQuote {
    public static void main(String[] args) {
        String quote = "With all the different people in the club we all have different specialties, you can learn something new from anyone.";
        String author = "Connor Richards";

        System.out.println("\"" + quote + "\"");
        System.out.println("\t" + "- " + author + "\n");

        System.out.println("\"" + quote.toUpperCase() + "\"");

        System.out.println("First space: index " + quote.indexOf(" "));

        System.out.println("Length: " + quote.length() + " characters");
    }
}

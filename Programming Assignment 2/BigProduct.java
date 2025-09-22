public class BigProduct {
    public static void main(String[] args) {
        long product = 1;
        for (int i = 3; i <= 15; i += 3) {
            product *= i;
            System.out.println("Running product after multiplying " + i + " = " + product);
        }
        System.out.println("Final product = " + product);
    }
}

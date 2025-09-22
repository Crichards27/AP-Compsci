import java.util.Random;

public class PhoneNumbers {
    public static void main(String[] args) {
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            int areaCode = rand.nextInt(900) + 100;   // 100–999
            int prefix   = rand.nextInt(900) + 100;   // 100–999
            int line     = rand.nextInt(10000);       // 0000–9999

            String phone = String.format("%03d-%03d-%04d", areaCode, prefix, line);
            System.out.println(phone);
        }
    }
}

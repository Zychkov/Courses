import java.util.Random;
import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 1 ; i <= 1000; i++) {
            int unknownNumber = random.nextInt(100) + 1;
            System.out.println(unknownNumber);

        }
    }
}
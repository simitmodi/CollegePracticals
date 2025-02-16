import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        // Create Random object with seed 1000
        Random random = new Random(1000);

        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(49) + 1;

            System.out.print(randomNumber + " ");

            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
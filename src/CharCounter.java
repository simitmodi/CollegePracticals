import java.util.Scanner;

public class CharCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String userInput = input.nextLine();

        int[] count = new int[256];

        for (int i = 0; i < userInput.length(); i++) {
            char c = userInput.charAt(i);
            count[c]++;
        }

        System.out.println("Character Occurrences: ");
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                System.out.println((char)i + ":" + count[i]);
            }
        }
    }
}

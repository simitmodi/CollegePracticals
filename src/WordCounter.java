import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        String userInput = input.nextLine().trim();

        if (userInput.isEmpty()) {
            System.out.print("Number of words is: 0");
            return;
        }

        String[] words = userInput.split("\\s+");
        System.out.println("Number of Words: " + words.length);
    }
}

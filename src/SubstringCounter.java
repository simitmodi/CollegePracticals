import java.util.Scanner;

public class SubstringCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String mainStr = input.nextLine();

        System.out.print("Enter the Substring you want to find: ");
        String subStr = input.nextLine();

        int count = 0;
        int index = 0;

        while (index != -1) {
            index = mainStr.indexOf(subStr, index);
            if (index != -1) {
                count++;
                index += subStr.length();
            }
        }

        System.out.println("Substring " + subStr + " appears " + count + " times.");
    }
}

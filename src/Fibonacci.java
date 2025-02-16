import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number till which fibonacci needs to be printed: ");
        int num = input.nextInt();

        if (num <= 0) return;
        System.out.print("0 ");
        System.out.print("1 ");
        int first = 0, second = 1;
        while (first + second <= num) {
            int third = first + second;
            System.out.print(third+ " ");
            first = second;
            second = third;
        }
    }
}

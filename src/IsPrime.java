import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int num = input.nextInt();
        if (num <= 1) {
            System.out.print(num + " cannot be defined as prime or non-prime");
        }
        int i = 2;
        boolean isPrime = true;
        while (i*i <= num) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        if (isPrime) {
            System.out.print("Entered number is prime number");
        } else {
            System.out.print("Entered number is not prime number");
        }
    }
}

import java.util.Scanner;

public class GreaterNumberUsingNestedIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("Greatest is: "+ num1);
            } else {
                System.out.println("Greatest is: "+ num2);
            }
        } else {
            if (num2 > num3) {
                System.out.println("Greatest is: "+ num2);
            } else {
                System.out.println("Greatest is: "+ num3);
            }
        }
    }
}

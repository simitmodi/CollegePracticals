import java.util.Scanner;

public class GreatestNumberUsingTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        int greatest = (num1 > num2) ?((num1 > num3) ? num1:num3) : ((num2 > num3) ? num2 :num3);
        System.out.print("The greatest number is: "+ greatest);
    }
}

import java.util.Scanner;

class PowerCalculator {
    static int computePower(int x, int y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("x and y must be non-negative.");
        }
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter x: ");
            int x = sc.nextInt();
            System.out.print("Enter Power: ");
            int y = sc.nextInt();
            System.out.println("Result: " + computePower(x, y));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            System.out.println("Finally block: Resource cleanup (if needed).");
            sc.close();
        }
    }
}
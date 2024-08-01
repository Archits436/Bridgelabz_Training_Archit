import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            int result = 100 / n;
            System.out.println("Result is " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero is not allowed");
        } finally {
            System.out.println("The division is operation is complete");
        }
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the first integer: ");
            int n1 = sc.nextInt();
            System.out.println("Enter the second integer: ");
            int n2 = sc.nextInt();
            int result = n1 / n2;
            System.out.println("The integers can be divided");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
        } catch (InputMismatchException e) {
            System.out.println("Please enter integer values only");
        } finally {
            sc.close();
        }
    }
}
